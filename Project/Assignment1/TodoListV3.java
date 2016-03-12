//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: TodoListV3.java
//	DATE:	3/12/2016
//	DESCRIPTION: The class is a simple to-do list
//				 with methods to perform different features
//				 classes and exceptions are used
//==========================================================

package com.cscc.csci2994.assignment1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * The TodoListV2 app is a program that allows a user to add, remove, edit, and list to-do items
 * Individual to-do items is represented by the Todo class and allows
 * a title, description, and priority to be tracked with each to-do item.  
 * Priority is specified using a numeric value between 0 and 5 where 5
 * indicates high priority and 0 indicates low priority.
 * 
 * @author Chidi Emeh
 *
 */
public class TodoListV3 {
		
	//Holds all the todos
	private static ArrayList<Todo> todoContainer = new ArrayList<Todo>();
	//private static Scanner scanner = new Scanner(System.in);
	private static String userInput = " ";



	
	/**
	 * Entry point of the program
	 * 
	 * @param args not used by the program
	 */
	public static void main(String[] args){
		do{
			displayTheMainMenuAtStartScreen();

			switch (userInput){
				case "1":
					addTask();
					break;
				case "2":
					removeTask();
					break;
				case "3":
					updateTask();
					break;
				case "4":
					listAllTasks();
					break;	
				case "5":
					listAllTasksOfCertainPriority();
					break;
			}
			
		}while(!userInput.equals("0"));
	}//End of Main
	
	
	private static void listAllTasksOfCertainPriority() {
		Scanner scanner = new Scanner(System.in);
		
		
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
        	try {
        		System.out.println(" Enter a priority");
        		int theTaskByPriority = scanner.nextInt();
        		
        		
        		
        		for(Todo item: todoContainer){
                     int theIndex = item.getPriority();
                    	if (theIndex == theTaskByPriority){
                    		userEnteredWrongInput = false;
                    		System.out.println("Task Index: "+ todoContainer.indexOf(item) + " Name: "+ item.getTitle()
        		               + ", Description: "+item.getDescription()
        		               + ", Priority: " + item.getPriority());
                    	}
                    	else{
                    		throw new Exception();
                    	}
        		}
        		
        	}
        	catch(Exception e){
    			System.out.println(" ");
    			System.out.println("Error: Priority not found!");
    			System.out.println("Please check the value entered for priority.");

        	}
        }
		

	}//End of listAllTasksOfCertainPriority


	private static void listAllTasks() {
		
		for(Todo item : todoContainer){
			
			System.out.println("Task Index: "+ todoContainer.indexOf(item) + " Name: "+ item.getTitle() + ", Description: "
					+item.getDescription() + ", Priority: " + item.getPriority());
			
		}

	}//End of listAllTasks


	private static void updateTask() {
		Scanner scanner = new Scanner(System.in);
		
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
        	try {
        		
    			System.out.println(" Enter the index of the task to update");
    			int theIndexOfTheTodoToUpdate = Integer.parseInt(scanner.nextLine());
    			

    				int eachIndex = todoContainer.size();
    				if ((theIndexOfTheTodoToUpdate < (eachIndex-1))||(theIndexOfTheTodoToUpdate > (eachIndex-1))){
    					throw new ArrayIndexOutOfBoundsException();
    				}
    						
    			System.out.println(" Enter new name: ");
    			String newTitle = scanner.nextLine();
    			System.out.println(" Enter new description: ");
    			String newDescription = scanner.nextLine();
    			System.out.println("Enter new priority: ");
    			int newPriority =scanner.nextInt();
    			Todo updatedOne = new Todo(newTitle, newDescription, newPriority);
    			todoContainer.set(theIndexOfTheTodoToUpdate, updatedOne);
    			userEnteredWrongInput = false;
    			System.out.println(" Todo has been updated!");	
    		}
    		catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("The index does not exist");
    			System.out.println("Please check the values entered.");

    		}
    		catch(IllegalArgumentException e){
    			System.out.println("Please check the values entered.");
    			System.out.println("Enter String for name and description, and int for priority");
    		}
        }
		
		
		
	}//End of updateTask

	
	private static void removeTask() {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
    		try {
    			
    			System.out.println(" Enter the index of the task to remove");
    			index = scanner.nextInt();
    			todoContainer.remove(index);
    			System.out.println("Success!! Todo has been removed!");
    			userEnteredWrongInput = false;
    		}
    		
    		catch(Exception e){
    			System.out.println("Oops! Seems like you entered a wrong value.");
    			System.out.println(" Please make sure index in within range.");
    			System.out.println("  Enter the index of the task to remove");
    			index = scanner.nextInt();
    		}
        }
		
	}//End of removeTask

	
	

	private static void addTask() {
		Scanner scanner = new Scanner(System.in);
		String title = " ", description = " "; 
		int priority;
	
		
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
    		try {
    			
    			System.out.println(" Enter the new task's name");
    			title = scanner.nextLine();
    			System.out.println(" Enter the new task's description");
    			description = scanner.nextLine();
    			System.out.println(" Enter the new task's priority");
    			priority = scanner.nextInt();
    			
    			//Add the Todo to the todoContianer
    			todoContainer.add(new Todo(title, description, priority));
    			
    			userEnteredWrongInput = false;
    			System.out.println(" Success!.. new task has been added.");	
    		}

    		catch(Exception e){
    			System.out.println("Oops! Seems like you entered a wrong value.");
    			System.out.println("Please checck the values entered.");
    			System.out.println("Enter String for name and description, and int for priority");
    			System.out.println(" Enter a new todo");
    			priority = scanner.nextInt();
    		}
        }// End While


	}//End of addTask

	
	/**
	 * The start of the program
	 * 
	 */
	public static void displayTheMainMenuAtStartScreen(){
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("	 Android App: TodostagramV2");
		System.out.println(" ");
		System.out.println("Welcome! Choose from the Menu");
		System.out.println("1. Add a task");
		System.out.println("2. Remove a task");
		System.out.println("3. Update a task");
		System.out.println("4. List tasks");
		System.out.println("5. List tasks of a certain priority");
		System.out.println("0. Exit");
		System.out.println(" ");
		userInput = scanner.nextLine();
		System.out.println("");
		
	}// End of displayTheMainMenuAtStartScreen()
	

	
}// End of Class TodoListV2


