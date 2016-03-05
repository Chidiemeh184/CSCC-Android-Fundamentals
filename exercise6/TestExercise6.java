//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:   1155430
//	ASSIGNMENT: Exercise 6
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================

package com.chidiemeh.week6;

public class TestExercise6 {

	public static void main(String[] args) {
		
		Double testDoubleInput;
		int testIntegerInput;
		
		
		Exercise6  TestingUserInputsForException = new Exercise6();
		
		
		testDoubleInput = TestingUserInputsForException.promptDoube();
		testIntegerInput = TestingUserInputsForException.promptInt();
		
		System.out.println(testDoubleInput);
		System.out.println(testIntegerInput);

	}

}
