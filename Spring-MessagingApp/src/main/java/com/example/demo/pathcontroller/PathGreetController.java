package com.example.demo.pathcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PathGreetController {

    @GetMapping("/hello/param/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
