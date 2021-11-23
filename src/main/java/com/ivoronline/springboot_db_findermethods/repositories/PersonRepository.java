package com.ivoronline.springboot_db_findermethods.repositories;

import com.ivoronline.springboot_db_findermethods.entities.Person;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  List<Person> findByName            (String namePar);
  Person       findPersonByName      (String namePar);
  Person       findPersonByNameAndAge(String namePar, Integer agePar);
}
