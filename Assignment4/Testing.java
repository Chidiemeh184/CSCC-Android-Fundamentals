//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: Testing.java
//DATE:	4/14/2016
//DESCRIPTION:  Testing Class
//				This class to check other classes
//				and how they are working.
//==========================================================


package com.cscc.csci2994.assignment2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/**
 * @author Chidi Emeh
 * 		This class is used to check other classes
 *		
 */
public class Testing {
	
	private static Map<Integer, Todo> allTheTodos = new LinkedHashMap<Integer, Todo>();
	private static TreeSet<Todo> treeTodos = new TreeSet<Todo>();
	private static CollectionOfTodos<Todo> latestTodo = new CollectionOfTodos<Todo>();
	private static CollectionOfTodoSorted<Todo> latestTodo2 = new CollectionOfTodoSorted<Todo>();
	
	/**
	 * @param args Point of Entry
	 */
	public static void main(String[] args) {
		Todo Run = new Todo("Run", "Running", 4);
		Todo Eat = new Todo("Eat", "Running", 3);
		Todo Sleep = new Todo("Sleep", "Running", 2);
		Todo Drink = new Todo("Drink", "Running", 1);
		Todo Beer = new Todo("Beer", "Running", 1);
		Todo AppleBeer = new Todo("AppleBeer", "Running", 1);
	
		//allTheTodos.remove(4, Run);
		allTheTodos.put(3, Eat);
		allTheTodos.put(2, Sleep);
		allTheTodos.put(1, Drink);
		allTheTodos.put(1, Beer);
		
		treeTodos.add(Eat);
		treeTodos.add(Drink);
		treeTodos.add(Run);
		treeTodos.add(Eat);
		treeTodos.add(Sleep);
		treeTodos.add(Beer);
		treeTodos.add(Beer);
		treeTodos.add(AppleBeer);
		
		latestTodo.addTodo(Drink);
		latestTodo.addTodo(Eat);
		latestTodo.addTodo(Run);
		latestTodo.addTodo(Sleep);
		latestTodo.addTodo(Drink);
		latestTodo.addTodo(Beer);
		latestTodo.addTodo(AppleBeer);
		
		
		latestTodo2.addTodo(Drink);
		latestTodo2.addTodo(Eat);
		latestTodo2.addTodo(Run);
		latestTodo2.addTodo(Sleep);
		latestTodo2.addTodo(Drink);
		latestTodo2.addTodo(Beer);
		latestTodo2.addTodo(AppleBeer);
		
		
		System.out.println(" Todos form COLLECTION OF TODOS ----- LATESTTODO");
		for(Todo item: latestTodo){
			System.out.println("Priority: " + item.getPriority() + " Todo: "+ item.getTitle());
		}
		
		System.out.println(" ");
		System.out.println(" Todos converted to sorted Tree set from COLLECCTION OF TODO (latesTodo)");
		TreeSet<Todo> latestTodoTreeSet = latestTodo.getTheCollectionTreeSet();
		for(Todo item: latestTodoTreeSet){
			System.out.println("Priority: " + item.getPriority() + " Todo: "+ item.getTitle());
		}
 		
		
		System.out.println(" ");
		System.out.println(" Todos form COLLECCTION OF TODO SORTED -- LATESTTODO 2");
		for(Todo item: latestTodo2){
			System.out.println("Priority: " + item.getPriority() + " Todo: "+ item.getTitle());
		}
		
		
		System.out.println(" ");
		for(Entry<Integer, Todo> entry: allTheTodos.entrySet()){
			System.out.println("Priority: " + entry.getKey() + " Todo: "+ entry.getValue());
		
		}
		
		System.out.println(" ");
		System.out.println("Todo with sorted TreeSet");
		
		for(Todo item: treeTodos){
			System.out.println("Priority: " + item.getPriority() + " Todo: "+ item.getTitle());
		}

	}
}
