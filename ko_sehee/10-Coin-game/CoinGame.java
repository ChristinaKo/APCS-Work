import java.io.*;
import java.util.*;

public class CoinGame{
    Coin c1 = new Coin();
    Coin c2 = new Coin();
    BankAccount p1 = new BankAccount("Alicia",123,500.00);
    BankAccount p2 =new BankAccount("Christina",456,500.00);
    double pot = 0;
    double amt = 0;
    public void turn(){
	amt = Math.random() * 10;
	p1.withdraw(amt);
	p2.withdraw(amt);
	pot = amt * 2 + pot;
	c1.flip();
	c2.flip();
	if (c1.getFace() == c2.getFace()){
	    if (c1.getFace() == "heads"){
		p1.deposit(pot);
		pot = 0;
	    }
	    else{
		p2.deposit(pot);
		pot = 0;
	    }
	}
	else {
	    pot = pot;
	}
    }
    public void play(int n){
	while(n > 0){
	    turn();
	    n = n-1;
	}
    }

    public String checkBalance(){
	String r="Player 1: $" + p1.getBalance()+ "\n" + "Player 2: $" + p2.getBalance();
	return r;
    }
}
	
