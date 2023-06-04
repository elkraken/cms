package com.nwaccp.cms.model;

import java.sql.Date;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment_count", schema = "nwaccp")
/**
 * The AppointmentCountView class is for data about clinics, number of appointments, 
 * and the number of remaining appointments. This data is stored in the appointment_count view in the database.
 * 
 * date - String
 * capacity - integer - maximum number of appointments for a clinic
 * total_cats - number of cats/appointments reserved for a clinic
 * open_appointments - number of open appointments remaining in a clinic
 *
 */

public class AppointmentCountView {
	
	@Id
	@Column(name = "clinic_date")
	private String date;
	
	@Column(name= "capacity")
	private int capacity;
	
	@Column(name = "total_cats")
	private int totalCats;
	
	@Column(name = "open_appointments")
	private int remainingAppointments;
	
	public AppointmentCountView(String date, int capacity, int totalCats, int remainingAppointments) {
	super();
	this.date = date;
	this.capacity = capacity;
	this.totalCats = totalCats;
	this.remainingAppointments = remainingAppointments;
	}

	public AppointmentCountView() {};
	
	public String getDate() {
		return date;
	}


	public int getCapacity() {
		return capacity;
	}

	public int getTotalCats() {
		return totalCats;
	}

	public int getRemainingAppointments() {
		return remainingAppointments;
	}
	

}
