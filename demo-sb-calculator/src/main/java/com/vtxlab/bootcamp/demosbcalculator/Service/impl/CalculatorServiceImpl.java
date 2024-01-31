package com.vtxlab.bootcamp.demosbcalculator.Service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.vtxlab.bootcamp.demosbcalculator.Service.CalculatorService;

@Component

public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public double calculateResult(double x, double y, char operation) {
    switch (operation) {
      case 'a':
        return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
      case 's':
        return BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
      case 'm':
        return BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y)).doubleValue();
      case 'd':
        if (y == 0)
        throw new IllegalArgumentException();
        return BigDecimal.valueOf(x).divide(BigDecimal.valueOf(y)).doubleValue();

      default:
      throw new IllegalArgumentException();
    }
  }

  

}
