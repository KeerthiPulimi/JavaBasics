public class ExceptionHandlingExample {
  public static void main(String[] args) {
    int i = 2;
    int j = 0;
    int nums[] = new int[5];
    String str = null;

    try {
      j = 18 / i;
    } catch (ArithmeticException e) {
      System.out.println("cannot divide by zero" + e);
    }

    try {
      System.out.println(str.length());
      System.out.println(nums[1]); // Valid
      System.out.println(nums[5]); // ❌ Still out of bounds
    } catch (ArrayIndexOutOfBoundsException e1) {
      System.out.println("out of limit");
    } catch (Exception e2) {
      System.out.println("something went wrong");
    }

    System.out.println(j); // This will now execute
  }
}
