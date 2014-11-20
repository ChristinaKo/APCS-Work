import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
	data =new int[10];
	numItems=0;
    }
    
    public void add(int d) {

	if (numItems>=data.length) {
	    System.out.println("Growing");
	    int[] tmpArray = new int[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}

	
	// then add
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
    public void insert(int pos, int d){
	int[] temp= new int[data.length+1];
	for (int i = 0; i < data.length; i ++){
	    if (i<pos){
		temp[i]=data[i];
	    }
	    else if (i==pos){
		temp[i]=d;
	    }
	    else{
		temp[i+1]=data[i];
	    }
	}
	data=temp;
	numItems=numItems+1;

    }
    public int remove(int pos){
	int[]tmp =new int[data.length-1];
	int removed = data[pos];
	for (int i = 0; i < data.length; i ++){
	    if (i < pos){
		tmp[i]=data[i];
	    }
	    else if(i> pos){
		tmp[i-1]= data[i];
	    }
	}
	data = tmp;
	numItems=numItems-1;
	return removed;
	
    }
}
