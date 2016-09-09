import java.util.ArrayList;

public class ArrayListIntro {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();

    System.out.println("ArrayList has size(): " + arr.size());

    arr.add("Ant-Man");
    arr.add("Hulk");
    arr.add("Iron Man");
    arr.add("Thor");
    arr.add("Wasp");

    System.out.println("ArrayList has size(): " + arr.size());
    System.out.println("Current contents: " + arr);
    showList(arr);

    System.out.println("---------------------------------");
    System.out.println("Adding 'Jarvis' to the ArrayList.");
    arr.add(3, "Jarvis"); // inserts into slot 3; others slide right
    showList(arr);

    System.out.println("---------------------------------");
    System.out.println("Removing 'Hulk' from the ArrayList.");
    int i = arr.indexOf("Hulk");
    System.out.println(arr.get(i) + " is located in slot " + i);
    arr.remove(i); // removes value in that slot; others slide left
    showList(arr);

    System.out.println("---------------------------------");
    System.out.println("Adding 'Captain America' from the ArrayList.");
    arr.add(1, "Captain America"); // original slot 1 and other slide right
    showList(arr);

    System.out.println("---------------------------------");
    System.out.println("Setting 'Cap' to slot 1 from the ArrayList.");
    arr.set(1, "Cap"); // replaces the value in slot 1
    showList(arr);

    arr.remove(5);      // removing backwards lets us avoid sliding
    arr.remove(4);
    arr.remove(2);
    arr.remove(0);
    showList(arr);

    arr.add("Hawkeye");
    arr.add("Quicksilver");
    arr.add("Scarlet Witch");
    showList(arr);

    System.out.println("Current contents: " + arr);

    ArrayList<String> nicksArray = new ArrayList<String>();
    nicksArray.add("Home Depot");
    System.out.println("Size of Nick's Array after adding an item: " + nicksArray.size());
    nicksArray.add("Landis+Gyr");
    nicksArray.add("Texas Instruments");
    nicksArray.add("GE Energy");
    System.out.println("Size of Nick's Array after adding several items: " + nicksArray.size());
    System.out.println("Here is Nick's Array.");
    showList(nicksArray);
    nicksArray.remove(1);
    System.out.println("Here is Nick's Array after removing a single item.");
    showList(nicksArray);
  }

  public static void showList(ArrayList<String> a) {
    System.out.println("size() is " + a.size());
    for(int i = 0; i < a.size(); i++) {
      int len = a.get(i).length() + 4; // two quotes, two spaces
      System.out.print("|" + centerPad("" + i, len));
    }
    System.out.println("|");
    for(String s : a)
      System.out.print("| \"" + s + "\" ");
    System.out.println("|\n");
  }

  public static String centerPad(String s, int width) {
    int totalSpaces = width - s.length();
    int leftSide = totalSpaces / 2;
    int rightSide = totalSpaces - leftSide;
    String out = "";
    for(int i = 0; i < leftSide; i++)
      out += " ";
    out += s;
    for(int i = 0; i < rightSide; i++)
      out += " ";
    return out;
  }
}

