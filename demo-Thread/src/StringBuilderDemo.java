public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    StringBuffer sbf = new StringBuffer();

    sbf.append("hello").append("world");
    System.out.println(sbf.toString()); // helloworld

    // StringBuilder vs StringBuffer
    // Runnable -> append "x" 1_000_000 times -> StringBuilder
    // Runnable -> append "x" 1_000_000 times -> StringBuffer

    StringBuilder sb2 = new StringBuilder();

    StringBuffer sbf2 = new StringBuffer();

    Runnable work1 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sb2.append("x");
      }
    };
    Runnable work2 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        sbf2.append("x");
      }
    };

    Thread sbtest = new Thread(work1);

    Thread sbtest2 = new Thread(work1);

    Thread sbftest = new Thread(work2);

    Thread sbftest2 = new Thread(work2);

    sbtest.start();
    sbftest.start();
    sbtest2.start();
    sbftest2.start();

    try {
      sbftest.join();
      sbtest.join();
      sbftest2.join();
      sbtest2.join();

    } catch (InterruptedException e) {

    }

    System.out.println(sb2.length());
    System.out.println(sbf2.length());

  }
}
