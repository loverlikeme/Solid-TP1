package com.directi.training.srp.exercise;

public class CarManager
{
    private CarFromDB _carFromDB;
    private CarIdentity _carIdentity;
    private CarReview _carReview;
    
    public CarManager(CarFromDB carFromDB, CarIdentity carIdentity, CarReview carReview) {
    	_carFromDB =carFromDB;
    	_carIdentity= carIdentity;
    	_carReview = carReview;
    }

    public Car getFromDb(final String carId)
    {
    	return _carFromDB.getFromDb(carId);
    }

    public String getCarsNames()
    {
    	return _carIdentity.getCarsNames(_carFromDB.findAllCars());
    }

    public Car getBestCar()
    {
    	return _carReview.getBestCar(_carFromDB.findAllCars());
    }
}
