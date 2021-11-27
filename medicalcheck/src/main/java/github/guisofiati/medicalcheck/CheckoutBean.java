package github.guisofiati.medicalcheck;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.PrimeFaces;

import github.guisofiati.medicalcheck.entities.Checkout;
import github.guisofiati.medicalcheck.entities.Doctor;

@ApplicationScoped
@ManagedBean(name = "checkoutBean")
public class CheckoutBean {
	
	private String fullName;
	private String doctorName;
	private String speciality;
	private String address;
	private Doctor doctor;
	private List<Doctor> doctors = new ArrayList<Doctor>();
	private List<String> doctorSpeciality = new ArrayList<String>();
	private List<String> doctorAddress = new ArrayList<String>();
	private Date date;
	private Checkout checkout;
	private List<Checkout> checkouts = new ArrayList<Checkout>();
	
	public void saveCheckout() {
		checkout = new Checkout();
		
		checkout.setPatient(fullName);
		checkout.setDoctor(doctorName);
		checkout.setSpeciality(speciality);
		checkout.setAddress(address);
		checkout.setDate(date);
		
		checkouts.add(checkout);
		message();
	}
	
	public void message() {
	    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Scheduled!", " Your checkout has been successfully scheduled");
	    PrimeFaces.current().dialog().showMessageDynamic(message);
	}
	
	public void changeFields(ValueChangeEvent e) {

		doctorSpeciality.clear();
		doctorAddress.clear();

		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getName().equalsIgnoreCase((String) e.getNewValue())) {
				doctorSpeciality.add(doctors.get(i).getSpeciality());
				doctorAddress.add(doctors.get(i).getAddress());
			}
		}

	}
	
	public CheckoutBean() {
		doctor = new Doctor("Pedro Ramos", "Cardiologista", "Street Java");
		doctors.add(doctor);

		doctor = new Doctor("Maria Antonieta", "Ortopedista", "Street Python");
		doctors.add(doctor);

		doctor = new Doctor("Ricardo Ferras", "Oftalmologista", "Street Cobol");
		doctors.add(doctor);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<String> getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(List<String> doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public List<String> getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(List<String> doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Checkout getCheckout() {
		return checkout;
	}

	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}

	public List<Checkout> getCheckouts() {
		return checkouts;
	}

	public void setCheckouts(List<Checkout> checkouts) {
		this.checkouts = checkouts;
	}
}