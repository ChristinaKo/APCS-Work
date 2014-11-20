import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	g = new Greeter("HI!", "I want to cry :(" );

	g2 = new Greeter();
	System.out.println(g.greet("Lucy","Max"));
	System.out.println(g2.greet("Apple"));
    }
}
