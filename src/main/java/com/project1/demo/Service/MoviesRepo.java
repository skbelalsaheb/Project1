package com.project1.demo.Service;
import com.project1.demo.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MoviesRepo extends JpaRepository<Movies,Integer> {
   
}
