package at.wertal.db.test;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Club database table.
 * 
 */
@Entity
@NamedQuery(name="Club.findAll", query="SELECT c FROM Club c")
public class Club implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String clubimg;

	private String clubname;

	private String contact;

	private String description;

	private String email;

	private String status;

	private String tel;

	@Column(name="website_url")
	private String websiteUrl;

	public Club() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClubimg() {
		System.out.println("Jepp so gehts");
		return this.clubimg;
	}

	public void setClubimg(String clubimg) {
		System.out.println("Jepp so gehts");
		System.out.println("there we go");
		this.clubimg = clubimg;
	}

	public String getClubname() {
		return this.clubname;
	}

	public void setClubname(String clubname) {
		this.clubname = clubname;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

}