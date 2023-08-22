package com.bridgelabz.demo.service;

import com.bridgelabz.demo.model.PersonModel;

import java.util.ArrayList;
import java.util.List;

public interface PersonService {
    // business logic what to do and what not to do;

    public PersonModel CreatePersonInDB(PersonModel person);

    public List<PersonModel> GetAllThePersonFromDB();

}
