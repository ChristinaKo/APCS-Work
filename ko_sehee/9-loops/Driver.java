import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Loops n= new Loops();
	System.out.println("Recursions");
	System.out.println(n.fact(4));
	System.out.println(n.fact(0));
	System.out.println(n.fact(10));
	System.out.println("While Loops");
	System.out.println(n.fact2(4));
	System.out.println(n.fact2(0));
	System.out.println(n.fact2(10));
	System.out.println("GCD 1");
	System.out.println(n.gcd(4,56));
	System.out.println(n.gcd(8,86));
	System.out.println(n.gcd(10,25));
	/* gave me an error
	System.out.println(n.gcd(21013,919393));
	*/
	System.out.println(n.gcd(7919,16127));
	System.out.println("GCD 2");
	System.out.println(n.gcd2(4,56));
	System.out.println(n.gcd2(32,86));
	System.out.println(n.gcd2(10,25));
	System.out.println(n.gcd2(2011,2003));
	System.out.println(n.gcd2(7919,16127));
	System.out.println("Prime");
	System.out.println(n.isPrime(7));
	System.out.println(n.isPrime(16));
	System.out.println(n.isPrime(7919));



    }
}
