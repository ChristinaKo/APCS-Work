public class Driver{
    public static void main (String args[]){
	Encode e = new Encode();
	String s = e.encode("hello world!",13);
	System.out.println(s);
	System.out.println(e.encode(s,13));
	System.out.println(e.encode("this is a sentence.",5));
    }


}