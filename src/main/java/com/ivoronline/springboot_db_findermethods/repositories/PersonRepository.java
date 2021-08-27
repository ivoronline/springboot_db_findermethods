package com.ivoronline.springboot_db_findermethods.repositories;

import com.ivoronline.springboot_db_findermethods.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  List<Person> findByName            (String name1);
  Person       findPersonByName      (String name1);
  Person       findPersonByNameAndAge(String name1, Integer age1);
}
