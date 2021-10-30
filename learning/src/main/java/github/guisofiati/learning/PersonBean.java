package github.guisofiati.learning;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "personBean")
public class PersonBean {
	
	private String name;
	private String country;
	private String state;
	private Integer age;
	private String email;
	private String password;
	
	private String[] pessoas = {"Fernando", "Fabricio"};
	
	private List<String> names = new ArrayList<String>();
	
	public String addName() {
		names.add(name);
		return "";
	}
	
	public String countAge() {
		age = age + 1;
		return "";
	}
	
	public String[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(String[] pessoas) {
		this.pessoas = pessoas;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}