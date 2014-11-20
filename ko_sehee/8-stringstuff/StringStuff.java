import java.io.*;
import java.util.*;

public class StringStuff{
    private String name1, name2,full;
    private int sp;
    public String capitalize(String name){
	sp = name.indexOf(" ");
	name1= name.substring(0,1);
	name2= name.substring(sp + 1, sp + 2);
	name1 = name1.toUpperCase();
	name2 = name2.toUpperCase();
	full = name1 + name.substring(1,sp) + " " + name2 + name.substring(sp + 2);
	return full;
    }
    public String bondify(String name){
	sp = name.indexOf(" ");	
	name1= capitalize(name);
	full= name1.substring(sp + 1) + ", " + name1;
	return full;
    }
    public String PigLatinify(String word){
	word = word.toLowerCase();
	String l1 = word.substring(0,1);
	String l2 = word.substring(1,2);
	if (l1.equals("a") || l1.equals("e") || l1.equals("i") || l1.equals("o") || l1.equals("u")){
	    full = word+ "ay";
	}
	else if (!l1.equals("a") && !l1.equals("e") && !l1.equals("i") && !l1.equals("o") && !l1.equals("u") && 
	    !l2.equals("a") && !l2.equals("e") && !l2.equals("i") && !l2.equals("o") && !l2.equals("u")){
	    full = word.substring(2)+word.substring(0,2)+"ay";
	}
	else{
	    full = word.substring(1) + word.substring(0,1) + "ay";
	}
	return full;
	    }
	 
}

	
	
