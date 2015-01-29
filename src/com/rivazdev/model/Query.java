package com.rivazdev.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the query database table.
 * 
 */
@Entity
@NamedQuery(name="Query.findAll", query="SELECT q FROM Query q")
public class Query implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="category_id")
	private String categoryId;

	private byte closed;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String email;

	private String message;

	private String name;

	private String phone;

	public Query() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public byte getClosed() {
		return this.closed;
	}

	public void setClosed(byte closed) {
		this.closed = closed;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}