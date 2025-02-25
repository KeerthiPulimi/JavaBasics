
class A {
  public void show1() {
    System.out.println("in tt shhow");

  }

}

class B extends A {
  public void show2() {
    System.out.println("in cc shhow");
  }
}

public class TypeCastingExample {
  public static void main(String[] args) {

    double d = 4.5;
    int i = (int) d;

    System.out.println(i);

    A obj = (A) new B();
    // object is of casting class but refer to typecc classs - upcasting

    B obj1 = (B) obj;

    // now you are downcasting B obj 1
    obj1.show2();
    obj.show1();

  }

}
