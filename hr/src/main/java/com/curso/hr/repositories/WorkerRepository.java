package com.curso.hr.repositories;

import com.curso.hr.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
}
