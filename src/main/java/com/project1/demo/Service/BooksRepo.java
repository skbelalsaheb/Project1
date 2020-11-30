package com.project1.demo.Service;
import com.project1.demo.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BooksRepo extends JpaRepository<Books,Integer> {
    public List<Books> findByBookNameContains(String name);
}
