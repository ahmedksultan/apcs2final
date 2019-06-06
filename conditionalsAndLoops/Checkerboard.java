public class Checkerboard {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N*2; j++) {
        if (i % 2 == j % 2) {
          System.out.print('*');
        }
        else {
          System.out.print(' ');
        }
      }
      System.out.print('\n');
    }
  }
}
