package com.example.school.controller;

import com.example.school.bd.dao.PersonRepository;
import com.example.school.core.eir.bo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MainController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        Person person1 = new Person();

        person1.setLastName("Ricardo");
        person1.setFirstName("Acevedo");
        person1.setHireDate(new Date(System.currentTimeMillis()));
        //person1.setOfficeAssignment();
        personRepository.save(person1);


        String response = "Bienvenido al sistema School";
        return response;
    }
}
