package com.group17.CourseAdvisor.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author asu
 * @Date 5/21/2020
 * @Description
 **/
@RestController
public class CourseController {
    @RequestMapping("/")
    public String helloWorld(){
        return "hello world";
    }
}
