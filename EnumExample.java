enum Status {
  Running, Failed, Pending, Success;

}

public class EnumExample {
  public static void main(String[] args) {
    Status s = Status.Running;
    System.out.println(s);
    System.out.println(s.ordinal());
    Status ss[] = Status.values();
    System.out.println(ss[0]);
    for (Status sss : ss) {
      System.out.println(sss + ":" + sss.ordinal());

    }

    Status a = Status.Pending;

  }

}
