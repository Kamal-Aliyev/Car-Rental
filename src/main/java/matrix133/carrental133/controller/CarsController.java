package matrix133.carrental133.controller;

import matrix133.carrental133.dto.CarDto;
import matrix133.carrental133.entity.Car;
import matrix133.carrental133.exceptionHandler.CarAlreadyExistException;
import matrix133.carrental133.exceptionHandler.CarNotFoundException;
import matrix133.carrental133.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarService service;

    @GetMapping("/get-car")
    public Car getCarByID(@RequestParam("id") Long id) throws CarNotFoundException {
        return service.getCarByID(id);
    }

    @PostMapping("/add-car")
    public Car insertCar(@Valid @RequestBody CarDto car) throws CarAlreadyExistException{
        return service.insertCar(car);
    }

    @PutMapping("/update-car")
    public Car updateCarById(@Valid @RequestBody CarDto car) throws CarNotFoundException {

        return service.updateCarNameAndPriceByID(car);
    }

    @DeleteMapping("/delete-car")
    public void deleteCarById(@RequestParam("id") Long id) throws Exception {
        service.deleteCarByID(id);
    }



}
