package com.ivoronline.springboot_db_findermethods.controllers;

import com.ivoronline.springboot_db_findermethods.entities.Person;
import com.ivoronline.springboot_db_findermethods.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // LOAD DATA
  //================================================================
  @RequestMapping("LoadData")
  String loadData() {
    personRepository.save(new Person("John" , 20));
    personRepository.save(new Person("John" , 30));
    personRepository.save(new Person("Bill" , 40));
    return "Data Loaded";
  }

  //================================================================
  // FIND PERSON BY ID
  //================================================================
  @RequestMapping("FindPersonById")
  Person findPersonById() {
    Person person = personRepository.findById(1).get();
    return person;
  }

  //================================================================
  // FIND PERSONS BY NAME (Multiple Entities)
  //================================================================
  @RequestMapping("FindByName")
  List<Person> findByName() {
    List<Person> persons = personRepository.findByName("John");
    return persons;
  }

  //================================================================
  // FIND PERSON BY NAME (Single Entity)
  //================================================================
  @RequestMapping("FindPersonByName")
  Person findPersonByName() {
    Person person = personRepository.findPersonByName("Bill");
    return person;
  }

  //================================================================
  // FIND PERSON BY NAME AGE (Single Entity)
  //================================================================
  @RequestMapping("FindPersonByNameAge")
  Person findPersonByNameAge() {
    Person person = personRepository.findPersonByNameAndAge("John", 20);
    return person;
  }

}
