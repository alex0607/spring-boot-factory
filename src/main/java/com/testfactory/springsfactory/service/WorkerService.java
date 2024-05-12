package com.testfactory.springsfactory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testfactory.springsfactory.model.Worker;

@Service
public interface WorkerService {
     List<Worker> findAllWorkers();
     Worker saveWorker(Worker worker);
     Worker findByEmail(String email);
     Worker updateWorker(Worker worker);
     void deleteWorker(String email);
}
