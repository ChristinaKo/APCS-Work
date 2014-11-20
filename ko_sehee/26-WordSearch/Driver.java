import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        w.generatePuzzle(7);
        System.out.println(w.toString());
	w.fillInBlanks();
	System.out.println(w);

    }
}