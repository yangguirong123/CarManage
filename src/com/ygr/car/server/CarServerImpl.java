package com.ygr.car.server;

import java.util.ArrayList;

import com.ygr.car.dao.CarDao;
import com.ygr.car.dao.CarDaoImpl;
import com.ygr.car.model.Car;

public class CarServerImpl implements CarServer {
	private CarDao carDao;

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
	// CarDao carDao=new CarDaoImpl();

	public static void main(String agrs[]) {
		// CarServerImpl cs=new CarServerImpl();
		// ArrayList<Car> list=cs.showCar();
		// for(Car car:list){
		// System.out.println(car);
		// }
	}

	@Override
	public boolean addCar(Car car) {
		if(carDao.getCarbyId(car.getId())==null){
			carDao.addCar(car);
			return true;
		}else{
			return false;
		}
		

	}

	@Override
	public ArrayList<Car> showCar() {
		ArrayList<Car> list = (ArrayList<Car>) carDao.showCar();
		return list;
	}

	@Override
	public void deleteCarById(int id) {
		carDao.deleteCarbyId(id);
	}

	@Override
	public Car getCarByid(int id) {
		return carDao.getCarbyId(id);
	}

	@Override
	public void updateCar(Car car) {
		carDao.updateCar(car);
	}

}
