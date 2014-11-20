import java.io.*;
import java.util.*;


public class myList implements myInterface, Iterable<Integer> {

    private class myListIterator implements Iterator<Integer> {
        private int current = 0;
        private myList list;

        public myListIterator(myList l) {
            list = l;
        }

        public boolean hasNext() {
            return (current < list.size());
        }
        public Integer next() {
	    current = current + 1; 
           return list.get(current);
         }
        public void remove() {
        }
    }
    

    private int[] data;
    private int numItems;
    
    public Iterator<Integer> iterator() {
        return new myListIterator(this);
    }


    public String saySomething() {
        return "Hello";
    }
    public int addOne(int z) {
        return z-1;
    }

    public myList() {
        data = new int[5];
        numItems=0;
    }

    public boolean isFull() {
        return numItems >= data.length;
    }

    public void grow() {
	// "grow" the array by creating a new one and copying over
	int[] tmpArray = new int[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(int d) {
        if (isFull()){
            grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void add(int pos, int d) {
        if (isFull()) 
            grow();
        
        // shift things over to make room
        for (int i=numItems;i>=pos;i--) {
            data[i]=data[i-1];
        }
        data[pos]=d;
        numItems++;
    }
    
    public void remove(int pos) {
        for (int i=pos; i< numItems;i++) 
            data[i]=data[i+1];
        numItems--;
    }


    public int get(int pos) {
        return data[pos];
    }

    public void set(int pos, int d) {
        data[pos]=d;
    }

    public int size() {
        return numItems;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
        
}