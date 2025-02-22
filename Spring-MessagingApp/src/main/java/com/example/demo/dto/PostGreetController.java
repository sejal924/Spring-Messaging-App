package com.example.demo.dto;


import com.example.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostGreetController {

    // End point to handle POST request with JSON body
    @PostMapping("/hello/post")
    public String greetUser(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
