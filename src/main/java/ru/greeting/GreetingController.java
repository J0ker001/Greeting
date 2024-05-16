package ru.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "user") String name) {
        return "Hello " + name + "!";
    }
}
