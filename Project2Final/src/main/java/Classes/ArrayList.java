
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
public class ArrayList<E>  {
	
	public static final int CAPACITY=25;
	private E[ ] data;
	private int size = 0;
	//private int contCapacidad = 0; 
        
	public ArrayList() {
		this(CAPACITY); //  da la capacidad del array 25
	}

	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {
		//checkIndex(i, size);                
		return data[i];
	}

	public E set(int i, E e) {
		//checkIndex(i, size);
		E temp = data[i];
                data[i] = null; 
		data[i] = e;
		return temp;
	}

	public void add( E e) {                 
		//checkIndex(i, size);
		if (size >= data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
                 else{
                  // for (int k=0; k <= i; k++) {
                  // if (data[k]== null) {
                       //data[k] =e;
                       data[size] = e; 
                       size++;                      
                       }
                       
                   }
        
        public E remove( int i ) throws IndexOutOfBoundsException {
		//checkIndex(i, size);
		E temp = data[i];
                data[i] = null; 
		for (int k=i; k < size-1; k++) {                    
                   data[k] = data[k+1];
                   data[size-1] = null; 
                }			
		size--;
		return temp;
	}
        
        protected void checkIndex(int i, int n) throws IndexOutOfBoundsException { // metodo revisa que el index sea valido a ingresar
		if (i <= 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}  
    }           	


