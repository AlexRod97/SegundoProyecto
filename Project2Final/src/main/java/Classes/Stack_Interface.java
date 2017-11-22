/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe
 */
public interface Stack_Interface <E>{
    
    /**
	 * Returns stack elements count
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Checks if stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	boolean IsEmpty();
	
	/**
	 * Inserts an element in the stack
	 * @param e element to be inserted
	 */
	void Push(E e);
	
	/**
	 * Retrieves the last element of the stack without remotion
	 * @return Last stack element (null if empty)
	 */
	E Top();
	
	/**
	 * Retrieves the last element of the stack removing it
	 * @return Last stack element (null if empty)
	 */
	E Pop();
    
}
