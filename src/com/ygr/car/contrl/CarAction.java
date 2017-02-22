package com.ygr.car.contrl;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ygr.car.dao.CarDaoImpl;
import com.ygr.car.model.Car;
import com.ygr.car.server.CarServer;

public class CarAction extends ActionSupport implements RequestAware, ModelDriven<Car> {
	private Car car = new Car();
	private Map<String, Object> requestMap;
	private CarServer carServer;

	private String carNumber;// 车牌号
	private String carName;// 车名
	private String persenName;// 客户姓名
	private String telephone;// 电话
	private String address;// 地址

	public static void main(String args[]) {
//		CarAction ca = new CarAction();
//		ca.show();
	}

	public String add() {
		if(car.getId() == 0){ //添加
			if(carServer.addCar(car)){
				return SUCCESS;
			}else{
				return INPUT;
			}
		}else{
			carServer.updateCar(car);
			return SUCCESS;
		}
	}

	public String show() {
		ArrayList<Car> list = carServer.showCar();
		requestMap.put("carLists", list);
		return "list";
	}

	public String delete() {
		int id = (int) requestMap.get("id");
		carServer.deleteCarById(id);
		return SUCCESS;

	}
	public String update(){
		int id = (int) requestMap.get("id");
		Car carr=carServer.getCarByid(id);
		requestMap.put("car", carr);
		return INPUT;
	}
	

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getPersenName() {
		return persenName;
	}

	public void setPersenName(String persenName) {
		this.persenName = persenName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public Car getModel() {
		return car;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		requestMap = request;

	}

	public void setCarServer(CarServer carServer) {
		this.carServer = carServer;
	}
}
