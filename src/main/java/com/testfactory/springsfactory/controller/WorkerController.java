package com.testfactory.springsfactory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testfactory.springsfactory.model.Worker;
import com.testfactory.springsfactory.service.WorkerService;

import lombok.AllArgsConstructor;





@RestController
@RequestMapping("/api/v1/workers")
@AllArgsConstructor
public class WorkerController {
    private final WorkerService service;

    @GetMapping
    public List<Worker> findAllWorkers() {
        return service.findAllWorkers();
    }

    @PostMapping
    public Worker saveWorker(@RequestBody Worker worker) {
        return service.saveWorker(worker);
    }

    @GetMapping("/{email}")
    public Worker findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping
    public Worker updatWorker(@RequestBody Worker worker) {
        return service.updateWorker(worker);
    }

    @DeleteMapping("/{email}")
    public void deleteWorker(@PathVariable String email) {
        service.deleteWorker(email);
    }
}
