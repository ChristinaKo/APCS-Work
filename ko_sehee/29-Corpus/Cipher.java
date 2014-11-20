import java.io.*;
import java.util.*;

public class Cipher{
    public double[] CorpusFreqs= new double[26];
    public void buildCorpusFreqs(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<= 'z'){
			int x = c - 'a';
			CorpusFreqs[x] = ((CorpusFreqs[x] * 26) + 1.0)/26;
		    }
		}
            }
	} catch (Exception e) {}
    }
    public String toString(){
	return Arrays.toString(CorpusFreqs);
    }
}
