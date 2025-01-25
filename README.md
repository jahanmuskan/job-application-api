# Job Application API

This project is a REST API for managing job postings, applicants, and job applications. It allows users to create, retrieve, and delete job postings, applicants, and job applications. Built using Java and Spring Boot, the project demonstrates CRUD operations, relationships between entities, and basic API testing.

## Features
- Manage job postings
- Manage applicants
- Manage job applications
- Perform CRUD operations

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- Postman (for testing APIs)

## Getting Started

### Prerequisites
- JDK 17 or later
- Maven
- Postman (optional, for API testing)

### Steps to Run the Application
1. Clone the repository:
   ```bash
   git clone <[repository-url](https://github.com/jahanmuskan/job-application-api)>
   cd job-application-api
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. The application will start on `http://localhost:8080`.

## API Endpoints

### Job Postings

#### Create a Job Posting
**Endpoint:** `POST /api/job-postings`

**Sample Input:**
```json
{
  "title": "Software Engineer",
  "description": "Develop and maintain software applications.",
  "companyName": "TechCorp",
  "location": "New York",
  "salary": "100000-120000",
  "postedDate": "2025-01-01",
  "closingDate": "2025-02-01",
  "requirements": ["Java", "Spring Boot"]
}
```

**Sample Output:**
```json
{
  "id": 1,
  "title": "Software Engineer",
  "description": "Develop and maintain software applications.",
  "companyName": "TechCorp",
  "location": "New York",
  "salary": "100000-120000",
  "postedDate": "2025-01-01",
  "closingDate": "2025-02-01",
  "requirements": ["Java", "Spring Boot"]
}
```

#### Get All Job Postings
**Endpoint:** `GET /api/job-postings`

**Sample Output:**
```json
[
  {
    "id": 1,
    "title": "Software Engineer",
    "description": "Develop and maintain software applications.",
    "companyName": "TechCorp",
    "location": "New York",
    "salary": "100000-120000",
    "postedDate": "2025-01-01",
    "closingDate": "2025-02-01",
    "requirements": ["Java", "Spring Boot"]
  }
]
```

#### Get Job Posting by ID
**Endpoint:** `GET /api/job-postings/{id}`

**Sample Output:**
```json
{
  "id": 1,
  "title": "Software Engineer",
  "description": "Develop and maintain software applications.",
  "companyName": "TechCorp",
  "location": "New York",
  "salary": "100000-120000",
  "postedDate": "2025-01-01",
  "closingDate": "2025-02-01",
  "requirements": ["Java", "Spring Boot"]
}
```

#### Delete Job Posting by ID
**Endpoint:** `DELETE /api/job-postings/{id}`

**Sample Output:**
```
204 No Content
```

### Applicants

#### Create an Applicant
**Endpoint:** `POST /api/applicants`

**Sample Input:**
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890",
  "resume": "Base64EncodedString",
  "skills": ["Java", "Spring Boot"]
}
```

**Sample Output:**
```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890",
  "resume": "Base64EncodedString",
  "skills": ["Java", "Spring Boot"]
}
```

#### Get All Applicants
**Endpoint:** `GET /api/applicants`

**Sample Output:**
```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "1234567890",
    "resume": "Base64EncodedString",
    "skills": ["Java", "Spring Boot"]
  }
]
```

#### Get Applicant by ID
**Endpoint:** `GET /api/applicants/{id}`

**Sample Output:**
```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890",
  "resume": "Base64EncodedString",
  "skills": ["Java", "Spring Boot"]
}
```

#### Delete Applicant by ID
**Endpoint:** `DELETE /api/applicants/{id}`

**Sample Output:**
```
204 No Content
```

### Job Applications

#### Create a Job Application
**Endpoint:** `POST /api/job-applications`

**Sample Input:**
```json
{
  "jobId": 1,
  "applicantId": 1,
  "applicationDate": "2025-01-15",
  "status": "Pending"
}
```

**Sample Output:**
```json
{
  "id": 1,
  "jobId": 1,
  "applicantId": 1,
  "applicationDate": "2025-01-15",
  "status": "Pending"
}
```

#### Get All Job Applications
**Endpoint:** `GET /api/job-applications`

**Sample Output:**
```json
[
  {
    "id": 1,
    "jobId": 1,
    "applicantId": 1,
    "applicationDate": "2025-01-15",
    "status": "Pending"
  }
]
```

#### Get Job Application by ID
**Endpoint:** `GET /api/job-applications/{id}`

**Sample Output:**
```json
{
  "id": 1,
  "jobId": 1,
  "applicantId": 1,
  "applicationDate": "2025-01-15",
  "status": "Pending"
}
```

#### Delete Job Application by ID
**Endpoint:** `DELETE /api/job-applications/{id}`

**Sample Output:**
```
204 No Content
```

## Testing the APIs

1. Use Postman or any other API testing tool.
2. Import the API endpoints and test them with the sample inputs provided.

## Contact
For queries or contributions, feel free to raise an issue or contact me via [GitHub](https://github.com/jahanmuskan).

---


