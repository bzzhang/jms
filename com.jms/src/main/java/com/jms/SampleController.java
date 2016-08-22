package com.jms;
//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;

import com.jms.customer.Receiver;


public class SampleController {

//    @RequestMapping("/")
//    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Receiver.class, args);
    }
}