import java.io.*;
import java.util.*;
public class myStringList {

    private String[] data;
    private int numItems;
    
    public myStringList(){
	data = new String[10];
	numItems = 0;
    }
    
    public boolean full() {
	return numItems >= data.length;
    }

    public void grow() {
	String[] tmpArray = new String[data.length+(data.length/2)];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
	if (full()) {
	    grow();
	}
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }

    public void add(int pos, String d) {
	if (full()) {
	    grow();
	    for (int i = data.length-1; i>pos; i--) {
		data[i]=data[i-1];
	    }
	    data[pos] = d;
	}
	else {
	    for (int i = data.length-1; i>pos; i--) {
		data[i]=data[i-1];
	    }
	    data[pos] = d;
	}
	numItems = numItems + 1;
    }

    public void remove(int pos) {
	for(int i = pos; i <data.length-1; i++) {
	    data[i]=data[i+1];
	}
	numItems = numItems - 1;
    }

    public int size() {
	return numItems;
    }

    public String get(int pos) {
	return data[pos];
    }

    // public int set(int pos, int d) {
    //	data[pos] = d;
    //}

    public String find(String d) {
	for(int i = 0; i < data.length; i++) {
	    if (data[i].equals(d)) {
		return d;
	    }
	}
	return "no";
    }

    public void fRemove(String d) {
	for(int i = 0; i < data.length; i++) {
	    if (data[i].equals(d)) {
		remove(i);
		numItems = numItems - 1;
		break;
	    }
	}
    }

    

    
}
