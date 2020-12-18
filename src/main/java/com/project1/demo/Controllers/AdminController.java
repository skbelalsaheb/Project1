package com.project1.demo.Controllers;

import com.project1.demo.Models.Books;
import com.project1.demo.Service.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class AdminController {
    @Autowired
    BooksRepo booksRepo;
@GetMapping("admin")
    public String admin(Model model){
    ArrayList<Books> ob = (ArrayList<Books>) booksRepo.findAll();
    model.addAttribute("books",ob);
    return "admin";
}
@GetMapping("/EditBooks")
    public  String SaveBooks( Books ob){
    System.out.println("hi");
    System.out.println(ob.toString());
        return "hi";
    }

}
