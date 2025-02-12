class Mobile {
  String brand;
  int price;

  static String name;

  public Mobile() {
    brand = "";
    price = 200;
    // name="phone";
    System.out.println("constructor");

  }

  static {
    name = "phone";
    System.out.println("statis");
  }

  public void show() {
    System.out.println(brand + ":" + price + ":" + name);

  }

}

public class StaticExample {
  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand = "vivo";
    obj1.price = 22000;
    // obj1.name = "smartphone";
    Mobile.name = "smartphone";

    // // Mobile obj2 = new Mobile();
    // // obj2.brand = "apple";
    // // obj2.price = 222000;
    // // // obj2.name = "ios";
    // // // Mobile.name = "ios";

    // // obj1.show();
    // // obj2.show();

    Mobile obj3 = new Mobile();

  }

}

// when every object is being created the class loader loads the class and
// static is called and after that 2 times the constructor is called ,,,,, if
// you dont create any object no output will come ,,,, but what if you want to
// load the class into class loader but not create any object ,, in that caase
// you can use class class
