import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Cipher a = new Cipher();
	a.buildCorpusFreqs("SomeofAlice");
	System.out.println(a);
    }
}
