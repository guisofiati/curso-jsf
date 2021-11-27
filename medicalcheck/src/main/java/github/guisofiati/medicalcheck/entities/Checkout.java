package github.guisofiati.medicalcheck.entities;

import java.util.Date;

public class Checkout {
	
	private String patient;
	private String doctor;
	private String speciality;
	private String address;
	private Date date;
	
	public Checkout() {
	}

	public Checkout(String patient, String doctor, String speciality, String address, Date date) {
		this.patient = patient;
		this.doctor = doctor;
		this.speciality = speciality;
		this.address = address;
		this.date = date;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}