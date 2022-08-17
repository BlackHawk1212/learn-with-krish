package com.nimesh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nimesh on 8/17/2022
 */
@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){
        return "<h1> I am running og Docker... Awesome haaa... :)</h1>";
    }

}
