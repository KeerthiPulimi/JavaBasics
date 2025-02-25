//class to class - extends
//class to interface - implements
//interface to interface - extends

interface A {
  int age = 4;
  String area = "bnglr";

  void show();

  void config();

}

interface X {
  void man();
}

interface Y extends X {

}

class B implements A, X {
  public void show() {
    System.out.println("in shw B");

  }

  public void config() {
    System.out.println("in config");
  }

  public void man() {
    System.out.println("in man");
  }
}

public class InterfaceExample {
  public static void main(String[] args) {
    A obj;
    obj = new B();
    obj.show();
    obj.config();
    X obj1 = new B();
    obj1.man();
    System.out.println(A.area);

  }

}
