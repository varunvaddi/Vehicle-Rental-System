package com.cg.ovms.entities;

import java.time.LocalDate;

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
@Table(name="booking")
public class Booking {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookingId;
	
	//@Autowired
	@OneToOne
	@JsonIgnore
	private Customer customer;
	
	//@Autowired
	@OneToOne
	@JsonIgnore
	private Vehicle vehicle;
	@Column(name="bookingDate")
	private LocalDate bookingDate;
	@Column(name="bookedTillDate")
	private LocalDate bookedTillDate;
	@Column(name="bookingDescription")
	private String bookingDescription;
	@Column(name="totalCost")
	private Double totalCost;
	@Column(name="distance")
	private Double distance;
	@OneToOne(mappedBy="booking",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Payment payment;
	
	public Booking() {
		
	}

	public Booking(Integer bookingId) {
		super();
		this.bookingId = bookingId;
	}

	public Booking(Customer customer, Vehicle vehicle, LocalDate bookingDate, LocalDate bookedTillDate,
			String bookingDescription, Double totalCost, Double distance) {
		super();
		this.customer = customer;
		this.vehicle = vehicle;
		this.bookingDate = bookingDate;
		this.bookedTillDate = bookedTillDate;
		this.bookingDescription = bookingDescription;
		this.totalCost = totalCost;
		this.distance = distance;
	}

	public Booking(Integer bookingId, Customer customer, Vehicle vehicle, LocalDate bookingDate,
			LocalDate bookedTillDate, String bookingDescription, Double totalCost, Double distance) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.vehicle = vehicle;
		this.bookingDate = bookingDate;
		this.bookedTillDate = bookedTillDate;
		this.bookingDescription = bookingDescription;
		this.totalCost = totalCost;
		this.distance = distance;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getBookedTillDate() {
		return bookedTillDate;
	}

	public void setBookedTillDate(LocalDate bookedTillDate) {
		this.bookedTillDate = bookedTillDate;
	}

	public String getBookingDescription() {
		return bookingDescription;
	}

	public void setBookingDescription(String bookingDescription) {
		this.bookingDescription = bookingDescription;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Booking[bookingId="+bookingId+",bookingDate="+bookingDate+",bookedTillDate="+bookedTillDate+",bookingDescription="+bookingDescription+",totalCost="+totalCost+"distance="+distance+"]";
	}
	
}
