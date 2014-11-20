import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Sorts b = new Sorts();
	Sorts c = new Sorts();
	Sorts d = new Sorts();
	Sorts e = new Sorts();
	Long beg = System.currentTimeMillis();
	b.radixSort();
	System.out.print("time sorting with radix sort: ");
	System.out.println(System.currentTimeMillis()-beg);
	System.out.println(b);
	beg = System.currentTimeMillis();
       	c.bubbleSort();
	System.out.print("time using bubble sort: ");
	System.out.println(System.currentTimeMillis()- beg);
	System.out.println(c);
	beg = System.currentTimeMillis();
	d.selectionSort();
	System.out.print("time using selection  sort:");
	System.out.println(System.currentTimeMillis()- beg);
	System.out.println(d);
	beg = System.currentTimeMillis();
	e.insertionSort();
	System.out.print("time using Insertion sort:");
	System.out.println(System.currentTimeMillis()- beg);
	System.out.println(e);
    }
}