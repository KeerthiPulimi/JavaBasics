class Arrayy {
  int num = 3;

  public int add(int n1, int n2) {
    return n1 + n2;

  }

}

public class ArrayExample {
  public static void main(String[] args) {
    Arrayy obj = new Arrayy();
    Arrayy obj1 = new Arrayy();
    int r1 = obj.add(2, 5);
    // System.out.println(r1);
    obj.num = 9;
    System.out.println(obj.num);
    System.out.println(obj1.num);

  }

}
