package com.project1.demo.Controllers;
import com.project1.demo.Models.Books;
import com.project1.demo.Models.Movies;
import com.project1.demo.Models.Student;
import com.project1.demo.Service.BooksRepo;
import com.project1.demo.Service.MoviesRepo;
import com.project1.demo.Service.StudentRepo;
import com.sun.source.doctree.InlineTagTree;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SController {
    @Autowired
    StudentRepo repo;
    @Autowired
    BooksRepo booksRepo;
    @Autowired
    MoviesRepo moviesRepo;

    @GetMapping("/")
    public String home(Model model)
    {
        List<Integer> ob = List.of(1,2,3,4,5,6,7,8);
        model.addAttribute("name",ob);
        return "index";
    }
    @GetMapping("register")
    public String register()
    {
        System.out.println("ok");
        return "register";
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

    @GetMapping("movies")
    public String getMovieController(Model model){
        ArrayList<Movies> obj = (ArrayList<Movies>) moviesRepo.findAll();
        model.addAttribute("movies",obj);
        return "Movies";
    }
    @PostMapping("/movies")
    public  String SaveMovies(Movies obj){
        moviesRepo.save(obj);
        return "index";
    }





    //    @RequestMapping("addStudent")
//    public String addStudent(Student ob) {
//        System.out.println(ob);
//        repo.save(ob);
//        return "Submit";
//    }
    // Me

   /* @RequestMapping("fetchComplain")
    public ModelAndView addStudent(int id) {
        Student ob = repo.findById(id).orElse(null);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Fetch");
        mv.addObject("StudentData",ob);
        return mv;
    }*/

}

