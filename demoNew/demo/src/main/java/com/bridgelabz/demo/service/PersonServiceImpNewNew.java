package com.bridgelabz.demo.service;

import com.bridgelabz.demo.model.PersonModel;
import com.bridgelabz.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpNewNew implements PersonService{

   private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpNewNew(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    int idCount = 0;

    @Override
    public PersonModel CreatePersonInDB(PersonModel person) {
         // convert int to string
        String idCountStr = Integer.toString(idCount);
        person.setId(idCountStr);
        idCount++;

        // Make firstname caps
        String CapFname = person.getFanme().toUpperCase();
        person.setFanme(CapFname);

        // make last name caps
        String CapLname = person.getLname().toUpperCase();
        person.setLname(CapLname);

       return personRepository.save(person);
    }

    @Override
    public List<PersonModel> GetAllThePersonFromDB() {
       return personRepository.findAll();

    }
}
