package com.example.mysqljpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/")
    public String personIndex(){
        return "index";
    }

    @PostMapping("/users/save")
    public String personSave(@RequestBody Person person){
        personRepository.save(person);
        return "redirect:index";
    }
}
