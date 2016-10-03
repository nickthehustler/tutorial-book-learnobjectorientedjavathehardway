public class DropGamePieceTester {
  public static void main(String[] args) {
    DropGamePiece one = new DropGamePiece(5,5,"A");
    Location oneLoc = one.getLocation();
    DropGamePiece two = new DropGamePiece(oneLoc.below(), "B");
    System.out.println(one + "\n" + two);
    two.translate(-1,0);
    System.out.println(one + "\n" + two);
    System.out.println(one.compareTo(two));

    System.out.println("======= Testing equals() method ============");
    DropGamePiece three = new DropGamePiece(oneLoc, "A");
    System.out.println("  Are 'one' and 'two' are equal: " + one.equals(two));
    System.out.println("Are 'one' and 'three' are equal: " + one.equals(three));

  }
}
