package com.cscc.csci2994.assignment2;

//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: CollectionOfTodos.java
//DATE:	4/14/2016
//DESCRIPTION: A container class for Todo
//			 Implements the Iterable interface
//			 Stores data in Set and Lists
//==========================================================



import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Chidi Emeh
 *			This class is like a 'Bag' or 'Container' for
 *			the Todo objects. It implements the Iterable
 *			interface for going through each Todo's in 
 *			its personal storage.
 *			The main storage is a TreeSet collection of 
 *			Todo objects. The Todo have implemented the '
 *			comparable and hashcode definitions to facilitate
 *			storage in the TreeSet.
 *
 *
 * @param <Todo> Takes a Todo class
 */
@SuppressWarnings("hiding")
public class CollectionOfTodoSorted<Todo> implements Iterable<Todo> {
	
	private TreeSet<Todo> storage;

	/**
	 * The constructor
	 */
	public CollectionOfTodoSorted() {
		storage = new TreeSet<Todo>(); 
	}


	/**
	 * @param item adds a Todo item
	 */
	public void addTodo(Todo item){
		storage.add(item);
	}
	
	/**
	 * @param toRemove removes the item
	 */
	public void remove(Todo toRemove){
		storage.remove(toRemove);
	}

	
	/**
	 * @return returns a TreeSet collection
	 * 		of all the Todos
	 */
	public TreeSet<Todo> getTheCollectionTreeSet(){
		return storage;
	}

	@Override
	public Iterator<Todo> iterator() {
		return storage.iterator();
	}
}



