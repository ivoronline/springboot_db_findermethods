package com.ivoronline.springboot_db_findermethods.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  public Person() {}
  public Person(String name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
