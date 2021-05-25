package com.cg.ovms.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	
	
	@OneToOne(mappedBy="user",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Customer customer;
	
	public User(Integer userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}


	public User() {
		super();
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public User(Integer userId, String password, String role, Customer customer) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}


	
	
}
