package com.ygr.car.server;

import java.util.ArrayList;

import com.ygr.car.model.Car;

public interface CarServer {
	boolean addCar(Car car);
	ArrayList<Car> showCar();
	void deleteCarById(int id);
	Car getCarByid(int id);
	void updateCar(Car car);
}
