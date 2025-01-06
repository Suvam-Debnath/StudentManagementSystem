package com.suvam.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suvam.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
