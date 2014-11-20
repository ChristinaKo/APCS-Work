import java.io.*;
import java.util.*;

public class CoinPurse{

    private double amount;

    public CoinPurse (double a){
	amount = a;
    }
    
    public void addTo(Coin c){
	amount += c.getValue();
	    }
    
    public void removeFrom(Coin c){
	amount -= c.getValue();
	    }

    //get methods
    public double getAmount(){
	return amount;
	    }

}
