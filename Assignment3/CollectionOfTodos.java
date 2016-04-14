//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: CollectionOfTodos.java
//	DATE:	4/14/2016
//	DESCRIPTION: A container class for Todo
//				 Implements the Iterable interface
//				 Stores data in Set and Lists
//==========================================================


package com.cscc.csci2994.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author chidi
 *			This class is like a 'Bag' or 'Container' for
 *			the Todo objects. It implements the Iterable
 *			interface for going through each Todo's in 
 *			its personal storage.
 *			The main storage is a TreeSet collection of 
 *			Todo objects. The Todo have implemented the '
 *			comparable and hashcode definitions to facilitate
 *			storage in the TreeSet.
 *			Additionally, an ArrayList of Todo is added for storage
 *
 *
 * @param <Todo> The Todo Objects
 */
@SuppressWarnings("hiding")
public class CollectionOfTodos<Todo> implements Iterable<Todo> {
	
	private TreeSet<Todo> storage;
	private ArrayList<Todo> storage2;

	/**
	 *  The Constructor: Initializes two storage
	 */
	public CollectionOfTodos() {
		storage = new TreeSet<Todo>(); 
		storage2 = new ArrayList<Todo>();
	}


	/**
	 * Constructor Overload
	 * @param todoContainer takes an ArrayList of Todos
	 */
	public CollectionOfTodos(ArrayList<Todo> todoContainer) {
		storage2 = todoContainer;
		storage = new TreeSet<Todo>(); 
	}


	/**
	 * @param item add item to both ArrayList and TreeSet
	 */
	public void addTodo(Todo item){
		storage.add(item);
		storage2.add(item);
	}
	/**
	 * @param toRemove removes item form both storages
	 */
	public void remove(Todo toRemove){
		storage2.remove(toRemove);
		storage.remove(toRemove);
	}
	
	/**
	 * @return returns an ArrayList Collection of Todos
	 */
	public ArrayList<Todo> getTheCollectionArrayList(){
		return storage2;
	}

	/**
	 * @return returns a TreeSet collection of Todos
	 */
	public TreeSet<Todo> getTheCollectionTreeSet(){
		return storage;
	}


	@Override
	public Iterator<Todo> iterator() {
		return new TodoIterator<Todo>(this);
	}
}


@SuppressWarnings("hiding")
class TodoIterator<Todo> implements Iterator<Todo>{

	private ArrayList<Todo> store;
	private int position;
	
	public TodoIterator(CollectionOfTodos<Todo> collectionOfTodos) {
		this.store = (ArrayList<Todo>) collectionOfTodos.getTheCollectionArrayList();
	}

	@Override
	public boolean hasNext() {

		if(position < store.size()){
			return true;
		}
		else{
			return false;
		}
		
	}

	@Override
	public Todo next() {
		Todo singleTodo = store.get(position);
		position++;
		return singleTodo;

	}
	
	public void remove(int position){
		store.remove(position);
	}
	
}
