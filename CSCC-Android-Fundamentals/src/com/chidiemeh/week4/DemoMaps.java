package com.chidiemeh.week4;

import java.util.Map;
import java.util.TreeMap;

public class DemoMaps {

	
	static void displayTemps(Map<String, Integer[]> tempMap){
		for (String key : tempMap.keySet()){
			Integer[] temps = tempMap.get(key);
			System.out.println("City: " + key + "Low: " + temps[0] + ", High: "  + temps[1]);
		}
	}
	
	static Map<String, Integer[]> assignTemps(String[] cities, int[] lows, int[] highs){
		Map<String, Integer[]> temps = new TreeMap<>();
		
		for(int i = 0; i < cities.length; i++){
			Integer[] lowAndHigh = {lows[i], highs[i]};
			temps.put(cities[i], lowAndHigh);
			
		}
		return temps;
	}
	
	public static void main(String[] args) {
		String[] cities = {"Columbus", "Cleveland", "Dayton"};
		int[] lows = {-10, 5, 0};
		int[] highs = {15, 30, 15};
		
		Map<String, Integer[]> tempMap = assignTemps(cities, lows, highs);
		
		displayTemps(tempMap);
		
		//Replace TreeMap with HashMap to see difference
	}

}
