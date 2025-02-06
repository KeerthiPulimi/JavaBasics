/* Two functions with the same name but different number of parameters 
   or two functions with the same name and same number of parameters but different data types */

class Calculator { // Fixed spelling
  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public double add(double n1, int n2) {
    return n1 + n2;
  }
}

public class MethodOverLoadingExample {
  public static void main(String[] args) { // Used "String[] args" instead of "String a[]"

    Calculator obj = new Calculator(); // Fixed spelling
    int r1 = obj.add(1, 2);
    System.out.println(r1); // Output: 3
  }

}
