abstract class Aaaa {
  public abstract void show();
}

class Bbbb extends Aaaa {
  public void show() {
    System.out.println("in Bbbb show");
  }

}

public class AnonymInnerClassExample {
  public static void main(String[] args) {
    Aaaa obj = new Aaaa() {
      public void show() {
        System.out.println("in neww show");
      }
    };
    obj.show();
  }

}

// you can use anonymous class for abstract inner class
