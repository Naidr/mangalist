package com.adri.manga.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.adri.manga.entity.models.User;

public interface IMangaDaoUsers extends CrudRepository<User, Long> {		

}
