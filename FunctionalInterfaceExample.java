@FunctionalInterface
// if you have any intention of writing only one funtion in interface you can
// write that annotation
interface A {
  void show();
}

// class B implements A {
// public void show() {
// System.out.println("in show");
// }
// }

public class FunctionalInterfaceExample {
  public static void main(String[] args) {
    // A obj = new B();
    A obj = new A() {
      public void show() {
        System.out.println("iin show");
      }
    };

    obj.show();

  }

}
