package com.exception.handler.demo.controller;

import com.exception.handler.demo.service.SimpleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("test")
public class SimpleController {

    private final SimpleService simpleService;

    @RequestMapping("/throw")
    public void throwException() {
        throw new ArithmeticException("do not do that!!!");
    }

}
