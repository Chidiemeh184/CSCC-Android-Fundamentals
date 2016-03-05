//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:  1155430
//	ASSIGNMENT: Exercise 6
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================


package com.chidiemeh.week6;

import java.util.Scanner;

/**
 * Exercise6 is a class that demonstrates exception
 * @author Chidi Emeh
 *
 */
public class Exercise6 {

	  Scanner scanner = new Scanner(System.in);

	  public int promptInt() {
		  
		 String message = "Enter any Integer";
	     System.out.println(message);
	     String userInput = scanner.nextLine();

	     int userInt = 0;
	     boolean isInt = false;
	     while (!isInt) {
	        try {
	             userInt = Integer.parseInt(userInput);
	             isInt = true;
	            }
	       catch (NumberFormatException e) {
	            System.out.println("Ok "+ userInput + " is not a valid integer. " + message);
	            userInput = scanner.nextLine();
	            }
	        }
	        return (Integer)userInt;
	      }
	  
	  public Double promptDoube() {
		     String message = "Enter any Double number";
		     System.out.println(message);
		     String userInput = scanner.nextLine();

		     Double givenDouble = 0.0;
		     boolean isDouble = false;
		     while (!isDouble) {
		        try {
		             givenDouble = Double.parseDouble(userInput);
		             isDouble = true;
		            }
		       catch (NumberFormatException e) {
		            System.out.println("Maybe a typo, but "+ userInput + " is not a valid Double. " + message);
		            userInput = scanner.nextLine();
		            }
		        }
		        return givenDouble;
		      }	  

	  public String promptString() {
		  	 String message = "Enter any String";;
		     String userInput = scanner.nextLine();

		        return userInput;
		      }
	  
	

}
