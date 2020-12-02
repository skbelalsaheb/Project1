package com.project1.demo.Controllers;

import com.project1.demo.Models.Books;
import com.project1.demo.Models.Customer;
import com.project1.demo.Service.BooksRepo;
import com.project1.demo.Service.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SController {

    @Autowired
    BooksRepo booksRepo;

    @GetMapping("/")
    public String home(Model model)
    {
        List<Integer> ob = List.of(1,2,3,4,5,6,7);
        model.addAttribute("name",ob);
        return "index";
    }

    @GetMapping("books")
    public String getBookController(Model model){
        ArrayList<Books> ob = (ArrayList<Books>) booksRepo.findAll();
        model.addAttribute("books",ob);
        return "Books";
    }
    @PostMapping("/books")
    public  String SaveBooks(Books ob){
        booksRepo.save(ob);
        return "index";
    }

    @GetMapping("/search")
    public String Search(HttpServletRequest request, Model m){
        String name = request.getParameter("search");
        List <Books> ob = booksRepo.findByBookNameContains(name);
        m.addAttribute("data",ob);
        return "search";
    }
    @GetMapping("/delete/{id}")
    public String DeleteBooks(@PathVariable("id") int id){
        booksRepo.deleteById(id);
        return "redirect:/books";
    }
    @Autowired
    CustomerRepo customerRepo;

   @GetMapping("register")
    public String register()
    {
        System.out.println("ok");
        return "register";
    }
    @PostMapping("/addCustomer")
    public  String addCustomer(Customer ob){
        customerRepo.save(ob);
        return "index";
    }
//

}

