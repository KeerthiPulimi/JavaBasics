//if you want to make objects as threads just extend the class with threads

class A extends Thread {
  public void show() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("HI");
    }
  }
}

class B extends Thread {
  public void show() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Hello");
    }
  }
}

public class MultipleThreadExample {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();

    // obj1.show();
    // obj2.show();

    obj1.start();
    obj2.start();
  }
}
