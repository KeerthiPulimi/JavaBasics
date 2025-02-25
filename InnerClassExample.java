
class Aa {
  int age;

  public void show() {
    System.out.println("show");
  }

  static class Bb {
    public void config() {
      System.out.println("in config");
    }

  }
}

public class InnerClassExample {
  public static void main(String[] args) {
    Aa obj = new Aa();
    obj.show();

    // Aa.Bb obj1 = obj.new Bb();
    Aa.Bb obj1 = new Aa.Bb(); // if Bb is a static class

    obj1.config();

  }

}
