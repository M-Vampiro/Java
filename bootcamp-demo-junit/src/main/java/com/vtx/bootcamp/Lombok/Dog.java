package com.vtx.bootcamp.Lombok;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Dog {

  private final String firstName = "John";

  private int age;

  @NonNull
  private String lastName;

  public static void main(String[] args) {
    Dog dog = new Dog("Chan");

    System.out.println(dog.toString());

    Dog dog2 = new Dog(null);

    System.out.println(dog2.toString());
  }
}
