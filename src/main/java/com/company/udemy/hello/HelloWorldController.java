package com.company.udemy.hello;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloWorldController {

    @Get(uri="/hello", produces = MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World!";
    }

    @Get(uri="/goodbye", produces = MediaType.TEXT_PLAIN)
    public String goodbyeWorld() {
        return "Goodbye World!";
    }
}
