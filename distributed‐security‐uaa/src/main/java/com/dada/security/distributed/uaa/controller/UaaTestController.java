package com.dada.security.distributed.uaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
class UaaTestController {

    @GetMapping(value = "/_h")
    public String r1(){
        return "ok";
    }

}