public class Ordered {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);

    boolean isOrdered = false;

    if (x > y && y > z) {
      isOrdered = true;
    }
    if (x < y && y < z) {
      isOrdered = true;
    }

    System.out.println(isOrdered);
  }
}
