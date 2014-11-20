import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	//add maybe a rules or a how to play before the start??
	Scanner sc = new Scanner(System.in);
	System.out.println("Name your disease: ");
	String ans = sc.nextLine();
	Disease newd = new Disease(ans);
	Cure newc = new Cure();
	//figure out how to do turn
	 
   }
}