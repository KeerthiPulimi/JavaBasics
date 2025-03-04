public class ExceptionHandlingExample {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;
    int nums[] = new int[5];
    String str = null;

    try {
      j = 18 / i;
      if (j == 0) {
        throw new ArithmeticException("i dont want to print 0");
      }
    } catch (ArithmeticException e) {
      j = 18 / i;
      System.out.println("thats the default " + e);
    }

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
