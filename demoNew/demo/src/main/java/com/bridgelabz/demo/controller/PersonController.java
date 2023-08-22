package com.bridgelabz.demo.controller;


import com.bridgelabz.demo.model.PersonModel;
import com.bridgelabz.demo.service.PersonService;
import com.bridgelabz.demo.service.PersonServiceImpNewNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personServiceObj ; //-- I am attaching the object if i find in spring container.



    @GetMapping("/hi")
    public String checkContoller(){
        return "Hello world";
    }

    @PostMapping("/create")
    public PersonModel createThePersonData(@RequestBody PersonModel person){

       return personServiceObj.CreatePersonInDB(person);
    }

    @GetMapping("/getall")
    public List<PersonModel> getAllPersonRegisted(){
       return personServiceObj.GetAllThePersonFromDB();

    }

    @DeleteMapping("/delete/{id}")
    public PersonModel deleteTheUser(@PathVariable("id") String peronId){

    return null;
    }



}
