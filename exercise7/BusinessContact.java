package com.chidiemeh.week7;

public class BusinessContact extends Contact {

	String phone;
	
	public BusinessContact(String name, String email, String phone) {
		super(name, email);
		this.phone = phone;
	}
	
	public void displayDetails() {
		  System.out.println("Name: "+ this.name);
		  System.out.println("Email: "+ this.email);
		  System.out.println("Phone: "+ this.phone);
	}

}
