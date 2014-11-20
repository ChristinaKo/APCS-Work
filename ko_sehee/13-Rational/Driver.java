public class Driver {
    public static void main (String [] args){
        Rational c = new Rational(4,6);
	Rational d = new Rational(9,3);

	System.out.println(c.equals(d));
	System.out.println(c.mult(d));
	System.out.println(c.compareTo(d));
    }
}
