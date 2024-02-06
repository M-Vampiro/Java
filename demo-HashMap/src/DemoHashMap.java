import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        // Map:
        // 1. key value pair -> <key, value>
        // 2. key must be unique
        Map<String, Integer> ageBook = new HashMap<>();
        ageBook.put("John", 20);
        ageBook.put("John", 13); // update 20 -> 13, because "john" is the key which exists in the map
        ageBook.put("Mary", 3); // add a new entry

        System.out.println(ageBook.size()); // 2
        for (Map.Entry<String, Integer> entry : ageBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(ageBook.get("Mary")); // 3
        System.out.println(ageBook.get("John")); // 13
        System.out.println(ageBook.get("John")); // 13

        Map<Integer[], LocalDateTime> buttons = new HashMap<>();
        buttons.put(new Integer[] { 10, 20, 30, 40 }, LocalDateTime.now());
        buttons.put(new Integer[] { 10, 20, 30, 40 }, LocalDateTime.now());
        buttons.put(new Integer[] { 10, 20, 30, 40 }, LocalDateTime.now());
        buttons.put(null, null);
        System.out.println(buttons.size());
        for (Map.Entry<Integer[], LocalDateTime> entry : buttons.entrySet()) {
            System.out.println(Arrays.toString(entry.getKey()) + " " + entry.getValue());
        }

        Map<BigDecimal, Object> map = new HashMap<>();
        map.put(BigDecimal.valueOf(10), new Object());
        map.put(BigDecimal.valueOf(20), new Object());
        map.put(BigDecimal.valueOf(30), new Object());
        System.out.println(map.size());
        for (Map.Entry<BigDecimal, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey().doubleValue() + " " + entry.getValue());
        }

        Map<Void, ArrayList<String>> test = new HashMap<>();
        test.put(null, new ArrayList<>(10));
        test.put(null, new ArrayList<>(10));
        test.put(null, new ArrayList<>(10));
        System.out.println(test.size());
        for (Map.Entry<Void, ArrayList<String>> entry : test.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Map<String, Book>
        Map<String, Book> books = new HashMap<>();
        books.put("Andie", new Book("How to tie a tie"));
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println("Author: ".concat(entry.getKey()) + ", " + entry.getValue().getName());
        }
        // put book
        // put book name\
        
        System.out.println("the quick brown fox jumps over the lazy dog".replace(" ", ""));



    }
}
