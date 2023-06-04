package com.nwaccp.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwaccp.cms.model.AppointmentCountView;
import com.nwaccp.cms.repository.AppointmentCountViewRepository;

/**
 * 
 * public class AppointmentCountViewServiceImpl implements AppointmentCountViewService 
 * and contains the methods for the business logic involving AppointmentCountView
 *
 */

@Service
public class AppointmentCountViewServiceImpl implements AppointmentCountViewService{
	
	@Autowired
	private AppointmentCountViewRepository appointmentCountViewRepository;
	
	@Override
	public List < AppointmentCountView > getAllAppointmentCountViews() {		
		return appointmentCountViewRepository.findAll();
	}
	

	
    @Override
    public AppointmentCountView getAppointmentCountViewById(long id) {
        Optional < AppointmentCountView > optional = appointmentCountViewRepository.findById(id);
        AppointmentCountView appointmentCountView = null;
        if (optional.isPresent()) {
            appointmentCountView = optional.get();
        } else {
            throw new RuntimeException(" AppointmentCountView not found for id :: " + id);
        }
        return appointmentCountView;
    }

}
