import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	if (n == 0)
	    return 1;
	else{
	    return n * fact(n - 1);
	}
    }
    public int fact2(int n){
	int answ = 1;
	if(n == 0)
	    return 1;
	else{
	    while (n > 0){
		answ=answ * n;
		n = n - 1;
	    }
	    return answ;
	}
    }
    public int igcd(int a, int b){
	if (a == b){
	    return a;
	}
	else if  (a>b){
	    if (a%b != 0){
		return gcd(a, b-1);
	    }
	    else{
		return b;
	    }
	}
	else {
	    return gcd(b,a);
	}
    }
    public int igcd2(int a, int b){
	if (a==b){
	    return a;
	}
	else if (a > b){
	    if (a%b != 0){
		return gcd2(b, a%b);
	    }
	    else{
		return b;
	    }
	}
	else{
	    return gcd2(b , a);
	}
    }
    public boolean iisPrime(int n){
	int d = n - 1;
	while (d > 1){
	    while (n%d != 0){
	        d = d - 1;
	    }
	    return d == 1; 
	}
	return d == 1;
    }
     public int gcd (int a, int b) {	
	int d = a;
	if (a > b){
	    d = b;
	}
	while (a%d != 0 || b%d !=0){
	    d = d - 1;
	}
	return d;
    }
      public int gcd2 (int a, int b) {
	int c = a;
	int d = b;
	if (a < b) {
	    c = b;
	    d = a;
	}
	while (d != 0) {
	    int e = c;
	    c = d;
	    d = e%d;
	}
	return c;
    }
    
}
		

