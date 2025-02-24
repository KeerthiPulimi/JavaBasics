//final - variable, method, class

// final - class -- if you make your class final no class can extend it
class Callc {
  public void sshow() {
    System.out.println("by keerthi");

  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class N extends Callc {

  public void sshow() {
    System.out.println("by snick");

  }
}

public class FinalExample {
  public static void main(String[] args) {
    // final - variable

    final int num = 8;
    // num = 9;
    System.out.println(num);

    // if you want to make any variable constant you can use final keyword

    // final - method -- if you have same thod in parent class and in child class
    // and when you create the new object with the and use that method the child
    // class overides the parent class -- you cn use final keyword stop method
    // overridding

    N obj = new N();
    obj.sshow();
    obj.add(4, 5);

  }

}
