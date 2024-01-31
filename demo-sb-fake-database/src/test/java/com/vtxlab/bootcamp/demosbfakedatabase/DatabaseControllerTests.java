package com.vtxlab.bootcamp.demosbfakedatabase;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.vtxlab.bootcamp.demosbfakedatabase.Controller.impl.DatabaseController;
import com.vtxlab.bootcamp.demosbfakedatabase.Service.CatDatabaseService;
import com.vtxlab.bootcamp.demosbfakedatabase.model.Cat;

@WebMvcTest(DatabaseController.class) // Inject the web layer related bean to context only;
// In this test env, component scan will ignore @Service, @Configuration, etc.
// but includes controller bean, mockmvc beans, etc..
public class DatabaseControllerTests {

  @Autowired
  private MockMvc mockMvc;

  // @Autowired // You cannot autowired service bean in WebMvcTest env.
  @MockBean // similar to @Mock
  // Because Controller Beans need to Autowired catDatabaseService
  private CatDatabaseService catDatabaseService;

  @Test
  void testGetCat() throws Exception {
    // Assumption
    Cat mockedReturnCat = new Cat("ABCD", 3);
    // when
    Mockito.when(catDatabaseService.getCatFromStaticMemory(1)).thenReturn(mockedReturnCat);
    // assert
    mockMvc.perform(get("/api/v1/cat/{idx}", "1"))
        .andExpect(status().isOk()) // http code 200 - OK
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.name").value("ABCD"))
        .andExpect(jsonPath("$.age").value(3))
        .andDo(print()); // similar to sysout, toString()

    // wrong path
    mockMvc.perform(get("/api/v1/cat", "1"))
        .andExpect(status().isNotFound()) // http code 200 - Ok
        .andDo(print());

        

  }

}