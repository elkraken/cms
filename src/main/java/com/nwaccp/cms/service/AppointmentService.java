package com.nwaccp.cms.service;

import java.util.List;
import com.nwaccp.cms.model.Appointment;

/**
 * 
 * public interface AppointmentService contains the methods for the 
 * business logic involving Appointment
 *
 */

public interface AppointmentService {
	List<Appointment> getAllAppointments();
	void saveAppointment(Appointment appointment);
    Appointment getAppointmentById(long id);
    void deleteAppointmentById(long id);

}
