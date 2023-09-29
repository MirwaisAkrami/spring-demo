package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greetings")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("{name}")
    public String hello(@PathVariable("name") String name, @RequestParam("age") Integer age) {
        return name + "a starai ma se da " + age + " kalo ye";
    }

    @PostMapping
    public String saveGreeting(@RequestBody Person person) {
        Person mPerson = demoService.addPerson(person);
        return mPerson.toString();
    }

}
