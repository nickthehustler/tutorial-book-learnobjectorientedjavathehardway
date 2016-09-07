public class DogDriver {
  public static void main(String[] args) {
    Dog a = new Dog();

    Dog pal = new Dog("Lassie", "Rough Collie", 3, 26);
    Dog spike = new Dog("Yeller", "Mastador", 5, 43);
    Dog killer = new Dog("Thugger", "Pit Bull", 4, 50);

    System.out.println(pal.getName() + " is a " + pal.getBreed() + ".");
    System.out.println(spike.getName() + " is a " + spike.getBreed() + ".");
    System.out.println(killer.getName() + " is a " + killer.getBreed() + " that is " + killer.getAge() +
                       " years old and weighs " + killer.getWeight() + " kg.");

    System.out.println(pal.getEverything());
    System.out.println(a.getEverything());
  }
}
