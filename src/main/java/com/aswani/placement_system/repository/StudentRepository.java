package com.aswani.placement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aswani.placement_system.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}