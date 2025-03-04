class KeerthiException extends Exception {
  public KeerthiException(String string) {
    super(string);

  }
}

class A {
  public void show() throws ClassNotFoundException {
    try {
      Class.forName("Demo");
    } catch (ClassNotFoundException e3) {
      System.out.println("not able to find");

    }

  }
}

public class ExceptionHandlingExample {
  static {
    System.out.println("static");
  }

  public static void main(String[] args) {

    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    int i = 18;
    int j = 0;
    int nums[] = new int[5];
    String str = null;

    try {
      j = 18 / i;
      // if (j == 0) {
      // throw new ArithmeticException("i dont want to print 0");
      // }
      // exception with throw keyword
      if (j == 1) {
        throw new KeerthiException("keerthi");
      }
    } catch (KeerthiException e) {
      j = 18 / 1;
      System.out.println("That's the default: " + e);
    }
    // } catch (ArithmeticException e) {
    // j = 18 / i;
    // System.out.println("thats the default " + e);
    // }

    // try {
    // System.out.println(str.length());
    // System.out.println(nums[1]); // Valid
    // System.out.println(nums[5]); // ❌ Still out of bounds
    // } catch (ArrayIndexOutOfBoundsException e1) {
    // System.out.println("out of limit");
    // }
    catch (Exception e2) {
      System.out.println("something went wrong");
    }

    System.out.println(j); // This will now execute
  }
}
