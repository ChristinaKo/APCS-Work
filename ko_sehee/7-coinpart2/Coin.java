import java.io.*;
import java.util.*;

public class Coin { 

    // Different instance  variables of the class 

    private String face, name;
    //Which face the coin flips on to
    private double prob, value;
    private int flips, heads, tails;
    // variables, in order
    // The total number of flips
    // The number of heads and tails, respectively
    // the fairness of the coin (how often tails vs. heads)

    public Coin (double v, String n){
    face = "Heads";
    flips = 5;
    heads = 3;
    tails = 2;
    prob  = .5;
    value = v;
    name = n;
    }

    //Methods
    
    public void resetFlips(){
	flips = 0;
	    }
    
    public void setFaceTails(){
	face = "Tails";
	flips += 1;
	tails += 1;
	    }
    
    public void setFaceHeads(){
	face = "Heads";
        flips += 1;
        heads += 1;
	    }

    public void flip(){
	if (Math.random() <= 0.5) {
	    setFaceHeads();
		}
	else {
	    setFaceTails();
	}
    }
    
    //get Methods 
    
    public int getFlips(){
	return flips;
    }

    public String getFace(){
	return face;
    }

    public double getValue(){
	return value;
    }

    public String getName(){
	return name;
    }
     

}
