package com.nwaccp.cms.service;

import java.util.List;
import com.nwaccp.cms.model.AppointmentCountView;


/**
 * 
 * public interface AppointmentCountViewService contains the methods for the 
 * business logic involving AppointmentCountView
 *
 */
public interface AppointmentCountViewService {
	List<AppointmentCountView> getAllAppointmentCountViews();
    AppointmentCountView getAppointmentCountViewById(long id);

}
