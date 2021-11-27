package github.guisofiati.medicalcheck.entities;

public class Doctor {
	
	private String name;
	private String speciality;
	private String address;
	
	public Doctor() {
	}

	public Doctor(String name, String speciality, String address) {
		this.name = name;
		this.speciality = speciality;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}