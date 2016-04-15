//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: Main.java
//DATE:	4/15/2016
//DESCRIPTION: Exercise 12
//				This class demonstrate Generic type
//				implementation of queue
//==========================================================

package com.chidiemeh.week12;

class QueueFullException extends Exception {}

class QueueEmptyException extends Exception {}


class Queue<E> {
    private E[] elements;
    private int index = 0;
    private int size;
    private int zero = 0;

    Queue(int size) {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    void enqueue(E element ) throws QueueFullException {
        if (index >= size) {
            throw new QueueFullException();
        }
        elements[index] = element; 
        index++;
    }

    E dequeue() throws QueueEmptyException {
    	
    	E returnElement;
    	if (index <= 0) {
            throw new QueueEmptyException();
        }
       returnElement = elements[zero];
       index--;
       zero++;
  
        return returnElement;
    }
}


public class Main {
    public static void main(String[] agrs) {
        Queue<String> strings = new Queue<>(2);
        try {
            strings.enqueue("Hello");
            strings.enqueue("World");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
        } catch (QueueFullException | QueueEmptyException e) {
            e.printStackTrace();
        }

    }
}