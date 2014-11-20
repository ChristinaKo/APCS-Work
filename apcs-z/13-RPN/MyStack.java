import java.util.*;
import java.io.*;


public class MyStack {

    private Node top;
    private int numElts;

    public MyStack(){
	top = null;
	numElts = 0;
    }

    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts = numElts+1;
    }

    public String pop() {
	String ret = top.getData();
	top = top.getNext();
	numElts = numElts-1;
	return ret;
    }

    public String peek() {
	return top.getData();

    }
    
    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return top==null;
    }
    public void calc(String o){
	if (o.equals("+")){
	    double tmp = Double.parseDouble(this.pop());
	    double ans =tmp + Double.parseDouble(this.pop());    
	    this.push(""+ans);
	    numElts = numElts -1;
	}
	
	else if(o.equals("-")){
	    double tmp = Double.parseDouble(this.pop());
	    double ans = tmp - Double.parseDouble(this.pop());
	    this.push(""+ans);
	    numElts = numElts -1;
	}
	else if(o.equals("*")){
	    double tmp = Double.parseDouble(this.pop());
	    double ans = tmp * Double.parseDouble(this.pop());
	    this.push(""+ans);
	    numElts = numElts -1;
	}
	else if (o.equals("/")){
	    double tmp = Double.parseDouble(this.pop());
	    double ans = tmp / Double.parseDouble(this.pop());
	    this.push(""+ans);
	    numElts = numElts -1;
	    
	}
	else if (o.equals("sin")){
	    double ans = Math.sin(Double.parseDouble(this.pop()));
	    this.push(""+ans);
	}
	else if (o.equals("cos")){
	    double ans = Math.cos(Double.parseDouble(this.pop()));
	    this.push(""+ans);
	}
	else if (o.equals("tan")){
	    double ans = Math.tan(Double.parseDouble(this.pop()));
	    this.push(""+ans);
	}
	else{
	    this.push(o);
	    numElts = numElts +1;
	}
	
    }

    public String toString() {
	String s="";
	
	for (Node tmp = top; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp.getData()+", ";
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
