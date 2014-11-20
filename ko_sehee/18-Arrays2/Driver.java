import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args){
	Arrays a = new Arrays();
	System.out.println(a.toString(a.RevFill(6)));
	System.out.println(a.toString(a.MakeRandom(6,4,10)));
    }
}
