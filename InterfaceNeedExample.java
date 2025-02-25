
// //abstract class Computerr{
//   public abstract void code();
// }

interface Computerr {
  void code();
}

// class Laptopp extends Computerr {
// public void code() {
// System.out.println("code,compile,run");
// }
// }

class Laptopp implements Computerr {
  public void code() {
    System.out.println("code,compile,run");
  }
}

class Desktopp implements Computerr {
  public void code() {
    System.out.println("code,compile,run: Faster");
  }
}

class Developer {
  public void devApp(Computerr a) {
    a.code();
    // System.out.println("coding");
  }
}

public class InterfaceNeedExample {
  public static void main(String[] args) {
    Computerr lap = new Laptopp();
    Computerr desk = new Desktopp();

    Developer obj = new Developer();
    obj.devApp(desk);
  }

}
