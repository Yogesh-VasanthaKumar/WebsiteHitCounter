package com.Counter.WebsiteHitCounter.controller;

import com.Counter.WebsiteHitCounter.service.WebsiteHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class WebsiteHitController {
    @Autowired
    public WebsiteHitService websiteHitService;

    //http://localhost:8080/api/v1/visitor-count-app/count
    @GetMapping("/count")
    public String websiteCounter(){

        return websiteHitService.count();
    }
   //http://localhost:8080/api/v1/visitor-count-app/counts/alex
    @GetMapping("/counts/{user}")
    public String perUserCounter(@PathVariable String user){

        return websiteHitService.perUserCounter(user);
    }
}
