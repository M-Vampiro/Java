// blueprint, to produce Person objects

public class Person {
    // Attributes
    private String name;

    private int age; // 0

    // Constructor (Produce Person's Obj.)
    public Person() {

    }

    public Person(String x) {
        this.name = x;
    }

    // instance Method (Obj. Method)
    // Setter
    public void setName(String x) {
        this.name = x;
    // Getter
    }
    public String getName() {
        return this.name;

    }
    

public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John");
    Person p2 = new Person();
    p2.setName("Mary");
    Person p3 = p2;
    p3.setName("Mary");
    Person p4 = new Person("Eddy");
    Person p5 = p4;
    System.out.println(p4.getName());
    System.out.println(p5.getName());

}
}