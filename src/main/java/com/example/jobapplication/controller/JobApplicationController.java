package com.example.jobapplication.controller;

import com.example.jobapplication.entity.JobApplication;
import com.example.jobapplication.service.JobApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationController {
    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<JobApplication> createJobApplication(@RequestBody JobApplication jobApplication) {
        return ResponseEntity.ok(service.createJobApplication(jobApplication));
    }

    @GetMapping
    public ResponseEntity<List<JobApplication>> getAllJobApplications() {
        return ResponseEntity.ok(service.getAllJobApplication());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobApplication> getJobApplicationById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getJobApplicationById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobApplication(@PathVariable Long id) {
        service.deleteJobApplicationById(id);
        return ResponseEntity.noContent().build();
    }
}
