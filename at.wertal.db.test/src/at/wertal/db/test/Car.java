package at.wertal.db.test;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.* ;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Car
 *
 */

@Entity
public class Car implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Date getManufactured() {
		return manufactured;
	}


	public void setManufactured(Date manufactured) {
		this.manufactured = manufactured;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private int  number;
	private String Name;
	private Date manufactured ;
	

	public Car() {
		super();
	}
   
}
