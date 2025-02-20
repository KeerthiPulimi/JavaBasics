
class Human {
  private int age;
  private String name;

  // default constructor
  public Human() {
    System.out.println("in constructor");

    age = 90;
    name = "olive";

  }

  // parameterized constructor

  public Human(int a, String n) {
    age = a;
    name = n;

  }

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

public class ConstructorExample {
  public static void main(String[] args) {
    Human obj = new Human();
    Human obj1 = new Human(34, "chapati");

    System.out.println(obj.getName() + ":" + obj.getAge());
    System.out.println(obj1.getName() + ":" + obj1.getAge());
  }

}

// If we want to assign the values while an object is being created then we can
// use constructor.
// a constructor looks like a method itself

// everytime you create an object it will call the constructor
