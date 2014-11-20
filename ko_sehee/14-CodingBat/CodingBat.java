public class CodingBat{
    public boolean sameStarChar(String str) {
	int len = str.length()-1;
	int x = 1;
	boolean ans = true;
	while (x<len){
	    if (str.substring(x,x+1).equals("*")){
		ans = str.substring(x-1,x).equals(str.substring(x+1,x+2));
	    }
	    x = x + 1;
	}
	return ans;
    }
    public String sameEnds(String string) {
	String ans = "";
	int len = string.length();
	for (int x=len/2;x>0;x = x - 1) {
	    if (string.substring(0,x).equals(string.substring(len-x))) {
		if (x > 0){
		    ans = string.substring(0,x);
		    break;
		}
	    }
	}
	return ans;
    }
}
