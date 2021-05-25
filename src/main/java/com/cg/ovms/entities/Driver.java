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
@Table(name="driver")
public class Driver {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer driverId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="contactNumber")
	private String contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="chargesPerDay")
	private Double chargesPerDay;
	@Column(name="licenseNo")
	private String licenseNo;
	@OneToOne(mappedBy="driver",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Vehicle vehicle;
	
	

	public Driver() {
		super();
	}



	public Driver(Integer driverId, String firstName, String lastName, String contactNumber, String email,
			String address, Double chargesPerDay, String licenseNo, Vehicle vehicle) {
		super();
		this.driverId = driverId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.chargesPerDay = chargesPerDay;
		this.licenseNo = licenseNo;
		this.vehicle = vehicle;
	}



	public Integer getDriverId() {
		return driverId;
	}



	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
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



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Double getChargesPerDay() {
		return chargesPerDay;
	}



	public void setChargesPerDay(Double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}



	public String getLicenseNo() {
		return licenseNo;
	}



	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	@Override
	public String toString() {
		return "Driver[driverId="+driverId+",firstName="+firstName+",lastName="+lastName+",contactNumber="+contactNumber+",email="+email+",address="+address+",chargerPerDay="+chargesPerDay+",licenseNo="+licenseNo+"]";
	}
	
}
