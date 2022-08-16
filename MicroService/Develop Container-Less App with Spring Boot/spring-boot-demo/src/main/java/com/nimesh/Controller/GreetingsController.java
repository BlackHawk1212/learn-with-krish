package com.nimesh.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nimesh on 08/16/2022.
 */
@RestController
public class GreetingsController {

    @RequestMapping("/")
    public String greeting(){
        return "<h1> Welcome to game changing framework.. Spring Boot! </h1>";
    }

}
