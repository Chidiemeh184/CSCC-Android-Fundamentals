//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: Contacts.java
//DATE:	4/12/2016
//DESCRIPTION: Exercise 10
//				This class demonstrates the use of the
//				iterable interaface in custom classes
//==========================================================

package com.chidiemeh.week11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Chidi Emeh
 *
 * @param <Contact> Takes the type of class Contact
 */
@SuppressWarnings("hiding")
public class Contacts<Contact> implements Iterable<Contact>{
	
	private ArrayList<Contact> storage;


	/**
	 * Constructor for the class
	 */
	public Contacts() {
		this.storage = new ArrayList<Contact>(); 
	}

	/**
	 * @param item ; Adds item of type Contact to class storage
	 */
	public void addContact(Contact item){
		this.storage.add(item);
	}
	
	
	/**
	 * @return returns an Arraylist of type Contact
	 */
	public ArrayList<Contact> getContacts(){
		return storage;
	}
	
	@Override
	public Iterator<Contact> iterator() {
		return new ContactIterator<Contact>(this);
	}
}


@SuppressWarnings("hiding")
class ContactIterator<Contact> implements Iterator<Contact> {
	
	private ArrayList<Contact> store;
	private int position;
	
	
	public ContactIterator(Contacts<Contact> contacts) {
		this.store = contacts.getContacts();
	}

	@Override
	public boolean hasNext() {
		if(position < store.size()){
			return true;
		}
		else{
			return false;
		}	
	}

	@Override
	public Contact next() {
		Contact singleContact = store.get(position);
		position++;
		return singleContact;
	}
	
	public void remove(){
		store.remove(position);
	}
	
}





