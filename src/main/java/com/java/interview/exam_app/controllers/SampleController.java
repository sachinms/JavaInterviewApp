package com.java.interview.exam_app.controllers;


import com.java.interview.exam_app.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class SampleController {

    @GetMapping("/success")
    public String success() {
        return "Request was successful!";
    }

    @GetMapping("/error")
    public String throwError() {
        throw new IllegalArgumentException("This is an illegal argument!");
    }

    @GetMapping("/notfound")
    public String notFound() {
        throw new ResourceNotFoundException("Resource not found!");
    }
}
