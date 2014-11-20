import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	CoinGame c = new CoinGame();
	c.play(5);
	System.out.println(c.checkBalance());

    }
}
