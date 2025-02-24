class A {
  public A() {
    System.out.println("in A");
  }

  public A(int n) {
    super();
    System.out.println("in  int A");
  }

  public void show() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'show'");
  }

}

class B extends A {
  public B() {
    super();
    System.out.println("in B");
  }

  public B(int n) {
    this();
    System.out.println("in int  B");
  }

}

public class ThisandsuperExample {
  public static void main(String[] args) {
    B obj = new B(5);
  }

}

// super method means call the constructor of super class

// every class in java extends object class

// for B ,A is super class, and for A , Object is super class

// this keyword will execte the constructor for same class
