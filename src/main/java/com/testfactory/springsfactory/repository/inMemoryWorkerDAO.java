package com.testfactory.springsfactory.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.testfactory.springsfactory.model.Worker;

@Repository
public class inMemoryWorkerDAO {
    private final List<Worker> WORKERS = new ArrayList<>();

    public List<Worker> findAllWorkers() {
        return WORKERS;
    }

    public Worker saveWorker(Worker worker) {
        WORKERS.add(worker);
        return worker;
    }

    public Worker findByEmail(String email) {
        return WORKERS.stream()
            .filter(element -> element.getEmail().equals(email))
            .findFirst()
            .orElse(null);
    }

    public Worker updateWorker(Worker worker) {
        var workerIndex = IntStream.range(0, WORKERS.size())
            .filter(index -> WORKERS.get(index).getEmail().equals(worker.getEmail()))
            .findFirst()
            .orElse(-1);
        if (workerIndex > -1) {
            WORKERS.set(workerIndex, worker);
            return worker;
        }
        return null;
    }

    public void deleteWorker(String email) {
        var worker = findByEmail(email);
        if (worker != null) {
            WORKERS.remove(worker);
        }
    }
}
