package com.vtxlab.bootcamp.demosbfakedatabase.Service.impl;

import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.demosbfakedatabase.database.CatDatabase;
import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;
import com.vtxlab.bootcamp.demosbfakedatabase.Service.CatDatabaseService;

@Service
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

}