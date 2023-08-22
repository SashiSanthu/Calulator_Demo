package com.bridgelabz.demo.repository;

import com.bridgelabz.demo.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PersonRepository extends JpaRepository<PersonModel,String> {

    // We will add important one methods - CRUD

    // To add the data to database
//    public PersonModel CreatePersonInDB(PersonModel person);
//
//    // To get all the person data form database
//    public ArrayList<PersonModel> GetAllThePersonFromDB();
}
