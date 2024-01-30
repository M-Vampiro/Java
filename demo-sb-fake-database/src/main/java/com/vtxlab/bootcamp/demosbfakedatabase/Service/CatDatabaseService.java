package com.vtxlab.bootcamp.demosbfakedatabase.Service;

import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;

public interface CatDatabaseService {

  Cat getCatFromStaticMemory(int index);

  void setCatToStaticMemory(int index, Cat cat);

}