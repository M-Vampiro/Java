package com.vtxlab.bootcamp.demosbfakedatabase.Service;

import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;

public interface CatDatabaseService {

  Cat getCatFromStaticMemory(int index);

  void setCatToStaticMemory(int index, Cat cat);

  boolean createCatInStaticMemory(int index, Cat cat);

  boolean deleteCatFromStaticMemory(int index);

  boolean updateCatInStaticMemory(int index, Cat cat);

  void patchCatNameInStaticMemory(int index, String name);

  void patchCatAgeInStaticMemory(int index, int age);

}