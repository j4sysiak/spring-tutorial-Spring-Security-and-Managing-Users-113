package pl.jaceksysiak.spring.web.dao;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import pl.jaceksysiak.spring.web.validation.ValidEmail;

import com.sun.istack.internal.NotNull;

public class Offer {
	
	private int id;
	 
	@Size(min=2, max=100)
	private String name;
	
	//@NotNull
	//@ValidEmail(min=2)
	private String email;
	
	@Size(min=2, max=255)
	private String text;
	
	public Offer() {}

	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}

}
