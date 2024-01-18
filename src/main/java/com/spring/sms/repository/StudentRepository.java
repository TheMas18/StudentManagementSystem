package com.spring.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sms.entity.Student;

//here we have not added @Repository annotation because
//JpaRepository extends the class SimpleJpaRepository which have by default @Repository added

public interface StudentRepository extends JpaRepository<Student, Long> {

}
