import java.util.*;
import java.io.*;

public class MyLinkedList{
    private Node head;
    private int Len;
    private Node tail;
    
    public MyLinkedList(){
	head = new Node("dum");
	tail = new Node("mud");
    }
    public void add(String d){
	// Node tmp = new Node(d);
	// //head=tmp;
	// tmp.setNext(head.getNext());
	// head.setNext(tmp);
	Node tmp = new Node(d);
	tmp.setBefore(tail.getBefore());
	tail.setBefore(tmp);

    }

    public void add(int i, String s){
    	int count = 0;
    	Node tmp = new Node(s);
    	for (Node n = head; n != null; n = n.getNext()){
    	    if (count == i){
    		tmp.setNext(n.getNext());
    		n.setNext(tmp);
		
    	    }
    	    count = count + 1;
    	}
    }


    public String get(int i){
	int count = -1;
	for (Node n = head; n != null; n = n.getNext()){
	    if (count == i){
		return n.getData();

	    }
	    count = count + 1;
	}
	throw new IndexOutOfBoundsException();
    }
    public String set(int i, String s){
	int count = -1;
	Node tmp = new Node();
	Node nn = new Node(s);
	for (Node n = head; n!= null; n=n.getNext()){
	    if (count == i-1){ 
		tmp = new Node(n.getNext().getData());
		n.setNext(nn);
	    }
	    count = count +1;
	}
	return tmp.getData();
    }
    public String remove(int i){
	Node tmp1= new Node();
	Node tmp2 = new Node();
	int count = -1;
	for(Node j = head ;j!= null; j = j.getNext()){
	    if (count == i-1){
		tmp1 = j;
		tmp2 = j.getNext();
		tmp1.setNext(tmp1.getNext().getNext());
	    }
	    count = count +1;
	}
	return tmp2.getData();
    }

    public int find(String s){
	int ind = -1;
	for(Node n= head; n!= null; n=n.getNext()){
	    if(n.getData().equals(s)){
		return ind;
	    }
	    ind = ind + 1;
	}
	return -1;
    }
    public int length(){
	int len = 0;
	for (Node n = head.getNext(); n!= null; n=n.getNext()){
	    len = len + 1;
	    Len = len;
	}
	return len;
    }
    public String toString(){
	String s = "";
	for (Node n = tail.getBefore(); n!= null; n = n.getBefore()){
	    s = s  + n + "  ";
	}
	return s;
    }
}