import java.io.*;
import java.util.*;

public class Buckets {

    private int numDig = 4;
    private int numNum = 10;
    private int[] values = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
    public Buckets(){
	for (int i=0; i<10; i++){
	    buckets[i] = new ArrayList();
	}
	for (int x = 0; x<10;x++){
	    Random temp = new Random();
	    values[x]= (int)temp.nextInt(9000)+1000;
	}
    }
    public Buckets(int dig,int nums){
	buckets = new ArrayList[nums];
	values = new int[nums];
	numDig = dig;
	numNum = nums;
	for (int i=0; i<nums; i++){
            buckets[i] = new ArrayList();
        }
        for (int x = 0; x<nums;x++){
            Random temp = new Random();
            values[x]= (int)temp.nextInt(9000)+1000;
        }
    }


    public void radixSort(){
	for (int n = 0;n<numDig; n++){
	    for (int y=0; y<numNum;y++){
		buckets[(int)(values[y]/Math.pow(10,n)) %10].add(values[y]);
	    }
	    int a = 0;
	    for (int z = 0; z <numNum; z ++){
		for (int r = 0; r <buckets[z].size(); r ++){
		    values[a]=(Integer)buckets[z].get(r);
		    a= a+1;
		}
	    }
	    for (int b = 0; b < buckets.length; b ++){
		buckets[b].clear();
	    }
	}
    }
    public String toString(){
	return Arrays.toString(values);
    }
}
