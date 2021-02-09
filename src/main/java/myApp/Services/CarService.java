package myApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myApp.Entities.Car;
import myApp.Repositories.CarRepository;

@Service
public class CarService {
	
  
	 private CarRepository carRepository;
	 
	 
	
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	
	public Car createNewCar(Car car) {
		return carRepository.save(car);
	}
	
	public Car getCarById(Long id ) {
		return carRepository.getOne(id);
	}
	
    
}
