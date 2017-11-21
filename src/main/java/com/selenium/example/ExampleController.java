package com.selenium.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frank on 11/21/2017.
 */
@RestController
public class ExampleController {
    private NameFormatter formatter = new NameFormatter();
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String index(@PathVariable String id) {
        return formatter.formatName(id);
    }
}
