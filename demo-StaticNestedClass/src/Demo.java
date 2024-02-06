public class Demo {

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(100);

    

    System.out.println(c.add(100));
    System.out.println(c.getValue());

  }
}