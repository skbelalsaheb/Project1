package com.project1.demo.Controllers;

import com.project1.demo.Models.Student;
import com.project1.demo.Service.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SController {
    @Autowired
    StudentRepo repo;

    @RequestMapping("/")
    public String home()
    {

        return "index";
    }
    @GetMapping("register")
    public String register()
    {
        System.out.println("ok");
        return "register";
    }
    @RequestMapping("addStudent")
    public String addStudent(Student ob) {
        System.out.println(ob);
        repo.save(ob);
        return "Submit";
    }

   /* @RequestMapping("fetchComplain")
    public ModelAndView addStudent(int id) {
        Student ob = repo.findById(id).orElse(null);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Fetch");
        mv.addObject("StudentData",ob);
        return mv;
    }*/

}

