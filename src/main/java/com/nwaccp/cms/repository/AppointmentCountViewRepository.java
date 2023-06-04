package com.nwaccp.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nwaccp.cms.model.AppointmentCountView;

/**
 * 
 * @public interface AppointmentCountRepository provides the connection to the database for the 
 * AppointmentCountViewService
 *
 */
@Repository
public interface AppointmentCountViewRepository extends JpaRepository <AppointmentCountView, Long>{

}
