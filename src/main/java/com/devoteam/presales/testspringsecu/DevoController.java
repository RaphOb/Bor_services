package com.devoteam.presales.testspringsecu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Devo")
public class DevoController {
    private DevoService devoservice;

    public DevoController (DevoService devoservice) {
        this.devoservice = devoservice;
    }

    @GetMapping("/list")
    public Iterable<Devo> list() {
        return devoservice.list();
    }

}
