import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	//Coin class tests 
	Coin one;
	one = new Coin(0.25, "Quarter");
	System.out.println("Before resetting flips");
	System.out.println(one.getFlips());
	one.resetFlips();
	System.out.println("After resetting flips");
	System.out.println(one.getFlips());
	System.out.println("Displaying face");
	System.out.println(one.getFace() + "\n" + "\n");
	
	//Testing flips
	
	Coin two;
	two = new Coin(0.05, "nickel");
	System.out.println("Before any flips");
	System.out.println(two.getFace());
	System.out.println("Resetting flips");
	two.resetFlips();
	two.flip();
	System.out.println("After flipping");
	System.out.println(two.getFace());
	System.out.println("Flips are" + two.getFlips() + "\n" + "\n");

	//Testing CoinPurse
	CoinPurse cp;
	cp = new CoinPurse(0.75);
	System.out.println("coin 1");
	System.out.println(one.getValue() + "\n" +  one.getName() + "\n");
	System.out.println("Coin 2");
	System.out.println(two.getValue() + "\n" + two.getName()+ "\n" );
	System.out.println("Returning original amount in CoinPurse");
	System.out.println(cp.getAmount());
	System.out.println("Adding a quarter");
	cp.addTo(one);
	System.out.println(cp.getAmount());
	System.out.println("Removing a nickel");
	cp.removeFrom(two);
	System.out.println(cp.getAmount());
	
	
    }
}    
