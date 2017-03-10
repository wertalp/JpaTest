package at.wertal.db.test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COURT database table.
 * 
 */
@Entity
@NamedQuery(name="Court.findAll", query="SELECT c FROM Court c")
public class Court implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCOURT;

	private int nummer;

	private int price;

	private String surface;

	public Court() {
	}

	public int getIdCOURT() {
		return this.idCOURT;
	}

	public void setIdCOURT(int idCOURT) {
		this.idCOURT = idCOURT;
	}

	public int getNummer() {
		return this.nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSurface() {
		return this.surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

}