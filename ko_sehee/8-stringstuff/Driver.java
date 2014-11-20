import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	StringStuff n = new StringStuff();
	System.out.println(n.capitalize("christina ko"));
	System.out.println(n.capitalize("hello kitty"));
	System.out.println(n.bondify("james bond"));
	System.out.println(n.bondify("christina ko"));
	System.out.println(n.PigLatinify("alligator"));
	System.out.println(n.PigLatinify("skeleton"));
	System.out.println(n.PigLatinify("caterpillar"));
	System.out.println(n.PigLatinify("elephant"));



    }
}
