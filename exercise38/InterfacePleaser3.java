public class InterfacePleaser3 implements ArbitraryInterface {
  private int number;

  public InterfacePleaser3() {
    this.number = 99;
  }

  public InterfacePleaser3(int number) {
    this.number = number;
  }

  public void doSomething(int n) {
    System.out.println(n);
  }

  public double getNumber() {
    return number * 2000.0;
  }
}
