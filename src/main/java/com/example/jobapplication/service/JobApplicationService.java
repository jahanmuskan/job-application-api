package com.example.jobapplication.service;

import com.example.jobapplication.entity.JobApplication;
import com.example.jobapplication.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {
    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository){
        this.repository = repository;
    }

    public JobApplication createJobApplication(JobApplication jobApplication){
        return repository.save(jobApplication);
    }

    public List<JobApplication> getAllJobApplication(){
        return repository.findAll();
    }

    public JobApplication findJobApplicationById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Job Application not found"));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
