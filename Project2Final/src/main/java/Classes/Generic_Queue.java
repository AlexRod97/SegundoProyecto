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
public class Generic_Queue<E> implements Queue_Interface<E> {

    public static final int CAPACITY=1000;
	private E[] data;
	private int f = 0; //Index for front element
	private int sz = 0; //Curent qty
	
	public Generic_Queue( ) {
		this(CAPACITY);
	}

	public Generic_Queue(int capacity) {
		data = (E[ ]) new Object[capacity];
	}
    
    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return (sz == 0);
    }

    @Override
    public void enqueue(E e) {
        int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
		return data[f];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
    }


    
}
