package com.iktpreobuka.ednevnik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.ednevnik.entities.TeachingEntity;

public interface TeacherRepository extends CrudRepository<TeachingEntity, Integer> {

}
