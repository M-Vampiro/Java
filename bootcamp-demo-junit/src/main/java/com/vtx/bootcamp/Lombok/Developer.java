package com.vtx.bootcamp.Lombok;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor // name? age?
@NoArgsConstructor
@ToString // name? age?
@EqualsAndHashCode // name? age?
@SuperBuilder // name? age?
public class Developer extends Staff {

  private List<String> skills;

  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills());

    Developer developer2 = new Developer(new ArrayList<>(List.of("coding", "testing")));

    System.out.println(developer2.toString());
    System.out.println(developer2.getId());

    // 

    Developer developer3 = Developer.builder() //
    .name("Lydia")
    .id(3)
    .skills(new ArrayList<>(List.of("coding", "testing")))
    .build();

    Developer developer4 = Developer.builder() //
    .name("Lydia")
    .id(3)
    .skills(new ArrayList<>(List.of("coding", "testing")))
    .build();

    System.out.println(developer3.equals(developer4));
    System.out.println(developer3.hashCode() == developer4.hashCode());
  }
  
}
