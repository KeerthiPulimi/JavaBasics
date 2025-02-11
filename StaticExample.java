class Mobile {
  String brand;
  int price;

  String name;

  public void show() {
    System.out.println(brand + ":" + price + ":" + name);

  }

}

public class StaticExample {
  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand = "vivo";
    obj1.price = 22000;
    obj1.name = "smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand = "apple";
    obj2.price = 222000;
    obj2.name = "ios";

    obj1.show();
    obj2.show();

  }

}
