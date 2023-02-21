package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Value("${value.name}")
    private String newnamestring;
  @GetMapping("/")
  public String homepage() {
	  return newnamestring + " to Student List";
  }
  @GetMapping("/list")
  public List<Student>getList(){
	  List<Student>detailsList=new ArrayList<>();
	  detailsList.add(new Student(1,"XXX",1));
	  
	  return detailsList;
  }
}
