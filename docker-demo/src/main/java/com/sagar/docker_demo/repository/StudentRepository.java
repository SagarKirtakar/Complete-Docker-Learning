package com.sagar.docker_demo.repository;

import com.sagar.docker_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}