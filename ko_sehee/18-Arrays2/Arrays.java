import java.io.*;
import java.util.*;

public class Arrays{
    public int[] RevFill(int n){
	int[]rev = new int[n];
	for (int i = 0;i<rev.length;i= i+1){
	    rev[i]= n;
	    n = n -1;
	}
	return rev;
    }
    public String toString(int[] nums){
	String ans = "";
	for (int y= 0; y <nums.length; y= y+ 1){
	    ans = ans + "" +nums[y] + " ";
	}
	return ans;
    }
    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int[] ans= new int[size];
	int nmax = max - min;
	for(int i = 0; i< ans.length; i = i+ 1){
	    ans[i]= r.nextInt(nmax) + min;
	}
	return ans;
    }
    public int sum13(int[] nums) {
	int sum= 0;
	int i =0;
	if (nums.length == 0){
	    sum = 0;
	}
	else {
	    while(i<nums.length){
		if (nums[i] == 13){
		    sum = sum;
		    i = i + 2;
		}
		else{
		    sum = sum + nums[i];
		    i= i + 1;
		}
	    }
	}
	return sum;
    }
    public boolean modThree(int[] nums) {
	boolean ans = true;
	if (nums.length<3){
	    ans = false;
	}
	else{
	    for (int i=0; i + 2<nums.length; i = i +1){
		if (nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 == 0){
		    ans = true;
		    break;
		}
		else if (nums[i]%2 != 0 && nums[i+1]%2 != 0 && nums[i+2]%2 != 0){
		    ans = true;
		    break;
		}
		else{
		    ans = false;
		}
	    }
	}
	return ans;
    }	    
}
