package com.project1.demo.Service;

import com.project1.demo.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books,Integer> {
}
