import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting;
    public String sadgreeting;
    
    public Greeter(){
	sethappy("I am Happy");
	setsad("I am Sad");
    }

    public void sethappy(String happygreet) {
	happygreeting = happygreet;
    }
    public void setsad(String sadgreet){
	sadgreeting = sadgreet;
    }
    

    public String greet(String name1, String name2) {
	String message;
	message = happygreeting + " " + name1 + "\n" + sadgreeting + " " + name2;
	return message;
    }
}
