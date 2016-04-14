//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: Todo.java
//	DATE:	4/14/2016
//	DESCRIPTION: The class is a simple to-do list
//				 with methods to perform different features
//				 The class implements comparable interface.
//==========================================================

package com.cscc.csci2994.assignment2;

/**
 * A single todo item represented by a class
 * 
 * @author Chidi Emeh
 *
 */
public class Todo implements Comparable<Todo> {

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

	/**
	 * Default constructor
	 */
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
	public String toString() {
		return  title;
	}

	@Override
	public int compareTo(Todo secondTodo) {
		if (this.getPriority() > secondTodo.getPriority())
			return 1;
		else if (this.getPriority() < secondTodo.getPriority())
			return -1;
		else
		{
			int isSecondSmaller = this.getTitle().compareToIgnoreCase(secondTodo.getTitle());
			
			if(isSecondSmaller < 0){
				return -1;
			}
			else if(isSecondSmaller > 1){
				return 1;
			}
			
			else
				return 0;
		}
	}	
}//End of Class Todo
