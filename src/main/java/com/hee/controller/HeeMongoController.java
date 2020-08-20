package com.hee.controller;


import com.hee.service.HeeMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class HeeMongoController {

    @Autowired
    HeeMongoService heeMongoService;

    @GetMapping("/dummy")
    public String putDummyData() {
        System.out.println("hello,world");
        heeMongoService.insert();
        System.out.println("bye,world");
        return "Success";
    }
}
