package myApp.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import myApp.Entities.Car;


public interface  CarRepository extends  JpaRepository<Car, Long> {

	
}
