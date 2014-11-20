import java.io.*;
import java.util.*;

public class Loops2{
    public String diag(int n){
	String result = "";
	for (int i = 0; i < n; i = i + 1){
	    for (int j= i; j > 0; j = j -1){
		result = result + " ";
	    }
	    result = result + "*" + "\n";   

	}
	return result;
    }
    public String diagWord(String s){
	String result = "";
	for (int i = 0; i < s.length(); i = i + 1){
	    for (int j= i; j > 0; j = j -1){
		result = result + " ";
	    }
	    result = result + s.substring(i,i+1) + "\n";   

	}
	return result;
    }
    //doesnt work properly
    public String fence(int h, int w){
	String result = "";
	String vert="|";
	for (int x = 1; x <= h; x= x + 1){
	    if (x==1 || x==h){
		result = result + "+";
	    }
	    for (int y = 1; y <= w; y = y + 1){
	        if (x == 1 || x==h && y <= w-2){
		    result = result + "-";
		}
		else if (y==1){
		    result = result + vert;
		}
		else if (y==w){
		    if (x==1){
			result = result + "+" + "\n";
		    }
		    else{
			result = result + vert + "\n";
		    }
		}
		else {
		    result = result + " ";
		}
	    }
	}
	return result;
    }
}
