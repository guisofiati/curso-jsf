package github.guisofiati.contactslist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "userData", eager = true)
public class UserData implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Long number;
	private ArrayList<Contact> contacts = new ArrayList<Contact>(Arrays.asList(
			new Contact("João", 11999999999L),
			new Contact("Maria", 11888888888L)
	));
	
	public String addContact() {
		Contact contact = new Contact(name, number);
		contacts.add(contact);
		return "";
	}
	
	public String deleteContact(Contact contact) {
		contacts.remove(contact);
		return "";
	}
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getNumber() {
		return number;
	}
	
	public void setNumber(Long number) {
		this.number = number;
	}
}