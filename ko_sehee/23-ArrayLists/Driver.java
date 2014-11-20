import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
      	ArrayList <Integer> ALint = new ArrayList<Integer>();
	//creating and filling in an ArrayList
	for (int i =0; i< 10;i ++){
	    ALint.add(i,i+10);
	}
	System.out.println("ArrayList original:" + ALint);
	//reverse
	ArrayList<Integer> rev = new ArrayList<Integer>();
	int an=ALint.size()-1;
	for (int i = 0; i <10; i++){
	    rev.add(ALint.get(an));
	    an=an-1;
	}
	System.out.println("Reversed:" + rev); 
	//time adding to the end
	ArrayList<Integer> A = new ArrayList<Integer>();
      	long beg= System.currentTimeMillis();
	int numItems=100000;
	for (int i = 0; i <= numItems; i++){
	    A.add(0);
	}
	System.out.println("Adding to the end " +numItems +" items:" + (System.currentTimeMillis()-beg)+"ms");
	//time adding to the front
	ArrayList<Integer> B = new ArrayList<Integer>();
	long begB =System.currentTimeMillis();
	for(int i =0; i<=numItems;i++){
	    B.add(0,0);
	}
	System.out.println("Adding to the front "+ numItems +" items:" + (System.currentTimeMillis()-begB)+"ms");
	//time adding 1000 items to the front and end is the same
	//for adding to the front time adding more than 1000 items is more than adding to the end
	//a big increase in change between adding 10000 items to the front and adding 100,000 items to the front(from 54ms to 1353 ms) while time adding to the front only changes a little(3ms to 13ms)
      	//time removing from front
	ArrayList<Integer> testA = new ArrayList<Integer>();
	ArrayList<Integer> testB= new ArrayList<Integer>();
	for (int i=0; i<numItems; i++){
	    testA.add(1);
	    testB.add(1);
	}
	long startA= System.currentTimeMillis();
	for (int i = 0; i<testA.size(); i++){
	    testA.remove(0);
	}
	System.out.println("time removing from the front: " + (System.currentTimeMillis()-startA));
	long startB= System.currentTimeMillis();
	for (int i = testB.size()-1; i> -1;i--){
	    testB.remove(i);
	}
	System.out.println("time removing from the end: " + (System.currentTimeMillis()-startB));
	//removing from the end is much quicker
    }
}
