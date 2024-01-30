package com.vtxlab.bootcamp.demosbfakedatabase.database;

import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;

public class CatDatabase {

  private static Cat[] cats;

  private static final int dbLength = 10;

  static {
    cats = new Cat[dbLength];
    cats[0] = new Cat("John", 2);
    cats[1] = new Cat("Mary", 1);
  }

  public static Cat getCat(int index) {
    if (index < 0 || index > dbLength - 1)
      throw new IllegalArgumentException();
    return cats[index];
  }

  public static synchronized void setCat(int index, Cat cat) {
    if (index < 0 || index > dbLength - 1)
      throw new IllegalArgumentException();
    cats[index] = cat;
  }

}