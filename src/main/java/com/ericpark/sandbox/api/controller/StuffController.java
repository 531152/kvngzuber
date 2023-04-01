package com.ericpark.sandbox.api.controller;

import com.ericpark.sandbox.api.model.Stuff;
import com.ericpark.sandbox.service.StuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/stuff")
public class StuffController {

    private final StuffService stuffService;

    @Autowired
    public StuffController(StuffService stuffService) {
        this.stuffService = stuffService;
    }

    @GetMapping(value = "/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public Stuff getStuff(@PathVariable("id") String id) {
        return stuffService.getStuff(id);
    }
}