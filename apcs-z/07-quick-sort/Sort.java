import java.io.*;
import java.util.*;

public class Sort{
    //I  tried
    public static int[] qsort(int[] a){
	if(a.length <= 1){
	    return a;
	}
	else{
	    int p = (a.length)/2;
	    ArrayList <Integer> R1 = new ArrayList<Integer>();
	    ArrayList <Integer> R2 = new ArrayList <Integer>();
	    int piv = a[p];
	    for (int i = 0; i <a.length; i ++){
		if (i ==p){
		}
		else if(a[i]<piv){
		    R1.add(a[i]);
		}
		else{
		    R2.add(a[i]);
		}
	    }
	    Integer[] lowr = R1.toArray(new Integer[R1.size()]);
	    int[] rlow = new int[lowr.length];
	    for (int i = 0; i < lowr.length; i++) {
		rlow[i] = lowr[i].intValue();
	    }
	    rlow = qsort(rlow);
	    Integer[] hir =R2.toArray(new Integer[R2.size()]);
	    int[] rhi = new int[hir.length];
	    for (int i=0; i <hir.length; i ++){
		rhi[i] = hir[i].intValue();
	    }
	    rhi = qsort(rhi);
	    for (int x = 0; x < a.length; x ++){
		if (x < rlow.length){
		    a[x] = rlow[x];
		}
		else if (x == rlow.length){
		    a[x] = piv;
		}
		else{
		    a[x] = rhi[x - (rlow.length + 1)];
		}
	    }
		return a;
	}
	
    }
    public int partition(int[] a, int L, int R){
	/*int wall = L+1;
	int p = a[(L+R)/2];
	a[(L+R)/2] = a[R];
	a[R] = p;
	*/
	int p = a[(L+R)/2];
	int wall = L;
	int tmp = a[R];
	a[(L+R)/2] = tmp;
	a[R] = p;
	for (int i=L; i< R;L++){
	    if(a[i] < p){
		tmp = a[i];
		a[i] = a[wall];
		a[wall] = tmp;
		wall = wall + 1;
	    }
	}
	tmp = a[wall];
	a[wall] = a[R];
	a[R] = tmp;
	return wall;
    }

    public void qsort2(int[] a, int l, int r){
	if (r-1 <= 1){
	    return;
	}
	else{
	    int p =partition(a, l ,r);
	    if (p -1>1){
		qsort2(a,l,p-1);
	    }
	    if (p +1<r){
		qsort2(a,p+1,r);
	    }
	}
		
    }      
	
    public static void main(String[] args){
	Sort s = new Sort();
	int[] x = {14,52,6,234,15,2,3,124,52,3,1,35,94,123};
	int[] x2 = {13,25,1,5,74,2,73,79,253,745,123,243,12};
	System.out.println(Arrays.toString(s.qsort(x)));
	s.qsort2(x2,0,x2.length-1);
	System.out.println(Arrays.toString(x2));

    }

}
