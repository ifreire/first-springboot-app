package com.ifreire.first_springboot_app.hello_world;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor_ = {@Autowired})
@RequestMapping("api")
@CrossOrigin("*")
public class HelloController implements HelloControllerDocs {

    private final HelloService service;

    @GetMapping(value = "hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body(service.hello("Iuri"));
    }
}