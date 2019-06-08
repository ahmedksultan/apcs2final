import java.util.Random;
import java.util.Arrays;

public class Waltz {

  private static Random random = new Random();
  public static void main(String[] args) {

    System.out.println("\nGenerating waltz...");

    System.out.println("\nPlaying MINUET for 16 measures...\n");

    //16 measures of minuet
    for (int i = 1; i < 17; i++) {
      //first dieRoll
      int dieRoll = random.nextInt(6) + 1;
      //second dieRoll
      dieRoll = dieRoll + random.nextInt(6) + 1;

      //note: dieRoll functions as the row of the minuet table, while i (the measure) counts as column

      //locating file
      String fileName = "M" + minuet[dieRoll][i] + ".wav";
      StdAudio.play(fileName);
      System.out.println("Measure " + i + " of the MINUET...");
      try {
            Thread.currentThread().sleep(1800);
        }
      catch (InterruptedException e) { }
    }

    System.out.println("\nPlaying TRIO for 16 measures...\n");

    //16 measures of trio
    for (int i = 1; i < 17; i++) {
      //first dieRoll
      int dieRoll = random.nextInt(6) + 1;

      //note: dieRoll functions as the row of the trio table, while i (the measure) counts as column

      //locating file
      String fileName = "T" + trio[dieRoll][i] + ".wav";
      StdAudio.play(fileName);
      System.out.println("Measure " + i + " of the TRIO...");
      try {
            Thread.currentThread().sleep(1800);
        }
      catch (InterruptedException e) { }
    }

    System.out.println("\n");
  }

  //recreating the tables from the assignment as arrays
  private static int[][] minuet =
    {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 96, 22, 141, 41, 105, 122, 11, 30, 70, 121, 26, 9, 112, 49, 109, 14},       //2
      {0, 32, 6, 128, 63, 146, 46, 134, 81, 117, 39, 126, 56, 174, 18, 116, 83},      //3
      {0, 69, 95, 158, 13, 153, 55, 110, 24, 66, 139, 15, 132, 73, 58, 145, 79},      //4
      {0, 40, 17, 113, 85, 161, 2 ,159, 100, 90, 176, 7, 4, 67, 160, 52, 170},        //5
      {0, 148, 74, 163, 45, 80, 97, 36, 107, 25, 143, 64, 125, 76, 136, 1, 93},       //6
      {0, 104, 157, 27, 167, 154, 68, 118, 91, 138, 71, 150, 29, 101, 162, 23, 151},  //7
      {0, 152, 60, 171, 53, 99, 133, 21, 127, 16, 155, 57, 175, 43, 168, 89, 172},    //8
      {0, 119, 84, 114, 50, 140, 86, 169, 94, 120, 88, 48, 166, 51, 115, 72, 111},    //9
      {0, 98, 142, 42, 156, 75, 129, 62, 123, 65, 77, 19, 82, 137, 38, 149, 8},       //10
      {0, 3, 87, 165, 61, 135, 47, 147, 33, 102, 4, 31, 164, 44, 59, 173, 78},        //11
      {0, 54, 130, 10, 103, 28, 37, 106, 5, 35, 20, 108, 92, 12, 124, 44, 131}        //12
    };

  private static int[][] trio =
    {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 72, 6, 59, 25, 81, 41, 89, 13, 36, 5, 46, 79, 30, 95, 19, 66},  //1
      {0, 56, 82, 42, 74, 14, 7, 26, 71, 76, 20, 64, 84, 8, 35, 47, 88},  //2
      {0, 75, 39, 54, 1, 65, 43, 15, 80, 9, 34, 93, 48, 69, 58, 90, 21},  //3
      {0, 40, 73, 16, 68, 29, 55, 2, 61, 22, 67, 49, 77, 57, 87, 33, 10}, //4
      {0, 83, 3, 28, 53, 37, 17, 44, 70, 63, 85, 32, 96, 12, 23, 50, 91}, //5
      {0, 18, 45, 62, 38, 4, 27, 52, 94, 11, 92, 24, 86, 51, 60, 78, 31}  //6
    };

}
