import java.io.*;
import java.util.*;

public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff(){
	a=new int[20];
	for (int i=0;i<a.length;i++) {
	    a[i]=r.nextInt(100);
	}
    }

    public String toString() {
	return Arrays.toString(a);
    }

    // return the index of the max element
    public int findMaxIndex() {
	if (a==null || a.length==0) 
	    return -1;

	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i] > a[maxi])
		maxi = i;
	}
	return maxi;
    }

    public int get(int n) {
	if (n>=0 && n < a.length) 
	    return a[n];
	else
	    return -1;
    }
    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    public double mean(){
	int sum= 0;
	for (int i=0; i<a.length; i++){
	    sum = sum + a[i];
	}
	return sum/(double)a.length-1;
    }
    public double stddev(){
	double[] ans = new double[a.length];
	double mean= this.mean();
	double  x = 0;
	double sum = 0;
	for (int i =0; i <a.length; i++){
	    x = a[i]-mean;
	    ans[i]= x *x;
	}
	for (int i=0; i<ans.length; i++){
	    sum = sum + ans[i];
	}
	double mean2 = sum/(double)ans.length;
	    
	return Math.sqrt(mean2);
    }
}
