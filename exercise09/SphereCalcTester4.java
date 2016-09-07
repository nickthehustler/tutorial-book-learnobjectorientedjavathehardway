public class SphereCalcTester4 {
  public static void main(String[] args) {

    SphereCalc4 c = new SphereCalc4(5);

    if(isNear(c.getSurfaceArea(), 314.159265359))
      System.out.println("PASS: surfaceArea for " + c.getRadius());
    else
      System.out.println("FAIL: surfaceArea not what was expected!");
    if(isNear(c.getVolume(), 523.598775598))
      System.out.println("PASS: volume for " + c.getRadius());
    else
      System.out.println("FAIL: volume not what was expected!");

    SphereCalc4 d = new SphereCalc4(0.1);

    if(isNear(d.getSurfaceArea(), 0.125663706))
      System.out.println("PASS: surfaceArea for " + d.getRadius());
    else
      System.out.println("FAIL: surfaceArea not what was expected!");
    if(isNear(d.getVolume(), 4.18879E-3))
      System.out.println("PASS: volume for " + d.getRadius());
    else
      System.out.println("FAIL: volume not what was expected!");

  }

  public static boolean isNear(double a, double b) {
    return Math.abs(a - b) < 1E-9;
  }
}
