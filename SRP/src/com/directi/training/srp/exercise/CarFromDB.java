package com.directi.training.srp.exercise;

import java.util.*;

public class CarFromDB {
	
	private List<Car> _carsDb = Arrays
	        .asList(new Car("1", "Golf III", "Volkswagen"),
	        	new Car("2", "Multipla", "Fiat"),
	            new Car("3", "Megane", "Renault"));
	
	public Car getFromDb(String carId) {
		for (Car car : _carsDb) {
	            if (car.getId().equals(carId)) {
	                return car;
	            }
	        }
	        return null;
	}
	
	 public List<Car> findAllCars() {
	        return new ArrayList<>(_carsDb);
	    }
}
