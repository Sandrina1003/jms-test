package com.endava.application;

public class User {

	private int id;
	private String name;
	private String mail;
	private String ssn;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public String getSsn() {
		return ssn;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	public User(int id, String name, String address, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.mail = address;
		this.ssn = ssn;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
