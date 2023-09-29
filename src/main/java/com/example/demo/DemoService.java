package com.example.demo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    ArrayList<Person> persons = new ArrayList<>();

    public Person addPerson(Person person) {
        Random random = new Random();
        Long id = random.nextLong();
        person.setId(id);
        persons.add(person);
        System.out.println(persons);
        return person;
    }
}
