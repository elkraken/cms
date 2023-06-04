package com.nwaccp.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nwaccp.cms.model.Appointment;

/**
 * 
 * @public interface AppointmentRepository provides the connection to the database for the 
 * AppointmentService
 *
 */
@Repository
public interface AppointmentRepository  extends JpaRepository <Appointment, Long>{
	
	

}



