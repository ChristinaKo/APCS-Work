import java.io.*;
import java.util.*;

public class For{
    //Factorial with for
    public int fact(int n){
	int result = 1;
	for (int b = n; b >0; b = b-1){
	    result = result * b;
	}

	return result;
    }
    public String Reverse(String s){
	String x = "";
	for (int n = s.length();n >=0; n = n -1){
	    if (n == s.length()){
		x = x + s.substring(n);
	    }
	    else{
		x = x + s.substring(n,n+1);
		    }
	}
	return x;
    }
    public String table(int n, int m){
	String x = "  ";
	String y = "";
	String z = "";
	for (int a = 1 ; a <= n;a = a + 1){
	    x = x + a + "  ";
	}
	for (int b = 1; b <= m; b = b + 1){
	    y ="" + b;
	    for (int c = 1 ; c <= n;c = c + 1){
	         z = "" + b*c;
		 y ="" + y + " " + z + " ";
	    }
		 x = x + "\n"+ y + "\n";
	}
	return x;
    }
}
