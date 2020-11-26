package com.project1.demo.Service;

import com.project1.demo.Models.Student;
import com.project1.demo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer>
{
}
