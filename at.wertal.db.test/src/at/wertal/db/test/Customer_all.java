package at.wertal.db.test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Customer_all database table.
 * 
 */
@Entity
@NamedQuery(name="Customer_all.findAll", query="SELECT c FROM Customer_all c")
public class Customer_all implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String city;

	private String email;

	private String nachname;

	private String plz;

	private String street;

	private String telefon;

	@Column(name="url_path")
	private String urlPath;

	private String vorname;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="customerAll")
	private List<User> users;

	public Customer_all() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getPlz() {
		return this.plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getUrlPath() {
		return this.urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setCustomerAll(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setCustomerAll(null);

		return user;
	}

}