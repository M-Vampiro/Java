package com.vtxlab.bootcamp.demosbcalculator.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.bootcamp.demosbcalculator.Controller.CalculatorOperation;
import com.vtxlab.bootcamp.demosbcalculator.Service.CalculatorService;

@RestController
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {

  @Autowired
  private CalculatorService calculatorService;

  @Override
  public double calculate(double x, double y, char operation) {
    return calculatorService.calculateResult(x, y, operation);

  }

}
