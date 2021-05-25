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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="mobileNumber")
	private String mobileNumber;
	@Column(name="emailId")
	private String emailId;
	@Column(name="address")
	private String address;
	@OneToOne(mappedBy="customer",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Booking booking;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private User user;
	
	

	public Customer(Integer customerId, String firstName, String lastName, String mobileNumber, String emailId,
			String address, Booking booking, User user) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
		this.booking = booking;
		this.user = user;
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Customer[customerId="+customerId+",firstName="+firstName+",lastName="+lastName+",mobileNumber="+mobileNumber+",emailId="+emailId+",address="+address+"]";
	}
	
}
