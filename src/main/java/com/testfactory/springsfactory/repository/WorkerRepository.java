package com.testfactory.springsfactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testfactory.springsfactory.model.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long> {
    void deleteByEmail(String email);
    Worker findWorkerByEmail(String email);
}
