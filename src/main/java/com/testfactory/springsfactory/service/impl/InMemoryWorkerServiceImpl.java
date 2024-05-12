package com.testfactory.springsfactory.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.testfactory.springsfactory.model.Worker;
import com.testfactory.springsfactory.repository.inMemoryWorkerDAO;
import com.testfactory.springsfactory.service.WorkerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Repository
public class InMemoryWorkerServiceImpl implements WorkerService {
    private final inMemoryWorkerDAO repository;

    @Override
    public List<Worker> findAllWorkers() {
        return repository.findAllWorkers();
    }

    @Override
    public Worker saveWorker(Worker worker) {
        return repository.saveWorker(worker);
    }

    @Override
    public Worker findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Worker updateWorker(Worker worker) {
        return repository.updateWorker(worker);
    }

    @Override
    public void deleteWorker(String email) {
        repository.deleteWorker(email);
    }
}
