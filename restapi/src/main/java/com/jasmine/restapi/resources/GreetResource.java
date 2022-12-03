package com.jasmine.restapi.resources;

import com.jasmine.restapi.service.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetResource {
    @Autowired
    private Greet greet;

    @RequestMapping(path = "/greet", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String greetResource() {
        return "<h1>" + greet.wish() + "</h1>";
    }

    @RequestMapping(path = "/wish", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String wishResource() {
        return "<h1>" + greet.wish() + "</h1>";
    }

    @RequestMapping(path = "/wishme", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String wishMeResource() {
        return "<h1>" + greet.wish() + "</h1>";
    }

}
