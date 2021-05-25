package com.cg.ovms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Driver;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.User;
import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.repository.IBookingRepository;
import com.cg.ovms.repository.ICustomerRepository;
import com.cg.ovms.repository.IDriverRepository;
import com.cg.ovms.repository.IPaymentRepository;
import com.cg.ovms.repository.IUserRepository;
import com.cg.ovms.repository.IVehicleRepository;


@SpringBootApplication
public class VehicleRentalAppApplication implements CommandLineRunner {
@Autowired
private IUserRepository userRepository;
@Autowired
private ICustomerRepository customerRepository;
@Autowired
private IBookingRepository bookingRepository;
@Autowired
private IVehicleRepository vehicleRepository;
@Autowired
private IDriverRepository driverRepository;
@Autowired
private IPaymentRepository paymentRepository;


	public static void main(String[] args) {
		SpringApplication.run(VehicleRentalAppApplication.class, args);
		System.out.println("Vehicle Rental System main method executed");
		
	}
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Inside run");
		User u=new User();
		u.setUserId(1);
		u.setPassword("Ak12");
		u.setRole("Student");
		userRepository.save(u);
		
		Customer c=new Customer();
		c.setCustomerId(7);
		c.setFirstName("Akhila");
		c.setLastName("Vemuru");
		c.setEmailId("ak@gmail.com");
		c.setMobileNumber("8765432109");
		c.setAddress("hyderabad");
		c.setCustomerId(7);
        		
		customerRepository.save(c);
		Booking b=new Booking();
		b.setBookingId(9);
		b.setDistance(95.86);
		b.setCustomer(c);

		bookingRepository.save(b);
		c.setBooking(b);

		Driver d=new Driver();
		d.setDriverId(75);
		d.setFirstName("ram");
		d.setLastName("hkdsk");
		d.setContactNumber("982346");
		d.setEmail("ram@gmail.com");
		d.setAddress("shankarpally");
		d.setChargesPerDay(1000.78);
	    d.setLicenseNo("A1010");
		
		Vehicle v=new Vehicle();
		v.setVehicleId(8);
		v.setCategory("car");
		v.setBooking(b);
		b.setVehicle(v);
	    d.setVehicle(v);
        v.setDriver(d);
		

		Payment p=new Payment();
		p.setPaymentId(9);
		p.setPaymentMode("gpay");
	    p.setBooking(b);
		
		
		paymentRepository.save(p);
		vehicleRepository.save(v);

		driverRepository.save(d);

	}

}
