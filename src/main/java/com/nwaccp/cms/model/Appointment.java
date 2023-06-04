package com.nwaccp.cms.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments", schema = "nwaccp")

/**
 * public class Appointment contains information about individual appointments
 * date -String
 * organization - String - name of organization making the appointments
 * number_of_cats - how many cats the organization will bring to the clinic, the number of appointments
 *
 */

public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name = "date_str")
	private String dateStr;
	
	@Column(name = "organization")
	private String organizationName;
	
	@Column(name = "number_of_cats")
	private Integer numberOfCats;
	
	
	public Appointment(){};
	
	public Appointment(long id, String dateStr,
			String organizationName, Integer numberOfCats) {
		super();
		this.id = id;
		this.dateStr = dateStr;
		this.organizationName = organizationName;
		this.numberOfCats = numberOfCats;		
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Integer getNumberOfCats() {
		return numberOfCats;
	}

	public void setNumberOfCats(Integer numberOfCats) {
		this.numberOfCats = numberOfCats;
	}

}
