import java.io.*;
import java.util.*;

public class Sorts {

    private int numDig = 4;
    private int numNum = 10;
    private int[] values = new int[10];
    private ArrayList[] buckets = new ArrayList[10];
    public Sorts(){
        for (int i=0; i<10; i++){
            buckets[i] = new ArrayList();
        }
        for (int x = 0; x<10;x++){
            Random temp = new Random();
            values[x]= (int)temp.nextInt(9000)+1000;
        }
    }
    public Sorts(int dig,int nums){
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

    public void bubbleSort() {
	int x = 0;
	int count = 0;
	for (int i = 0; i < values.length; i ++){
	    for (int j = 0; j < values.length -1; j ++){
		count = count + 1;
		if (values[j] > values[j+1]){
		    int bigger = values[j];
		    int smaller = values[j+1];
		    values [j+1] = bigger;
		    values [j] = smaller;
		    x=x + 1;
		}
	    }
	}
	System.out.println("bubble swaps: " +  x);
	System.out.println("bubble comparisons: " + count);
    }
    public void insertionSort(){
	int y = 0;
	int swaps = 0;
	int comp = 0;
	int num = 0;
	int min = 0;
	for (int i = 0; i < values.length-1; i ++){
	    if (values[i]>values[i+1]){
		comp ++;
		num = i;
		min = values[i+1];
		while(num >= 0){
		    if(values[num]> min){
			swaps ++;
			comp ++;
			y = values[num];
			values[num]=values[num+1];
			values[num+1]=y;
		    }		
		    num--;
		}
	    }
	}
	System.out.println("Insertion swaps: " +swaps);
	System.out.println("Insertion comparisons: " + comp);
    }      

    public void selectionSort(){
	int x = 0;
	int y = 0;
	for(int i = 0; i < values.length - 1; i ++){
	    int num=i;
	    for (int j = i; j < values.length; j ++){
		x = x + 1;
		if (values[j] <values[num]){
		    num = j;  
		}
	    }
	    y = y + 1;
	    int t= values[i];
	    values[i]=values[num];
	    values[num]= t;
	}
	System.out.println ("selection swaps: " + y);
	System.out.println("selection comparisons: " + x);
    }
    public String toString(){
	return Arrays.toString(values);
    }
}