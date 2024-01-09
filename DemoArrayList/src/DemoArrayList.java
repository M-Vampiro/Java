import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        // Before Java 1.5 (No Generic)
        // ???
        // List anything
        //
        ArrayList<String> s1 = new ArrayList<String>();

        // After Java 1.7
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("ABC");
        s2.add("DEF");
        s2.add("JKL");
        System.out.println(s2.size());

        for (int i = 0; i < s2.size(); i++) {
            System.out.println(s2.get(i));
        }
        // for-each
        for (String s : s2) {
            System.out.println(s);
        }

        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(10);
        i1.add(20);
        i1.add(30);
        // for loop
        for (int i = 0; i < i1.size(); i++) {
            System.out.println(i1.get(i));
        }
        // while loop
        int count = 0;
        while (count < i1.size()) {
            System.out.println(i1.get(count));
            count++;
        }
        // for-each loop
        for (int i : i1) {
            System.out.println(i);
        }

        s2.remove(2);
        System.out.println(s2);

        s2.remove("ABC");
        System.out.println(s2);

        ArrayList<String> str = new ArrayList<>(List.of("1234", "2345", "0000"));
        s2.addAll(str);
        System.out.println(s2);

        ArrayList<Integer> i3 = new ArrayList<>(List.copyOf(i1));
        for (String s : str) {
            i3.add(Integer.parseInt(s));
            System.out.println(i3);
        }
        // remove All
        s2.removeAll(str);
        System.out.println(s2);

        s2.add(1, "CCC");
        System.out.println(s2);

        s2.set(1, "DDD");
        System.out.println(s2);

        System.out.println(s2.subList(1, 2));

        System.out.println(s2.indexOf("0000"));

        // List<> is an Interface implemented by ArrayList.class
        List<String> str2 = new ArrayList<>();
        str2.add("ABC");
        str2.remove(0);
        System.out.println(str2);

        System.out.println(str2.contains("ABC"));

        if(!(str2.contains("ABC"))) {
            str2.add("AAA");
        }

        //
        List<String> arrlist1 = new ArrayList<>(List.of("John", "Mary", "Peter"));
        List<String> arrlist2 = List.of("John", "Mary", "Peter");

        arrlist1.add("Sally");
        arrlist1.remove("Mary");

        arrlist2.set(1, "Sally"); // java.lang.UnsupportedOperationException
        arrlist2.add("Mary"); // java.lang.UnsupportedOperationException


        //
        // List<Book>

        List<String> ls = new ArrayList<>(100); // capacity (array length)
        System.out.println(ls.size()); // Size = 0 (how many elements)

        
    }
}
