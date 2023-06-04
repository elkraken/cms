package com.nwaccp.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nwaccp.cms.service.AppointmentCountViewService;
/**
 * 
 * @author laura
 * The AppointmentAccountViewController class has the method for displaying data 
 * about clinics on the home page
 */

@Controller
public class AppointmentCountViewController {
	
	@Autowired
    private AppointmentCountViewService appointmentCountViewService;
	/**
	 * @method viewHomePage -displays list of appointmentCountViews from the appointment_count
	 * view in the database
	 * @param model
	 * @return index Thyme Leaf template
	 */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listAppointmentCountView", appointmentCountViewService.getAllAppointmentCountViews());
        return "index";
    }

}
