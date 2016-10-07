public class WeakDoor extends AbstractDoor {

  public WeakDoor(boolean b) { super(b); }

  public double soundProofing() {
    if(isOpen)
      return 0;
    else
      return 5.3;
  }

}
