package com.vtxlab.bootcamp.demosbcalculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CalculatorOperation {

  @GetMapping(value = "/x/{x}/y/{y}/operation/{operation}")
  double calculate(@PathVariable double x, @PathVariable double y, @PathVariable char operation);

}