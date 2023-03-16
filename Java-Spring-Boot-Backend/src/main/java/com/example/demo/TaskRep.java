package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRep extends JpaRepository<Task, Long>{

}