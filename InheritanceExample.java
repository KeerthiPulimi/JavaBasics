import other.tools.AdvCalc;

public class InheritanceExample {
  public static void main(String[] args) {
    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(7, 4);
    int r2 = obj.sub(8, 2);
    int r3 = obj.mul(8, 2);
    int r4 = obj.div(8, 2);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

  }

}
