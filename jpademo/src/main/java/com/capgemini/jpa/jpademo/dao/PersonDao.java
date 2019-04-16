package com.capgemini.jpa.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.jpademo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
