public class RandomWalker {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);

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
      System.out.println("(" + x + ", " + y + ")");
    }

    System.out.println("\nsquared distance: " + (x*x + y*y));
  }
}
