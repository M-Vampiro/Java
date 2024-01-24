package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Answers.valueOf;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.doubleThat;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  // Compare int, String
  @Test
  void testIntegerString() {
    int actual = 45;
    assertThat(actual, is(equalTo(45)));
    assertThat(actual, is(not(equalTo(44))));

    String actual2 = "hello";
    assertThat(actual2, equalTo("hello"));
    assertThat(actual2, not(equalTo("helloo")));
    assertThat(actual2, containsString("ll"));
    assertThat(actual2, not(containsString("abc")));

    assertThat("", emptyString());
    assertThat(" ", not(emptyString()));
    assertThat(null, not(emptyString()));

    assertThat(actual2, allOf( //
        not(emptyString()), //
        equalTo("hello"), //
        startsWith("h"), //
        endsWith("o") //
    ));

  }

  @Test
  void testNullValue() {
    String actual = null;
    assertThat(actual, nullValue());

    String actual2 = "hello";
    assertThat(actual2, notNullValue());
  }

  @Test
  void testSameObject() {
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, sameInstance(s2));

    String s3 = new String("hello");
    assertThat(s2, sameInstance(s3));
  }

  @Test
  void testAllRangeOfResult() {
    int result = 48; // call main code, e.g. calculate('M', 40)
    assertThat(result, allOf( //
        greaterThan(47), //
        lessThan(50), //
        greaterThanOrEqualTo(48), //
        lessThanOrEqualTo(48) //
    ));

    String actual = "world";
    assertThat(actual, anyOf( //
        equalTo("hello"), //
        equalTo("world") //
    ));

    Character character = Character.valueOf('D');
    assertThat(character, allOf( //
        not(equalTo('E')), //
        equalTo('D') //
    ));
  }

  @Test
  void testAllRangeOfResult2() {
    int result = 48; // call main code, e.g. calculate('M', 40)
    // same as allOf
    assertThat(result, greaterThan(47));
    assertThat(result, lessThan(50));
    assertThat(result, greaterThanOrEqualTo(48));
    assertThat(result, lessThanOrEqualTo(48));
  }

  @Test
  void testCollection() {
    List<String> strings = new ArrayList<>(List.of("John", "Peter", "Jenny"));
    assertThat(strings, hasItems("Peter"));
    assertThat(strings, not(hasItems("Peters")));
    assertThat(strings, hasSize(3));
    assertThat(strings, contains("Jenny"));

    // what is the difference between contains() and hasItems()

    assertThat(strings.size(), allOf( //
        lessThanOrEqualTo(100), //
        greaterThanOrEqualTo(0) //
    ));

    // What is the difference between contains() and hasItems()
    // 1. contains() & containsInAnyOrder() -> with all items
    // 2. hasItems() -> with specific items only, no ordering

  }

  @Test
  void testArray() {
    String[] strings = new String[3];
    strings[0] = "John";
    strings[1] = "Ken";
    strings[2] = "Steven";

    assertThat(strings, arrayContaining("John", "Ken", "Steven"));
    assertThat(strings, not(arrayContaining("Ken", "Steven")));
    assertThat(strings, not(arrayContainingInAnyOrder("John", "Ken", "Steven")));

    assertThat(strings, arrayContainingInAnyOrder("John", "Steven"));
    assertThat(strings, arrayContainingInAnyOrder("Ken", "Steven"));
    assertThat(strings, not(arrayContainingInAnyOrder("John", "Ken", "Steven")));

  }

  @Test
  void testTolerance() {
    double tolerance = 0.01d;
    double actual = 3.14154d; // 3.13150 <= x < 3.15149
    assertThat(actual, not(closeTo(3.13149, tolerance)));
    assertThat(actual, not(closeTo(3.13150, tolerance)));
    assertThat(actual, not(closeTo(3.1516, tolerance)));
  }

  @Test
  void testObject() {
    Object obj = "hello"; // Polymorphism
    System.out.println(obj); // toString() -> address
    assertThat(obj, instanceOf(String.class));
    assertThat(obj, not(instanceOf(Integer.class)));
    
    if (obj instanceof String) {
      String s = (String) obj;
    }
    obj = 1000; // Integer.class

    //if (obj instanceof Integer) {
    //  Integer i = (Integer) obj;
    //}
  }

  @Test
  void testAnimal() {
    Animal animal = Animal.get(3);
    assertThat(animal, instanceOf(Dog.class));

    Animal animal2 = Animal.get(10);
    assertThat(animal2, instanceOf(Cat.class));
  }

  @Test
  void testCompatible() {
    assertThat(Cat.class, typeCompatibleWith(Animal.class));
    assertThat(Cat.class, typeCompatibleWith(Object.class));
    assertThat(Cat.class, not(typeCompatibleWith(Integer.class)));
    assertThat(Cat.class, not(typeCompatibleWith(Dog.class)));
    assertThat(Animal.class, not(typeCompatibleWith(Cat.class)));

  }
}
