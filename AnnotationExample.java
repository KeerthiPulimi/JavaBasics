
//@Deprecated
// you can use it but dont use it - means will be removed soon
class A {
  public void showTheDataWhichBelongsToThisClass() {
    System.out.println("in A show");
  }
}

class B extends A {

  @Override
  public void showTheDataWhichBelongsToThisClass() {
    System.out.println("in B show");
  }
}

public class AnnotationExample {
  public static void main(String[] args) {
    B obj = new B();
    obj.showTheDataWhichBelongsToThisClass();
  }

}
// if you method name is big and you are trying to call that method when your
// method name is big ,,