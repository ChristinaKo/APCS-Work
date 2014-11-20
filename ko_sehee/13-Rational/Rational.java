import java.io.*;
import java.util.*;

public class Rational{
    private int a,b;
    public Rational(int x,int y){
	a = x;
	b = y;
    }
    public double getRat(){
	return (a/b);
    }
    public int getRatA(){
	return a;
    }
    public int getRatB(){
	return b;
    }
	
    public int gcd(int j ,int k){
	if (k==0)
	    return j;
	else {
	    return gcd(k,j%k);
	}
    } 

    public void reduce(int j, int k) {
	j = (j / gcd(j,k));
	k = (k / gcd(j,k));
    }
    public boolean equals(Rational other){
	return (this.getRat() == other.getRat());
    }
    
    public Rational mult(Rational other){
	int top = a * other.getRatA();
	int bottom = b * other.getRatB();
	Rational n =new Rational(top,bottom);
	return n;
    }
    public int compareTo(Rational other){
	int ans = 0;
	if (this.equals(other)){
	    ans = 0;
	}
	else if (this.getRat()> other.getRat()){
	    ans = 1;
	}
	else {
	    ans = -1;
	}
	return ans;
    }
}
