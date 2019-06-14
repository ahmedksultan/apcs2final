public class HTree {
  public static void main(String[] args) {
    /*
    StdDraw.setPenRadius(0.05);
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.point(0.5, 0.5);
    StdDraw.setPenColor(StdDraw.MAGENTA);
    StdDraw.line(0.2, 0.2, 0.8, 0.2);
    */

    //setting x and y coords to the middle of the canvas
    double x = 0.5;
    double y = 0.5;

    //recieving parameter, depth of recursion
    int N = Integer.parseInt(args[0]);

    //assignment recommends size = 0.5
    htree(N, x, y, 0.5);

  }
  public static void htree(int n, double x, double y, double size) {
    if (n != 0) {
      //creating points for the lines
      double left = x - size/2;
      double right = x + size/2;
      double bottom = y - size/2;
      double top = y + size/2;

      //drawing H
      StdDraw.line(left, bottom, left, top);
      StdDraw.line(right, bottom, right, top);
      StdDraw.line(left, y, right, y);

      //recursively drawing the next order of htrees
      htree(n-1, left, bottom, size/2);
      htree(n-1, left, top, size/2);
      htree(n-1, right, bottom, size/2);
      htree(n-1, right, top, size/2);
    }
  }
}
