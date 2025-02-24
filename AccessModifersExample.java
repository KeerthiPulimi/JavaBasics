import other.*;

class C extends Aaa {

  public void abc() {
    System.out.println(marks);
  }

}

public class AccessModifersExample {
  public static void main(String[] args) {

    Aaa obj = new Aaa();
    System.out.println(obj.marks);

    obj.show();
  }

}

// public- is used if you want to use tht method or keyword anywhere in you
// folders

// private -saame class -variables can be used in the same class even though
// they are in same package

// default - used in same class, same package~non subclass, but not in different
// package ~subclass, differernt package~non-subclass.

// protected - used in same class, same package~non subclass, different package
// ~subclass, but not differernt package~non-subclass.