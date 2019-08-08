package com.iktpreobuka.ednevnik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.ednevnik.entities.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{

}
