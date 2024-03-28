package com.ahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("Hi", new Person("Ahmed", 26, 100_000), List.of("Java", "Typescript", "Python"), "Software Engineer");
    }
    record Person(String name, int age, double savings){}
    record GreetResponse(String greet, Person person, List<String> fevoriteProgrammingLanguage, String title){}
}
