package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController

public class vood {
  @GetMapping("/check")
  public String CheckApi() throws JsonProcessingException{
  {
	   ApiResponse response =new ApiResponse("hello welcome to this training");
	  ObjectMapper obj=new ObjectMapper();
	  return obj.writeValueAsString(response);
  }
}
}
