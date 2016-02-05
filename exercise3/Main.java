package com.chidiemeh.week3;

public class Main {

	static double getUserFarenheit(){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Farenheit temperature.");
		String userInput = scanner.nextLine();
		return Double.parseDouble(userInput);
	}
	
	static double fToC(double fTemp){
		return 5.0/9 * (fTemp - 32);
	}
	
	static void display(double cTemp){
		System.out.println("The celsius temperature is " + cTemp);
	}
	
	public static void main(String[] args) {
		double fTemp;
		 do {
			 fTemp = getUserFarenheit();
			 double cTemp = fToC(fTemp);
			 display(cTemp);
		 }  while (fTemp >= -460);

	}

}
