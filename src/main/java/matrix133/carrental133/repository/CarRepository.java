package matrix133.carrental133.repository;

import matrix133.carrental133.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends CrudRepository<Car,Long> {
        Car findCarByPrice (Double price);
        Optional<Car> findCarById (Long id);
}
