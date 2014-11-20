import java.util.*;
import java.io.*;

public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    public MyLinkedList(){
	head = null;
    }

    public Iterator<E> iterator(){
    }
    public void add(E d){
	Node <E> tmp = new Node<E>(d);
	//head=tmp;
	tmp.setNext(head);
	head = tmp;
    }
     public void add(int i, E s){
     	int count = 0;
	Node<E> tmp = new Node<E>(s);
    	for (Node<E> n = head; n != null; n = n.getNext()){
	    if (count ==i-1){
		tmp.setNext(n.getNext());
		n.setNext(tmp);
    		 }
	    count =count +1;
	}
     }
    public E  get(int i){
	int count = 0;
	for (Node<E> n = head; n != null; n = n.getNext()){
	    if (count == i){
		return n.getData();

	    }
	    count = count + 1;
	}
	throw new IndexOutOfBoundsException();
    }
    public E  set(int i, E s){
	int count = 0;
	Node<E> tmp = new Node<E>();
	Node<E> nn = new Node<E>(s);
	for (Node<E> n = head; n!= null; n=n.getNext()){
	    if (count == i-1){ 
		tmp = new Node<E>(n.getNext().getData());
		n.setNext(nn);
	    }
	    count = count +1;
	}
	return tmp.getData();
    }
    public E remove(int i){
	Node<E> tmp1= new Node<E>();
	Node<E>  tmp2 = new Node<E>();
	int count = 0;
	for(Node<E> j = head ;j!= null; j = j.getNext()){
	    if (count == i-1){
		tmp1 = j;
		tmp2 = j.getNext();
		tmp1.setNext(tmp1.getNext().getNext());
	    }
	    count = count +1;
	}
	return tmp2.getData();
    }

    public int find(E s){
	int ind = 0;
	for(Node<E> n= head; n!= null; n=n.getNext()){
	    if(n.getData().equals(s)){
		return ind;
	    }
	    ind = ind + 1;
	}
	return -1;
    }
    public int length(){
	int len = 0;
	for (Node<E> n = head; n!= null; n=n.getNext()){
	    len = len + 1;
	}
	return len;
    }
    public String toString(){
	String s = "";
	for (Node<E> n = head; n!= null; n = n.getNext()){
	    s = s  + n + "  ";
	}
	return s;
    }
}