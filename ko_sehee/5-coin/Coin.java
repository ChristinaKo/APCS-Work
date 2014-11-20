import java.io.*;
import java.util.*;

public class Coin {

    private String face;
    private int heads, tails, flips;
	private double fair;

    public void reset() {
	face = "Not Available";
	heads = 0;
	tails = 0;
	flips = 0;
	fair = 0;
    }
    public String getFace() {
	return face;
    }
}
