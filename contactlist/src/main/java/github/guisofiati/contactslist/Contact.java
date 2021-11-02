package github.guisofiati.contactslist;

public class Contact {
	
	private String name;
	private Long number;
	
	public Contact(String name, Long number) {
		this.name = name;
		this.number = number;
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