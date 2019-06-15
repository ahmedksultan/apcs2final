import java.util.Random;
import java.awt.Color;

public class Art {

  public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);
      boolean multicolor = Boolean.parseBoolean(args[1]);
      fractal(N, multicolor, 0.5, 0.5, 0.25);
  }

  public static void fractal(int N, boolean multicolor, double x, double y, double rad) {
    if (N != 0) {
      if (multicolor == true) {
        colorPicker();
      }
      StdDraw.circle(x, y, rad);

      //twelve, three, six, nine represent positions on a clock
      double twelveX = x;
      double twelveY = y + rad;

      double threeX = x + rad;
      double threeY = y;

      double sixX = x;
      double sixY = y - rad;

      double nineX = x - rad;
      double nineY = y;

      fractal(N - 1, multicolor, twelveX, twelveY, rad/2);
      fractal(N - 1, multicolor, threeX, threeY, rad/2);
      fractal(N - 1, multicolor, sixX, sixY, rad/2);
      fractal(N - 1, multicolor, nineX, nineY, rad/2);
    }
  }

  public static void colorPicker() {
    Color[] colorList = {StdDraw.BLACK, StdDraw.BLUE, StdDraw.BOOK_BLUE, StdDraw.BOOK_LIGHT_BLUE, StdDraw.BOOK_RED, StdDraw.CYAN, StdDraw.DARK_GRAY, StdDraw.GRAY, StdDraw.GREEN, StdDraw.LIGHT_GRAY, StdDraw.MAGENTA, StdDraw.ORANGE, StdDraw.PINK, StdDraw.PRINCETON_ORANGE, StdDraw.RED, StdDraw.YELLOW};
    Random r = new Random();
    int randomNumber = r.nextInt(colorList.length);
    StdDraw.setPenColor(colorList[randomNumber]);
  }

}
