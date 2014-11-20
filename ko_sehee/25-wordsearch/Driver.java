import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){
	Wordsearch w = new Wordsearch(10,15);
	w.addWordH(5,7,"hello");
	w.addWordH(5,9,"suupp");
	System.out.println(w.toString());
    }
}
