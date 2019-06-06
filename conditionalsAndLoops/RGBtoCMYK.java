public class RGBtoCMYK {
  public static void main(String[] args) {
    int red = Integer.parseInt(args[0]);
    int green = Integer.parseInt(args[1]);
    int blue = Integer.parseInt(args[2]);

    double R = (double)red / 255;
    double G = (double)green / 255;
    double B = (double)blue / 255;

    double white;

    white = Math.max(R, G);
    white = Math.max(G, B);

    double cyan = (white - R) / white;
    double magenta = (white - G) / white;
    double yellow = (white - B) / white;
    double black = (1 - white);

    //printed result
    System.out.println(cyan);
    System.out.println(magenta);
    System.out.println(yellow);
    System.out.println(black);
  }
}
