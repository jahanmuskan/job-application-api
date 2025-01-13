package com.example.jobapplication.service;

import com.example.jobapplication.entity.Applicant;
import com.example.jobapplication.repository.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {
    private final ApplicantRepository repository;

    public ApplicantService(ApplicantRepository repository){
        this.repository = repository;
    }

    public Applicant createApplicant(Applicant applicant){
        return repository.save(applicant);
    }

    public List<Applicant> getAllApplicant(){
        return repository.findAll();
    }

    public Applicant findApplicantById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Applicant not found"));
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
