package com.nwaccp.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nwaccp.cms.model.Appointment;
import com.nwaccp.cms.service.AppointmentService;
/**
 * 
 * @author Laura MacCracken
 * The AppointmentContoller class provides the methods to present data in a web browser.
 *
 */

@Controller
public class AppointmentController {
	
	@Autowired
    private AppointmentService appointmentService;

    // display list of appointments
    /**
     * @method viewHomePage - presents a list of appointments
     * @param model 
     * @returns appointment_list ThymeLeaf template with a list of appointments
     */
    @GetMapping("/listAppointment")
    public String viewHomePage(Model model) {
        model.addAttribute("listAppointments", appointmentService.getAllAppointments());
        return "appointment_list";
    }
	/**
	 * @method showNewAppointmentForm - shows a form to add an appointment and gets data about appointment
	 * @param model
	 * @return new_appointment ThymeLeaf template with a list of appointments
	 */
    @GetMapping("/showNewAppointmentForm")
    public String showNewAppointmentForm(Model model) {
        // create model attribute to bind form data
        Appointment appointment = new Appointment();
        model.addAttribute("appointment", appointment);
        return "new_appointment";
    }
    /**
     * @method saveAppointment - saves data from form
     * @param appointment
     * @return redirects to appointment_list
     */
    @PostMapping("/saveAppointment")
    public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {
        // save appointment to database
        appointmentService.saveAppointment(appointment);
        return "redirect:/listAppointment";
    }
    /**
     * @method showFormForUpdate - shows form for updating existing appointments
     * @param id
     * @param model
     * @return update_appointment ThymeLeaf template
     */
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get appointment from the service
        Appointment appointment = appointmentService.getAppointmentById(id);

        // set appointment as a model attribute to pre-populate the form
        model.addAttribute("appointment", appointment);
        return "update_appointment";
    }
    /**
     * @method deleteAppointment - form for deleting an appointment from the list
     * @param id
     * @return redirects to the appointment_list Thyme Leaf template
     */
    @GetMapping("/deleteAppointment/{id}")
    public String deleteAppointment(@PathVariable(value = "id") long id) {

        // call delete appointment method 
        this.appointmentService.deleteAppointmentById(id);
        return "redirect:/listAppointment";
    }

}
