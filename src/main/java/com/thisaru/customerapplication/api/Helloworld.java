package com.thisaru.customerapplication.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping(value = "/hello")
    public String Helloworld(){
        return "Hello World";
    }
}
