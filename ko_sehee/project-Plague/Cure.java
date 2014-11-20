import java.io.*;
import java.util.*;

public class Cure{
    private double efficiency, cured;
    private int countTurns;
    public Cure(){
	efficiency = 1/100;
	cured = 0;
    }
    public void turn(){
	//*if random 100 < efficiency [cured increases by 2 + efficiency/2]
	if (cured == 1){
	    System.out.print("You Lose");
	    //Or something else idk
	}
	else if (Math.random() < efficiency){
	    cured = cured + (2+efficiency)/2;
	    efficiency = efficiency + countTurns/2;
	    countTurns = countTurns + 1;
	}
	
	// *efficiency increases by countturn/2 (IDK LOL, just as the countturn increases, cure has to be easier to develop)
	// *countturn increases by 1
	// *if cured = 1, then player loses
    }
}