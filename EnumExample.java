enum Status {
  Running, Failed, Pending, Success;

}

public class EnumExample {
  public static void main(String[] args) {
    Status s = Status.Pending;
    // System.out.println(s);
    // System.out.println(s.ordinal());
    // Status ss[] = Status.values();
    // System.out.println(ss[0]);
    // for (Status sss : ss) {
    // System.out.println(sss + ":" + sss.ordinal());

    // }

    // Status a = Status.Pending;

    switch (s) {
      case Running:
        System.out.println("all good");
        break;

      case Pending:
        System.out.println("pending");
        break;
      default:
        System.out.println("bye");

    }

    if (s == Status.Running) {
      System.out.println("all good");
    } else if (s == Status.Failed) {
      System.out.println("try again");
    } else if (s == Status.Pending) {
      System.out.println("please wait");
    } else {
      System.out.println("all done");
    }

  }

}
