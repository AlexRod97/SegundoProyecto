package Classes;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class Generic_Stack<E> implements Stack_Interface<E> {
    
    public static final int CAPACITY=1000;
	private E[ ] data;
	private int t=-1;
        
        
	public Generic_Stack() {
		this(CAPACITY);
	}

	public Generic_Stack(int capacity) {
		data = (E[]) new Object[capacity];
	}

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean IsEmpty() {
        return (t == -1);
    }

    @Override
    public void Push(E e) {
        data[++t] = e;
    }

    @Override
    public E Top() {
        if (IsEmpty()) return null;
		return data[t];
    }

    @Override
    public E Pop() {
        if (IsEmpty()) return null;
		E response = data[t];
		data[t] = null;
		t--;
		return response;
    }
    
    
    
}
