package at.wertal.db.test;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the login_user database table.
 * 
 */
@Entity
@Table(name="login_user")
@NamedQuery(name="LoginUser.findAll", query="SELECT l FROM LoginUser l")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String city;

	@Column(name="create_time")
	private Timestamp createTime;

	private String email;

	private String password;

	private String username;

	public LoginUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}