package com.ygr.car.model;

public class Car {
	private int id;
	private String carNumber;//车牌号
	private String carName;//车名
	private String persenName;//客户姓名
	private String telephone;//电话
	private String address;//地址
	
	public Car(){
		
	}
	public Car(int id,String carNumber, String carName, String persenName, String telephone, String address) {
		this.id=id;
		this.carNumber = carNumber;
		this.carName = carName;
		this.persenName = persenName;
		this.telephone = telephone;
		this.address = address;
	}
	public Car(String carNumber, String carName, String persenName, String telephone, String address) {
		
		this.carNumber = carNumber;
		this.carName = carName;
		this.persenName = persenName;
		this.telephone = telephone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "汽车：[id=" + id + ", carName=" + carName + ", persenName=" + persenName + ", telephone=" + telephone + ", address="
				+ address + ", carNumber=" + carNumber + "]";
	}
	
}
