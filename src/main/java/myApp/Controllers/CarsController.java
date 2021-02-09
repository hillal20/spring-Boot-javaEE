package myApp.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.net.SocketFlow.Status;
import myApp.Car;

@RestController
@RequestMapping("/cars")
public class CarsController {
	
	
	
	@GetMapping("/allCars")
	private ResponseEntity<?> getAllCars(){
		 List<Car> cars = new ArrayList<>();
		return new ResponseEntity<>( cars, HttpStatus.OK);
		
	}


}
