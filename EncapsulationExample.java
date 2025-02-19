class Human {
  private int age = 18;
  private String name = "kee";

  public int getAge() {
    return age;

  }

  public String getName() {
    return name;

  }

  public void setAge(int a) {
    age = a;
  }

  public void setName(String n) {
    name = n;
  }

}

public class EncapsulationExample {
  public static void main(String[] args) {
    Human obj = new Human();
    // obj.age = 11;
    // obj.name = "kee";
    obj.setAge(21);
    obj.setName("pulimi kanaka keerthi");

    System.out.println(obj.getName() + ":" + obj.getAge());
  }

}
