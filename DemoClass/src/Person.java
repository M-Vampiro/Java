// blueprint, to produce Person objects

public class Person {
    // Attributes
    private String firstName;
    private String lastName;
    private int age; // 0

    // Constructor (Produce Person's Obj.)
    public Person() {

    }

    // Augment Constructor
    public Person(String x, String y, int age) {
        this.firstName = String.valueOf(x.charAt(0)).toUpperCase().concat(x.substring(1, x.length()));
        this.lastName = String.valueOf(y.charAt(0)).toUpperCase().concat(y.substring(1, y.length()));
        this.age = age;
    }

    public Person(String x) {
        this.firstName = String.valueOf(x.charAt(0)).toUpperCase().concat(x.substring(1, x.length()));
    }

    // instance Method (Obj. Method)
    // Setter
    public void setfirstName(String x) {
        this.firstName = String.valueOf(x.charAt(0)).toUpperCase().concat(x.substring(1, x.length()));
    }

    public void setlastName(String y) {

        this.lastName = String.valueOf(y.charAt(0)).toUpperCase().concat(y.substring(1, y.length()));
    }
    // Getter

    public String getfirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    // Overloading
    public String getfullName() {
        if (this.firstName != null && this.lastName == null) {
            return this.firstName;
        } else if (this.lastName != null && this.firstName == null) {
            return this.lastName;
        } else {
            return this.firstName.concat(" ").concat(this.lastName);
        }
    }

    public String getfullName2() {
        return this.lastName.isEmpty() ? this.firstName : this.firstName.concat(" ").concat(this.lastName);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setfirstName("john");
        Person p2 = new Person();
        p2.setfirstName("mary");
        Person p3 = p2;
        p3.setfirstName("mary");
        Person p4 = new Person("eddy", "hall", 0);
        System.out.println(p4.getfirstName());
        System.out.println(p4.getfullName());
        Person p5 = new Person("chloe");
        System.out.println(p5.getfullName());
    }
}