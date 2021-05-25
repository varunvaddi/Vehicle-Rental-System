package com.cg.ovms.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer paymentId;
	@Column(name="paymentMode")
	private String paymentMode;
	@Column(name="paymentDate")
	private LocalDate paymentDate;
	@OneToOne
	@JsonIgnore
	private Booking booking;
	@Column(name="paymentStatus")
	private String paymentStatus;
	
	public Payment() {
		
	}

	public Payment(Integer paymentId) {
		super();
		this.paymentId = paymentId;
	}

	public Payment(String paymentMode, LocalDate paymentDate, Booking booking, String paymentStatus) {
		super();
		this.paymentMode = paymentMode;
		this.paymentDate = paymentDate;
		this.booking = booking;
		this.paymentStatus = paymentStatus;
	}

	public Payment(Integer paymentId, String paymentMode, LocalDate paymentDate, Booking booking,
			String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.paymentDate = paymentDate;
		this.booking = booking;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Payment[paymentId="+paymentId+",paymentMode="+paymentMode+",paymentDate="+paymentDate+",paymentStatus="+paymentStatus+"]";
	}
	
}
