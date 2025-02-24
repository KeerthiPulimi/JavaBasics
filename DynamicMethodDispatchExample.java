class A {
  public void show() {
    System.out.println("in A show");
  }
}

class B extends A { // B should extend A, not C
  public void show() {
    System.out.println("in B show");
  }
}

class C extends A {
  public void show() {
    System.out.println("in C show");
  }
}

public class DynamicMethodDispatchExample {
  public static void main(String[] args) {

    A obj; // Reference of type A

    obj = new A(); // obj refers to an A instance
    obj.show(); // Output: in A show

    obj = new B(); // obj now refers to a B instance
    obj.show(); // Output: in B show (dynamic method dispatch)

    obj = new C(); // obj now refers to a C instance
    obj.show(); // Output: in C show (dynamic method dispatch)
  }
}
