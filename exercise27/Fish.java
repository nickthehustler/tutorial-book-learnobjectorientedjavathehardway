public class Fish {
  private String name;
  private int id;
  private static int count = 0;

  public Fish(String name) {
    this.name = name;
    count++;
    id = count;
  }

  public String toString() {
    String color;

    if(id % 2 == 0)
      color = "blue";
    else
      color = "red";

    return name + ", is " + color + " and is fish #" + id + " of " + count;
  }

  public static int numCreated() {
    return count;
  }
}
