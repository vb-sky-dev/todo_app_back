package com.todo.rest.webservice.controllers;

import com.todo.rest.webservice.dto.HelloFromBackendDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hw")
    private String getHelloWorld() {
        return "Hello World from Spring!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hw-bean")
    private HelloFromBackendDTO getHelloWorldBean() {
        return new HelloFromBackendDTO("Hello from Spring");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hw/path/{name}")
    private String getHelloWorldPathVariable(@PathVariable String name) {
        return String.format("Hello World from Spring %s!", name);
    }
}

