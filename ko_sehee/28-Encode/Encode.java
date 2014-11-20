public class Encode{
    public String encode(String txt, int rot){
	String lc = txt.toLowerCase();
	String ret = "";
	for (int i = 0; i < lc.length(); i++){
	    int num = (int)lc.charAt(i);
	    if (num>=97 && num<=122){
		num = num + rot;
		if (num>=97  &&num<=122){
		    ret= ret + (char)num;
		}
		else if (num>122){
		    num = (num -122)+96;
     		    ret=ret + (char)num;
		}
	    }
	    else{
		ret = ret + lc.charAt(i);
	    }
	}
	return ret;
    }
}

		    
