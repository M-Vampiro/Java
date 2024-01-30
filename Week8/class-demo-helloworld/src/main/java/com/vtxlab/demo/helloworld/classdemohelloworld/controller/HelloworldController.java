package com.vtxlab.demo.helloworld.classdemohelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")

public class HelloworldController {
  @GetMapping(value = "helloworld")
  public String helloworld() {
    return "helloworld";
  }

  @GetMapping(value = "test")
  public int test() {
    return 0;
  }

}
