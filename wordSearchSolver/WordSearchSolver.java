import java.util.*;
import java.io.*;

public class WordSearchSolver {
  public static void main(String[] args) {
    int Rows = Integer.parseInt(args[0]);
    int Cols = Integer.parseInt(args[1]);
    String TextFile = args[2];
    //randomized seed by default, overridden if provided
    int Seed = (int)(Math.random() * 10000);
    if (args.length == 4) {
         Seed = Integer.parseInt(args[3]);
    }
    String Key = "nokey"; // that's the whole point of this program

    //creates new word search
    WordSearch toSolve = new WordSearch(Rows, Cols, TextFile, Seed, Key);

    
  }
}
