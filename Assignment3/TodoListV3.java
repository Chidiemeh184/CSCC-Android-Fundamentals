//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: TodoListV3.java
//	DATE:	4/14/2016
//	DESCRIPTION: The class is a simple to-do list
//				 with methods to perform different features
//				 classes and exceptions are used
//==========================================================

package com.cscc.csci2994.assignment2;

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
	private static CollectionOfTodoSorted<Todo> todoContainer2 = new CollectionOfTodoSorted<Todo>();
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
				case "6":
					listAllTasksByPriority();
					break;
			}
			
		}while(!userInput.equals("0"));
	}//End of Main
	
	

	// LIST ALL TASK BY PRIORITY
	private static void listAllTasksByPriority() {
		
		for(Todo item: todoContainer2 ){
			System.out.println("Priority: " + item.getPriority() + " Title: "+ item.getTitle()+ " Decription: " + item.getDescription());
		}
		
	}


	// listAllTasksOfCertainPriority
	private static void listAllTasksOfCertainPriority() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
        	try {
        		System.out.println(" Enter a priority");
        		int theTaskByPriority = scanner.nextInt();
        		
 
        		for(Todo item: todoContainer){
                    	if (item.getPriority() == theTaskByPriority){
                    		System.out.println("Task Index: "+ todoContainer.indexOf(item) + " Name: "+ item.getTitle()
        		               + ", Description: "+item.getDescription()
        		               + ", Priority: " + item.getPriority());
                    		userEnteredWrongInput = false;
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
    			System.out.println(" ");

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
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
        	try {
        		
    			System.out.println(" Enter the index of the task to update");
    			int index = Integer.parseInt(scanner.nextLine());
    			
    			Todo removed = todoContainer.get(index);
    			todoContainer2.remove(removed);

    				int eachIndex = todoContainer.size();
    				if (!(index >= 0 && index <= eachIndex-1)){
    					throw new ArrayIndexOutOfBoundsException();
    				}
    						
    			System.out.println(" Enter new name: ");
    			String newTitle = scanner.nextLine();
    			System.out.println(" Enter new description: ");
    			String newDescription = scanner.nextLine();
    			System.out.println("Enter new priority: ");
    			int newPriority =scanner.nextInt();

    			todoContainer.set(index, new Todo(newTitle, newDescription, newPriority));
    			
    			//Add and update new Todo to TreeSet
    			todoContainer2.addTodo(new Todo(newTitle, newDescription, newPriority));

    			
    			userEnteredWrongInput = false;
    			System.out.println(" Todo has been updated!");	
    		}
    		catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("The index does not exist");
    			System.out.println("Please check the values entered.");
    			System.out.println(" ");

    		}
    		catch(IndexOutOfBoundsException e){
    			System.out.println("The index does not exist");
    			System.out.println("Please check the value entered for index. Ensure it is within index range.");
    			System.out.println(" ");
    		}
    		catch(IllegalArgumentException e){
    			System.out.println("Please check the values entered.");
    			System.out.println("Enter String for name and description, and int for priority");
    			System.out.println(" ");
    		}
        }
		
		
		
	}//End of updateTask

	
	private static void removeTask() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int index = 0;
        boolean userEnteredWrongInput = true;
		
        while(userEnteredWrongInput){
    		try {
    			
    			System.out.println(" Enter the index of the task to remove");
    			index = scanner.nextInt();
    			
    			Todo removed = todoContainer.get(index);
    			todoContainer2.remove(removed);
    			todoContainer.remove(index);
        		
        		
    			
    			System.out.println("Success!! Todo has been removed!");
    			userEnteredWrongInput = false;
    		}
    		
    		catch(Exception e){
    			System.out.println("Oops! Seems like you entered a wrong value.");
    			System.out.println(" Please make sure index in within range.");
    			System.out.println(" ");
    			System.out.println("  Enter the index of the task to remove");
    			index = scanner.nextInt();
    		}
        }
		
	}//End of removeTask

	
	

	private static void addTask() {
		@SuppressWarnings("resource")
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
    			priority = Integer.parseInt(scanner.nextLine());

    			
    			//Add the Todo to the todoContianer
    			todoContainer.add(new Todo(title, description, priority));
    			todoContainer2.addTodo(new Todo(title, description, priority));
    			
    			userEnteredWrongInput = false;
    			System.out.println(" Success!.. new task has been added.");	
    		}
    		
			catch(InputMismatchException e) {
				System.out.println("Error! Please enter only numbers for priority");
				System.out.println(" ");
				System.out.println("Enter new values... ");
				System.out.println(" ");
			}
			catch(NumberFormatException e) {
				System.out.println("Error! Please enter only numbers for priority");
				System.out.println(" ");
				System.out.println("Enter new values... ");
				System.out.println(" ");
			}

        }// End While


	}//End of addTask

	
	/**
	 * The start of the program
	 * 
	 */
	public static void displayTheMainMenuAtStartScreen(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("	 Android App: TodostagramV4  Build: 1.4.4.14.2016");
		System.out.println(" ");
		System.out.println("Welcome! Choose from the Menu");
		System.out.println("1. Add a task");
		System.out.println("2. Remove a task");
		System.out.println("3. Update a task");
		System.out.println("4. List tasks");
		System.out.println("5. List tasks of a certain priority");
		System.out.println("6. List all tasks by priority   (NEW*)");
		System.out.println("0. Exit");
		System.out.println(" ");
		userInput = scanner.nextLine();
		System.out.println("");
		
	}// End of displayTheMainMenuAtStartScreen()
	

	
}// End of Class TodoListV3


