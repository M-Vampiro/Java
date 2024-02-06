import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        Set<String> ss = new HashSet<>(); // Set is an interface, Hashset is a class
        List<String> ls = new ArrayList<>();

        ls.add("ABC");
        ls.add("ABC");
        ls.add("ABC");

        for (String s : ls) {
            System.out.println(ss.add(s));
        }

        System.out.println(ss.size());
        System.out.println(ss.toArray()[0]);
        
        System.out.println(ls.remove("10"));
            

    }
}
