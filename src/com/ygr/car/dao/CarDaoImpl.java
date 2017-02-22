package com.ygr.car.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ygr.car.model.Car;
import com.ygr.car.utils.HibernateUtil;

public class CarDaoImpl implements CarDao {
	private CarDaoImpl carDaoImpl;
	private SessionFactory sessionFactory;

	public void setCarDaoImpl(CarDaoImpl carDaoImpl) {
		this.carDaoImpl = carDaoImpl;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public static void main(String args[]) {

		 CarDaoImpl daoi = new CarDaoImpl();
		// ArrayList<Car> list = (ArrayList<Car>) daoi.showCar();
		// for (Car a : list) {
		// System.out.println("车子:" + a);
		// }
		
	}

	@Override
	public void addCar(Car car) {
		Session session = sessionFactory.getCurrentSession();
		// Session session =
		// HibernateUtil.GetSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(car);
		System.out.println("数据存储层----------------");
		session.getTransaction().commit();

	}

	@Override
	public ArrayList<Car> showCar() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Car");
		List<Car> list = query.list();
		session.getTransaction().commit();
		return (ArrayList<Car>) list;
	}

	@Override
	public void deleteCarbyId(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Car car=(Car) session.get(Car.class, id);
		session.delete(car);
		session.getTransaction().commit();	

	}

	@Override
	public Car getCarbyId(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Car AS c WHERE c.id=:id");
		query.setParameter("id", id);
		Car car=(Car) query.uniqueResult();
		session.getTransaction().commit();	
		return car;
	}

	@Override
	public void updateCar(Car car) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(car);
		session.getTransaction().commit();	
	}
	

}
