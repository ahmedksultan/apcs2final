import java.util.Random;
import java.awt.Color;

public class Art {

  public static void main(String[] args) {

    //setting x and y coords to the middle of the canvas
    double x = 0.5;
    double y = 0.5;

    //recieving parameter, depth of recursion
    int N = Integer.parseInt(args[0]);

    //assignment recommends size = 0.5
    StdDraw.setPenRadius(0.01);
    spotty(N, x, y, 0.5);

  }
  public static void spotty(int n, double x, double y, double size) {
    if (n != 0) {
      //creating points for the lines
      double left = x - size/2;
      double right = x + size/2;
      double bottom = y - size/2;
      double top = y + size/2;

      //drawing spots, picking random colors
      colorPicker();
      StdDraw.point(x, y);
      colorPicker();
      StdDraw.point(left, y);
      colorPicker();
      StdDraw.point(right, y);
      colorPicker();
      StdDraw.point(left, bottom);
      colorPicker();
      StdDraw.point(x, bottom);
      colorPicker();
      StdDraw.point(right, bottom);
      colorPicker();
      StdDraw.point(left, top);
      colorPicker();
      StdDraw.point(x, top);
      colorPicker();
      StdDraw.point(right, top);

      //recursively drawing the next order of spots
      spotty(n-1, left, bottom, size/2);
      spotty(n-1, left, top, size/2);
      spotty(n-1, right, bottom, size/2);
      spotty(n-1, right, top, size/2);
    }
  }

  public static void colorPicker() {
    Color[] colorList = {StdDraw.BLACK, StdDraw.BLUE, StdDraw.BOOK_BLUE, StdDraw.BOOK_LIGHT_BLUE, StdDraw.BOOK_RED, StdDraw.CYAN, StdDraw.DARK_GRAY, StdDraw.GRAY, StdDraw.GREEN, StdDraw.LIGHT_GRAY, StdDraw.MAGENTA, StdDraw.ORANGE, StdDraw.PINK, StdDraw.PRINCETON_ORANGE, StdDraw.RED, StdDraw.YELLOW};
    Random r = new Random();
    int randomNumber = r.nextInt(colorList.length);
    StdDraw.setPenColor(colorList[randomNumber]);
  }
}
