package controller;

import java.util.List;

import at.wertal.db.test.Car;

public class DatabaseController {

	private List<Car> carlist ;
	
	
	public DatabaseController(List<Car> carlist) {
		super();
		this.carlist = carlist;
	}




	public List<Car> getallXXX(String listname) {
		return this.carlist ;
	}
}
