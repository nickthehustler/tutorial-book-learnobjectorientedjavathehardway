public class InterfaceDriver {
  public static void main(String[] args) {
    ArbitraryInterface a1 = new InterfacePleaser();
    ArbitraryInterface a2 = new InterfacePleaser2(10);
    // ArbitraryInterface a3 = new ArbitraryInterface(); // WON'T COMPILE
    ArbitraryInterface a3 = new InterfacePleaser3(42);

    a1.doSomething(5);
    a2.doSomething(5);
    a3.doSomething(67);

    System.out.println(a1.getNumber());
    System.out.println(a2.getNumber());
    System.out.println(a3.getNumber());
  }
}
