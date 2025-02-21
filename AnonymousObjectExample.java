class A {
  public A() {
    System.out.println("object created");
  }

  public void show() {
    System.out.println("in A show");
  }

}

public class AnonymousObjectExample {
  public static void main(String[] args) {

    int marks;
    marks = 99;
    A obj = new A();
    obj.show();

    new A();

  }

}

// here A obj = new A(); this has a referance object but new A(); has no
// refernace object