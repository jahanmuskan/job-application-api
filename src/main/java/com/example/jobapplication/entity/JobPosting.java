package com.example.jobapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosting {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String companyName;
    private String location;
    private String salary;
    private LocalDate postedDate;
    private LocalDate closingDate;

    @ElementCollection
    private List<String> requirements;
}
