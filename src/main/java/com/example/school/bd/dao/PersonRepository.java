package com.example.school.bd.dao;

import com.example.school.core.eir.bo.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
}
