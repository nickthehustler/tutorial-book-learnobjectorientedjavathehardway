public class Dude {
  private int age;
  private String name;
  private double weight;

  public Dude(String name, int age, double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  @Override
  public boolean equals(Object obj){
    if(obj == null)
      return false;

    Dude other  = null;

    try {
      other = (Dude)obj;
    }
    catch(ClassCastException e) {
      return false;
    }
    return (this.age == other.age && this.name.equals(other.name) && Math.abs(this.weight - other.weight) < 0.01);
  }

  @Override
  public String toString(){
    return name + "|" + age;
  }
}
