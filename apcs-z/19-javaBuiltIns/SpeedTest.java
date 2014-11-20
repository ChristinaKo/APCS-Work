import java.util.*;
import java.io.*;

public class SpeedTest{
    public static void main(String[] args){
	
	TreeMap t = new TreeMap();
	HashMap h = new HashMap();
	Long start1 = System.currentTimeMillis();
	for (Long i=0; i < 100000000000000; i ++){
	    h.put("Boo", new Integer(4 + i));
	}
	Long  n = System.currentTimeMillis()-start1;
	System.out.println("HashMap time: " + n);
	start1=System.currentTimeMillis();
	for (Long i=0; i < 100000000000000; i ++){
	    t.put("Boo", new Integer(4 + i));
	}
	n = System.currentTimeMillis()-start1;
	System.out.println("TreeMap time: " + n);



    }
}
