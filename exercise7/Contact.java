package com.chidiemeh.week7;

public class Contact {
	public String name;
	public String email;

	Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void displayDetails() {
	  System.out.println("Name: "+ this.name);
	  System.out.println("Email: "+ this.email);
	}

}
