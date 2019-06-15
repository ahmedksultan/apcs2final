public class Sierpinski {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    //double[] xAry = {0.5, 0.25, 0.75};
    //double[] yAry = {0, Math.sqrt(3)/4, Math.sqrt(3)/4};
    //StdDraw.filledPolygon(xAry, yAry);
    sierpinski(N, 0.5, 0, 0.5);
  }

  public static void sierpinski(int n, double x, double y, double size) {
    if (n != 0) {
      double xB = x;
      double yB = y;
      double xL = xB - (size/2);
      double yL = yB + (Math.sqrt(3)) * size / 2;
      double xR = xB + (size/2);
      double yR = yB + (Math.sqrt(3)) * size / 2;

      double[] xAry = {xB, xL, xR};
      double[] yAry = {yB, yL, yR};

      StdDraw.filledPolygon(xAry, yAry);

      sierpinski(n-1, xB, yL, size / 2);
      sierpinski(n-1, xL, yB, size / 2);
      sierpinski(n-1, xR, yB, size / 2);
    }
  }

  public static void triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    StdDraw.line(x1, y1, x2, y2);
    StdDraw.line(x1, y1, x3, y3);
    StdDraw.line(x2, y2, x3, y3);
  }
}
