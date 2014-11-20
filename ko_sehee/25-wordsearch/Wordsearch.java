import java.io.*;
import java.util.*;

public class Wordsearch{

    private char[][] board;

    public Wordsearch(int rows,int cols){
	board=new char[rows][cols];
	for (int i = 0; i<rows; i++){
	    for (int j= 0; j <cols; j++){
		board[i][j]='-';
	    }
	}
    }
    public Wordsearch(){
	this(20,20);
    }

    public boolean addWordH(int row, int col, String word){
	boolean retval = true;
	if (word.length() > board.length - row){
	    retval = false;
	}
	else {
	    int r = row;
	    int c = col;
	    for (int i = 0 ; i < word.length(); i ++){
		if (board[r][c]!='-'){
			retval = false;
			break;
		}
		else{
		    board[r][c] = word.charAt(i);
		    retval = true;
		}
		c = c + 1;
	    }
	}
	return retval;
		  
    }

    public String toString(){
	String s = "";
	for (int i = 0; i <board.length;i++){
	    for (int j = 0; j <board[i].length; j++){
		s = s + board[i][j];
	    }
	    s = s +"\n";
	}
	return s;
    }
}
