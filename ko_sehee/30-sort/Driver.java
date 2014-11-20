import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Buckets b = new Buckets();
	Buckets c = new Buckets();
	Long beg = System.currentTimeMillis();
	b.radixSort();
	System.out.println("time sorting with radix sort: ");
	System.out.println(System.currentTimeMillis()-beg);
	System.out.println(b);
	beg = System.currentTimeMillis();
	System.out.print ("swaps using Bubble: ");
	c.bubbleSort();
	System.out.println("time using bubble sort:");
	System.out.println(System.currentTimeMillis()- beg);
	System.out.println(c);
	

	
    }
}
