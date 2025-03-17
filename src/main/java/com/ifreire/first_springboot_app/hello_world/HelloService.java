package com.ifreire.first_springboot_app.hello_world;

import org.springframework.stereotype.Service;

import static java.lang.StringTemplate.STR;


@Service
public class HelloService {

    public String hello(String name) {
        return STR."Hello \{name}";
    }
}
