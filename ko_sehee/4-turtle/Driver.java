import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Turtle t1,t2,t3;
	t1=new Turtle();
	System.out.println("Turtle numero 1 is called " + t1.getname()+ " and is " + t1.getage() + " years old.");
	System.out.println(t1.getname()+" is going fd at a speed of " + t1.getspeed());
	
	System.out.println("We're going to make a friend for "+ t1.getname());
	t2=new Turtle("Bengi");
	System.out.println("His name is "+ t2.getname());
	System.out.println(t2.getname()+" is the same age and speed as "  + t1.getname());
	
	System.out.println("But these turtles are far inferior...");
	t3= new Turtle("George Washington",282,17751783);
	System.out.println("To "+t3.getname()+" who is "+t3.getage()+" years old");
	System.out.println("He has a superior speed of "+t3.getspeed());
	t3.getolder();
	System.out.println("But next year he will grow to be "+ t3.getage());

	Person p1;
	p1=new Person("Anoni Mouse");
	p1.setTurtle(t3);
	System.out.println("");
	System.out.println(p1.getTurtleSpeed());
	System.out.println(p1.getPet());
    }
}

	
