package matrix133.carrental133.service;

import matrix133.carrental133.dto.CarDto;
import matrix133.carrental133.entity.Car;
import matrix133.carrental133.exceptionHandler.CarAlreadyExistException;
import matrix133.carrental133.exceptionHandler.CarNotFoundException;
import matrix133.carrental133.repository.CarRepository;
import org.hibernate.criterion.NotNullExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository repository;

    public Car insertCar(CarDto car) throws CarAlreadyExistException{

        if (repository.findCarById(car.getId()) != null)
            throw new CarAlreadyExistException("This car id  already exist : name = " + car.getName());

        Car carEntity = Car
                .builder()
                .name(car.getName())
                .price(car.getPrice())
                .build();
        return repository.save(carEntity);
    }

    public Car getCarByID(Long id) throws CarNotFoundException {
        return repository.findCarById(id).orElseThrow(CarNotFoundException::new);
    }

    public Car updateCarNameAndPriceByID(CarDto car) throws CarNotFoundException {
        Car car1 = repository.findCarById(car.getId()).orElseThrow(
                () -> new CarNotFoundException("Not found Tutorial with name = " + car.getName()) );
        car.setName(car.getName());
        car.setPrice(car.getPrice());
        return repository.save(car1);
    }

    public void deleteCarByID(Long id) throws Exception {
        Car car = repository.findCarById(id).orElseThrow(Exception::new);
        repository.delete(car);

    }
}
