package com.testfactory.springsfactory.service.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.testfactory.springsfactory.model.Worker;
import com.testfactory.springsfactory.repository.WorkerRepository;
import com.testfactory.springsfactory.service.WorkerService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
@Primary
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepository repository;

    @Override
    public List<Worker> findAllWorkers() {
        return repository.findAll();
    }

    @Override
    public Worker saveWorker(Worker worker) {
        return repository.save(worker);
    }

    @Override
    public Worker findByEmail(String email) {
        return repository.findWorkerByEmail(email);
    }

    @Override
    public Worker updateWorker(Worker worker) {
        return repository.save(worker);
    }

    @Override
    @Transactional
    public void deleteWorker(String email) {
        repository.deleteByEmail(email);
    }

}
