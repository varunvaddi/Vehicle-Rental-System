package com.cg.ovms.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="vehicle")
public class Vehicle {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer vehicleId;
	
	//@Autowired
	@OneToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private Driver driver;
	@Column(name="vehicleNumber")
	private String vehicleNumber;
	@Column(name="type")
	private String type;//car//bus
	@Column(name="category")
	private String category; //ac or nonac
	@Column(name="description")
	private String description;
	@Column(name="location")
	private String location;
	@Column(name="capacity")
	private String capacity;
	@Column(name="chargesPerKM")
	private Double chargesPerKM;
	@Column(name="fixedCharges")
	private Double fixedCharges;
	@OneToOne(mappedBy="vehicle",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Booking booking;
	
	public Vehicle() {
		
	}
	public Vehicle(Integer vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}
	public Vehicle(Driver driver, String vehicleNumber, String type, String category, String description,
			String location, String capacity, Double chargesPerKM, Double fixedCharges) {
		super();
		this.driver = driver;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.category = category;
		this.description = description;
		this.location = location;
		this.capacity = capacity;
		this.chargesPerKM = chargesPerKM;
		this.fixedCharges = fixedCharges;
	}
	public Vehicle(Integer vehicleId, Driver driver, String vehicleNumber, String type, String category,
			String description, String location, String capacity, Double chargesPerKM, Double fixedCharges) {
		super();
		this.vehicleId = vehicleId;
		this.driver = driver;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.category = category;
		this.description = description;
		this.location = location;
		this.capacity = capacity;
		this.chargesPerKM = chargesPerKM;
		this.fixedCharges = fixedCharges;
	}
	
	
	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public double getChargesPerKM() {
		return chargesPerKM;
	}

	public void setChargesPerKM(double chargesPerKM) {
		this.chargesPerKM = chargesPerKM;
	}

	public double getFixedCharges() {
		return fixedCharges;
	}

	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	@Override
	public String toString() {
		return "Vehicle[vehicleId="+vehicleId+",vehicleNumber="+vehicleNumber+",type="+type+",category="+category+",description="+description+",location="+location+",capacity="+capacity+",chargesPerKM="+chargesPerKM+",fixedCharges="+fixedCharges+"]";
	}
	
}
