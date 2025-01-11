package com.example.jobapplication.service;

import com.example.jobapplication.entity.JobPosting;
import com.example.jobapplication.repository.JobPostingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingService {
    private final JobPostingRepository repository;

    public JobPostingService(JobPostingRepository repository){
        this.repository = repository;
    }

    public JobPosting createJobPosting(JobPosting jobPosting){
        return repository.save(jobPosting);
    }

    public List<JobPosting> getAllJobPostings() {
        return repository.findAll();
    }

    public JobPosting getJobPostingById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Job not found"));
    }

    public void deleteJobPosting(Long id) {
        repository.deleteById(id);
    }
}
