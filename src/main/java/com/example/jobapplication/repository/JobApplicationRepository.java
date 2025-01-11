package com.example.jobapplication.repository;

import com.example.jobapplication.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
