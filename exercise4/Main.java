//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:   1155430
//	ASSIGNMENT: Exercise 4
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================


package com.chidiemeh.week4;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;


public class Main {

	static void displayAverages(Map<String, Double> averages){
		for (String key: averages.keySet()){
			System.out.println(key + ": " + averages.get(key));
		}
		
	}
	
	static Map<String, Double> calculateAverages(Map<String, List<Double>> dailyTemps) {
		Map<String, Double> averages = new TreeMap<>();
		for (String city: dailyTemps.keySet()){
			List<Double> temps = dailyTemps.get(city);
			double total = 0;
			
			for(double temp: temps){
				total += temp;
			}
			
			total /= temps.size();
			averages.put(city, total);
		}
		return averages;
	}
	
	static Map<String, List<Double>> getUserInput() {
		List<String> cities = new ArrayList<>();
		Map<String, List<Double>> cityTemps = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter city name");
		String city = scanner.nextLine();
		
		while (!city.equals("END")){
			cities.add(city);
			System.out.println("Enter city name");
			city = scanner.nextLine();
			
		}
		
		for(String cityName: cities){
			System.out.println("Enter the temp for next five days" + cityName + "(separate each with space).");
			
			String userInput = scanner.nextLine();
			String[] stringTemps = userInput.split(" ");
			
			List<Double> doubleTemps = new ArrayList<>();
			for(String temp: stringTemps){
				doubleTemps.add(Double.parseDouble(temp));
			}
			
			cityTemps.put(cityName, doubleTemps);
		}
		
		return cityTemps;
		
	}
	
	public static void main(String[] args) {
		Map<String, List<Double>> userInput = getUserInput();
		Map<String, Double> averages = calculateAverages(userInput);
		displayAverages(averages);
		
		
	}
}
