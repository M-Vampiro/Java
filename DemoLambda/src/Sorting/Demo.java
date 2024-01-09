package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
  public static void main(String[] args) {
    // 1. Instance method
    List<String> strings = new ArrayList<>(List.of("ABC", "IJK", "DEF"));

    // length()
    List<Integer> strLength = strings.stream().map(String::length).collect(Collectors.toList());
    
    List<String> sortedStrings = strings.stream() // 
    .sorted((s1, s2) -> s1.length() > s2.length() ? 1 : -1)
    .collect(Collectors.toList());

    sortedStrings = strings.stream() // 
    .sorted(String::compareTo)
    .collect(Collectors.toList());

    // 2. Static method

    strings.stream().forEach(e -> System.out.println(e));

    // method reference: alternative as a lambda expression
    strings.stream().forEach(System.out::println);

    // When there's a single input, and there is only one input parameter of the method

    System.out.println(Integer.MAX_VALUE);




  }
}
