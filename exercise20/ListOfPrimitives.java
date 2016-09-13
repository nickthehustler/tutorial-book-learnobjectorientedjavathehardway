import java.util.ArrayList;

public class ListOfPrimitives {
  public static void main(String[] args) {
    ArrayList<String> hats = new ArrayList<String>();

    hats.add("fez");
    hats.add("bowler");
    hats.add("beanie");
    hats.add("western");
    hats.add("fedora");

    System.out.println(hats);

    String jumble = "";
    for(String s : hats) {
      jumble += s;
    }
    System.out.println("All together now: " + jumble);

    // ArrayList<int> bins = new ArrayList<int>();
    ArrayList<Integer> bins = new ArrayList<Integer>();

    bins.add(new Integer(1));
    bins.add(new Integer(3));
    bins.add(new Integer(3));
    bins.add(new Integer(1));

    bins.add(1);
    bins.add(4);
    bins.add(6);
    bins.add(4);
    bins.add(1);

    System.out.println(bins);

    int total = 0;
    for(Integer N : bins) {
      int n = N.intValue();
      total += n;
    }
    System.out.println("The total is still " + total);

    ArrayList<Character> letters = new ArrayList<Character>();
    letters.add('z');  // auto-boxes char
    // Unboxing character
    char f = letters.get(0).charValue();
    System.out.println("Unboxed 'char': " + f);

    ArrayList<Double> weights = new ArrayList<Double>();
    weights.add(0.14); // auto-boxes double
    // Unboxing double
    double d = weights.get(0).doubleValue();
    System.out.println("Unboxed 'double': " + d);

    ArrayList<Boolean> dealt = new ArrayList<Boolean>();
    while(dealt.size() < 52)
      dealt.add(false); // auto-boxes boolean

    System.out.println("Max Long Value: " + Long.MAX_VALUE + ", Min Long Value: " + Long.MIN_VALUE);
    System.out.println("Max Integer Value: " + Integer.MAX_VALUE + ", Min Integer Value: " + Integer.MIN_VALUE);
    System.out.println("String conversion...'123456' has been converted to integer, " + Integer.parseInt("123456") + ".");
  }
}
