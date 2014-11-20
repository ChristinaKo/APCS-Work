import java.io.*;
import java.util.*;
import java.lang.*;

public class MyStack {

    private int top;
    private int numElts;
    private String[]stack;
    public MyStack(){
	top = -1;
	numElts = 0;
	stack = new String[10];
    }

    public void grow(){
	String[] tmp = new String[stack.length * 2];
	System.arraycopy(stack,0,tmp,0,stack.length);
	stack = tmp;
    }
    public void push(String s){ 
	if(numElts>=stack.length){
	    this.grow();
	}
	top = top + 1;
       	stack[top] = s;
	numElts = numElts  +1;
    }

    public String pop() {
	top = top -1;
	numElts = numElts -1;
	return stack[top +1];
    }

    public String peek() {
	return stack[top];

    }
    
    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return this.size() == 0;
    }

    public String toString() {
	String s="";
	
	for (int i = 0; i < this.size(); i ++){
	    s = s + stack[i]+", ";
	}
	/*
	  Node tmp = top;
	  while(tmp!=null) {
	      s = s + tmp.getData()+", ";
	          tmp = tmp.getNext();
		  }
	*/
	return s.substring(0,s.length()-2);
    }
    
}