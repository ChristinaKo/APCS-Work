import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args){
	Buckets b = new Buckets();
	int[] a = {1299,2133,2312,2313,2321,3143,3543,9458,8943,3459};
	long tiem = System.currentTimeMillis();
	Arrays.sort(a);
	System.out.print("10-4:" + (System.currentTimeMillis()-tiem));
	tiem = System.currentTimeMillis();
	b.radixSort();
	System.out.println(" "+(System.currentTimeMillis()-tiem));
	//----
	Random x = new Random();
	a = new int[100000];
	for (int i=0; i<100000; i++){
	    a[i] = x.nextInt(9000)+1000;
	}
	b = new Buckets(4, 100000);
	tiem = System.currentTimeMillis();
        Arrays.sort(a);
        System.out.print("100000-4:" + (System.currentTimeMillis()-tiem));
        tiem = System.currentTimeMillis();
        b.radixSort();
        System.out.println(" "+(System.currentTimeMillis()-tiem));
	//----
	a = new int[1000];
	for (int i=0; i<1000; i++){
            a[i] = x.nextInt(900000000)+100000000;
        }
        b = new Buckets(9, 10000);
        tiem = System.currentTimeMillis();
        Arrays.sort(a);
        System.out.print("1000-9:" + (System.currentTimeMillis()-tiem));
        tiem = System.currentTimeMillis();
        b.radixSort();
        System.out.println(" "+(System.currentTimeMillis()-tiem));


    }
}