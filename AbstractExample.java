abstract class Car {

  public abstract void drive();

  public void playMusic() {
    System.out.println("playmusic");

  }

  public abstract void flying();

}

abstract class WagonK extends Car {

  public void drive() {
    System.out.println("Driving..");
  }

}

class UpdatedWagonK extends WagonK { // concrete class

  public void flying() {
    System.out.println("upadetd flying");
  }

}

public class AbstractExample {
  public static void main(String[] args) {

    Car obj = new UpdatedWagonK();
    obj.drive();
    obj.playMusic();
    obj.flying();

  }

}

// only abstract classes can have abstract methods
// you cant create object of abstract class
