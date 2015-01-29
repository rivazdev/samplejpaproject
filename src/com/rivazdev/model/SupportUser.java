package com.rivazdev.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the support_user database table.
 * 
 */
@Entity
@Table(name="support_user")
@NamedQuery(name="SupportUser.findAll", query="SELECT s FROM SupportUser s")
public class SupportUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="login_date")
	private Date loginDate;

	public SupportUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

}