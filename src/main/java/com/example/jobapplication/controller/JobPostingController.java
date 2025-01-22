package com.example.jobapplication.controller;

import com.example.jobapplication.entity.JobPosting;
import com.example.jobapplication.service.JobPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/job-postings")
public class JobPostingController {
    private final JobPostingService service;

    public JobPostingController(JobPostingService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<JobPosting> createJobPosting(@RequestBody JobPosting jobPosting) {
        return ResponseEntity.ok(service.createJobPosting(jobPosting));
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getAllJobPostings() {
        return ResponseEntity.ok(service.getAllJobPostings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobPostingById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getJobPostingById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobPosting(@PathVariable Long id) {
        service.deleteJobPosting(id);
        return ResponseEntity.noContent().build();
    }
}
