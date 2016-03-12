//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: Todo.java
//	DATE:	3/12/2016
//	DESCRIPTION: The class is a simple to-do list
//				 with methods to perform different features
//				 classes and exceptions are used
//==========================================================

package com.cscc.csci2994.assignment1;

/**
 * A single todo item represented by a class
 * 
 * @author Chidi Emeh
 *
 */
public class Todo {

	private String title;
	private String description;
	private int priority;


	/**
	 * The constructor of the Todo
	 * 
	 * @param title	A string title of the todo
	 * @param description A description of the todo created
	 * @param priority	A number representing the priority of the todo
	 */
	public Todo(final String title, String description, int priority){

		this.title = title;
		this.description = description;
		this.priority = priority;
	}//End of Constructor

	public Todo(){
		
	}

	/**
	 * Gets the Title
	 * 
	 * @return the Title
	 */
	public String getTitle() {return title;}
	/**
	 * Gets the Description
	 * 
	 * @return the Description
	 */
	public String getDescription(){return description;}
	/**
	 * Gets the Priority
	 * 
	 * @return the priority
	 */
	public int getPriority() {return priority;}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return  title;
	}
	
}//End of Class Todo
