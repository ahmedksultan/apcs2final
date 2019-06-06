public class RandomWalkers {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int T = Integer.parseInt(args[1]);

    double mean = 0;

    for (int e = 0; e < T; e++) {
      //keeping track of x,y coordinates
      int x = 0;
      int y = 0;
      for (int i = 0; i < N; i++) {
        double rand = Math.random();
        if (rand < 0.25) {
          x++;
        }
        else if (rand < 0.5) {
          y++;
        }
        else if (rand < 0.75) {
          x--;
        }
        else {
          y--;
        }
      }
      mean = mean + (x*x + y*y);
    }
    mean = mean / T;
    System.out.println("mean squared distance: " + mean);
  }
}
