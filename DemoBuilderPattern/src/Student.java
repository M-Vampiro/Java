import java.util.ArrayList;
import java.util.List;

public class Student {

    // Builder pattern advantage:
    // 1. If you want to control the access to setter after the object created,
    // builder pattern is good choice
    // 2. You don't have to create too much construtors, according to the attributes
    private String name;

    private int age;

    private List<String> subjects;

    // 10 Fields ... all arguments constructor -> 3 constructor
    // 9 fields costructor? N constructor ...

    private Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.subjects = builder.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        private int age;

        private List<String> subjects;

        public Builder name(String name) { // Setter
            this.name = name;
            return this;
        }

        public Builder age(int age) { // Setter
            this.age = age;
            return this;
        }

        public Builder subjects(List<String> subjects) { // Setter
            this.subjects = subjects;
            return this;
        }

        public Student build() {
            return new Student(this.name, this.age, this.subjects);
        }

    }

    public static void main(String[] args) {
        Student student = new Student("John", 13, new ArrayList<>(List.of("Math", "English")));

        Student student2 = new Student.Builder()
                .name("Peter")
                .age(15)
                .subjects(new ArrayList<>(List.of("Math", "English"))).build();

        Student student3 = Student.builder()
                .name("May")
                .build();

        System.out.println(student3.name);

    }

}
