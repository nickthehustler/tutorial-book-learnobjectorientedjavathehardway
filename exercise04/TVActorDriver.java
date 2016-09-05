public class TVActorDriver {
  public static void main(String[] args) {
    TVActor a = new TVActor();
    a.name = "Thomas Middleditch";
    a.role = "Richard Hendricks";
    a.age = 34;

    TVActor b = new TVActor();
    b.name = "Martin Starr";
    b.role = "Bertram Gilfoyle";
    b.age = 28;

    TVActor c = new TVActor();
    c.name = "Kumail Nanjiani";
    c.role = "Dinesh Chugtai";
    c.age = 40;

    System.out.println(a.name + " played " + a.role + ". " + a.name + " is " + a.age + " years old.");
    System.out.println(b.name + " played " + b.role + ". " + b.name + " is " + b.age + " years old.");
    System.out.println(c.name + " played " + c.role + ". " + c.name + " is " + c.age + " years old.");
  }
}
