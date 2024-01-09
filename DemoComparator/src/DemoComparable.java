import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {

        // Comparable

        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 40));
        students.add(new Student("B", 10));
        students.add(new Student("C", 90));
        students.add(new Student("D", 20));
        students.add(new Student("A", 30));

        Collections.sort(students);
        System.out.println(students);

        // SortbyScore
        Collections.sort(students, new SortbyScore());
        System.out.println(students);

        // SortbyName
        Collections.sort(students, new SortbyName());
        System.out.println(students);
        
        int[] salary = new int[] {1,2,3,4};

        List<Integer> ls = new ArrayList<>();
        for (int i : salary) {
            ls.add(i);
        }
        Collections.sort(ls);
        ls.remove(0);
        ls.remove(ls.size() - 1);
        System.out.println(ls);
        int sum = 0;
        for (int i = 0 ; i < ls.size() - 1; i++) {
            sum += ls.get(i);
        }
        System.out.println(sum);
    System.out.println((double) sum / ls.size());
    
    

    }
}
