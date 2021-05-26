package com.avszoom.microserviceswagger.resources;

import com.avszoom.microserviceswagger.models.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactResource {

    @GetMapping("/{name}")
    public Contact getContact(@PathVariable("name") String name){
        return new Contact(name,"23834957");
    }

    @GetMapping("/all")
    public List<Contact> getAllContacts(){
        return Arrays.asList(new Contact("avinash","89348534"),
                new Contact("priti","23948293"));
    }
}
