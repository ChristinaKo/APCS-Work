
import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Plague Inc. Jr.!");
	System.out.print("To get started, name your disease: ");
	String ans = sc.nextLine();
	Disease d = new Disease(ans);
	Cure c = new Cure();
	
	System.out.println("This world has a total of "+ d.getPop()+ " million people. Your objective? Eradicate them all.");

	try {
	    Thread.sleep(3000);
	}
	catch (InterruptedException e) {
	}

	System.out.println("Upgrading Transmission will increase infectivity of your disease. Upgrading Abilities will make it harder for the cure to reach 100%. Upgrading Symptoms increases severity of your disease (which in turn affects the number of people dead). To upgrade, DNA points are necessary. With each turn, advancements in research will allow the world to get closer to obtaining a complete cure. Beat the cure and kill all of the people in all seven continents. ");

	try {
	    Thread.sleep(3000);
	}
	catch (InterruptedException e) {
	}

	while (1==1){
	    //c.cured <1 && (d.totalDead/1000000) < d.totalPop){
	    System.out.println("-----------------------------------" + "\n");
	    c.turn();
	    d.turn();
	    if (d.decEf == 10){
	       	c.efficiency = c.efficiency - (1/10);
		System.out.println(".......");
		System.out.print("Successfully upgraded cold resistance!");
		System.out.println(" ");
	    }
	    if( d.decEf == 15){
	       	c.efficiency =c.efficiency - (15/100);
		System.out.println(".......");
		System.out.print("Successfully upgraded heat resistance!");
		System.out.println(" ");
	    }
	    if (d.decEf ==20){
		c.efficiency = c.efficiency - (20/100);
		System.out.println(".......");
		System.out.print("Successfully upgraded drug resistance!");
		System.out.println(" ");
	    }
	    if(d.decEf == 25){
		c.efficiency = c.efficiency - (25/100);
		System.out.println(".......");
		System.out.print("Successfully upgraded genetic hardening!");
		System.out.println(" ");
	    }
	    if (d.decEf == 30){
		c.efficiency = c.efficiency - (30/100);
		System.out.println(".......");
		System.out.print("Successfully upgraded genetic resistance!");
		System.out.println(" ");
	    }
	    d.decEf =0;
	}
    }
}
