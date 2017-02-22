package com.ygr.car.dao;

import java.util.List;

import com.ygr.car.model.Car;

public interface CarDao {
	Car getCarbyId(int id );
	
	void addCar(Car car);

	List<Car> showCar();
	
	
	void deleteCarbyId(int id);
	
	void updateCar( Car car);
}
