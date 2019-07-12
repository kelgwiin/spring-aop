package com.kelgwiin.demoaop.controller;

import com.kelgwiin.demoaop.model.Person;
import com.kelgwiin.demoaop.service.api.DemoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class DemoAopController {
    private DemoService demoService;

    DemoAopController(DemoService demoService){
        this.demoService = demoService;
    }

    @GetMapping(
            value = "/person",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    private Person getPerson() {
        return demoService.getPerson();
    }

}
