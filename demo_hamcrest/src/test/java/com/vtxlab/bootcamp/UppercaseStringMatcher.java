package com.vtxlab.bootcamp;

import org.hamcrest.TypeSafeMatcher;

public class UppercaseStringMatcher extends TypeSafeMatcher<String>{

  @Override
  public boolean matchesSafely(String item) {
    // regular expression - string pattern description
    return item.matches("[A-Z]+");

  }
  
}
