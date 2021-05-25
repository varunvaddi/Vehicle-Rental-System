package com.cg.ovms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Driver;

@Repository
public interface IDriverRepository extends JpaRepository<Driver,Integer>{
	
}