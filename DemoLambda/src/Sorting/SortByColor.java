package Sorting;

import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

@Override
public int compare(Ball b1, Ball b2) {
  return b2.getColor().getName().compareTo(b1.getColor().getName());
    
  }
  
}
