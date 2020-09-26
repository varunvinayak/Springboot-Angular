package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
