import java.io.*;
import java.util.*;

public class Cure{
    public double efficiency, cured;
    private int countTurns;
    Random r = new Random();
    public Cure(){
	efficiency = 1/10;
	cured = 0;
    }
    public void turn(){
	if (cured == 1 ){
	    System.out.println("You Lose");
	    System.exit(0);
	}
	if (r.nextDouble() > efficiency){
	    cured = cured + (countTurns/10 + efficiency)/2 ;
	}
	efficiency = efficiency + countTurns/10;
	countTurns = countTurns + 1;
       	System.out.println("Cure: " + cured*100 + "%");
    }

}
