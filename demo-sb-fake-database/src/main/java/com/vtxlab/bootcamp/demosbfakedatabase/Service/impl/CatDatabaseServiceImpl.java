package com.vtxlab.bootcamp.demosbfakedatabase.Service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.demosbfakedatabase.database.CatDatabase;
import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;
import com.vtxlab.bootcamp.demosbfakedatabase.Service.CatDatabaseService;

// @Service
@Component
// Create an object of this class, put it into Spring context
public class CatDatabaseServiceImpl implements CatDatabaseService {

  // Objectives of Service
  // 1. Data source
  // 2. The service you are going to provide

  @Override
  public Cat getCatFromStaticMemory(int index) {
    return CatDatabase.getCat(index);
  }

  @Override
  public void setCatToStaticMemory(int index, Cat cat) {
    CatDatabase.setCat(index, cat);
  }

  @Override
  public boolean createCatInStaticMemory(int index, Cat cat) {
    return CatDatabase.createCat(index, cat);
  }

  @Override
  public boolean deleteCatFromStaticMemory(int index) {
    return CatDatabase.deleteCat(index);
  }

  @Override
  public boolean updateCatInStaticMemory(int index, Cat cat) {
    return CatDatabase.updateCat(index, cat);
  }

  @Override
  public void patchCatNameInStaticMemory(int index, String name) {
    CatDatabase.patchCatName(index, name);
  }

  @Override
  public void patchCatAgeInStaticMemory(int index, int age) {
    CatDatabase.patchCatAge(index, age);
  }

}