package com.group17.CourseAdvisor.Controllers;

import com.group17.CourseAdvisor.DAO.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author asu
 * @Date 5/21/2020
 * @Description
 **/
@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseDao courseDao;

    @RequestMapping("/")
    public String getAllCourses(){
        return courseDao.getAllCourses();
    }
}
