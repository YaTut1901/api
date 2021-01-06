package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity method() {
        return new ResponseEntity(HttpStatus.I_AM_A_TEAPOT);
    }
}
