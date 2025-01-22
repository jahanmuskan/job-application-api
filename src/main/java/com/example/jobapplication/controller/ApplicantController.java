package com.example.jobapplication.controller;

import com.example.jobapplication.entity.Applicant;
import com.example.jobapplication.service.ApplicantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {
    private final ApplicantService service;

    public ApplicantController(ApplicantService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Applicant> createApplicant(@RequestBody Applicant applicant) {
        return ResponseEntity.ok(service.createApplicant(applicant));
    }

    @GetMapping
    public ResponseEntity<List<Applicant>> getAllApplicant() {
        return ResponseEntity.ok(service.getAllApplicant());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Applicant> getApplicantById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getApplicantById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplicant(@PathVariable Long id) {
        service.deleteApplicantById(id);
        return ResponseEntity.noContent().build();
    }
}
