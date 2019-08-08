package com.iktpreobuka.ednevnik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.ednevnik.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
