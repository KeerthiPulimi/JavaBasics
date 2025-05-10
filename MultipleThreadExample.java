//class A extends Thread
// class A implements Runnable {
//   public void run() {
//     for (int i = 1; i <= 5; i++) {
//       System.out.println("HI");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//       }
//     }
//   }
// }

// class B extends Thread {
//   public void run() {
//     for (int i = 1; i <= 5; i++) {
//       System.out.println("Hello");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//       }
//     }
//   }
// }

public class MultipleThreadExample {
  public static void main(String[] args) {
    // Runnable obj1 = new A();
    // Runnable obj2 = new B();

    Runnable obj1 = () -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("HI");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }

    };

    Runnable obj2 = () -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }

    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    // System.out.println("Priority of obj1: " + obj1.getPriority());
    // obj2.setPriority(Thread.MAX_PRIORITY);

    // obj1.start(); // This now calls run()
    // obj2.start(); // This now calls run()

    t1.start();
    t2.start();
  }
}
