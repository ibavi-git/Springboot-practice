# Java FSD Practice Projects

This repository contains a collection of Java full-stack and Spring Boot practice projects. Each Spring Boot application is kept in its own folder so the projects can be opened, built, and run independently.

## Projects

| Folder | Description |
| --- | --- |
| `frontendbackend` | Spring Boot practice project for frontend/backend integration. |
| `h2db` | Spring Boot project using an in-memory H2 database. |
| `hero-academia` | Spring Boot REST/API practice project. |
| `one-one` | Spring Boot project practicing one-to-one database relationships with PostgreSQL. |
| `post` | Spring Boot practice project. |
| `postgresdemo` | Spring Boot project using PostgreSQL. |
| `student-course` | Spring Boot project for student/course relationship practice with PostgreSQL. |
| `student-profile-demo` | Spring Boot practice project for student profile APIs. |
| `task-tracker` | Spring Boot task tracking practice project. |
| `fsd` | HTML, CSS, JavaScript, Java, notes, and small full-stack learning exercises. |

## Tech Stack

- Java
- Spring Boot
- Maven
- H2 Database
- PostgreSQL
- HTML, CSS, and JavaScript practice files

## Prerequisites

- JDK 17 or later
- Maven, or the Maven wrapper included inside each Spring Boot project
- PostgreSQL for projects that use a PostgreSQL datasource
- An IDE such as IntelliJ IDEA, VS Code, or Eclipse

## Running a Spring Boot Project

Open a terminal in any project folder, then run:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

For example:

```powershell
cd student-course
.\mvnw.cmd spring-boot:run
```

## Building a Project

From an individual project folder:

```powershell
.\mvnw.cmd clean package
```

Build output is generated in the `target/` directory and is ignored by Git.

## Database Notes

Some projects use H2 and can run without external database setup. Projects such as `one-one`, `postgresdemo`, and `student-course` expect a local PostgreSQL database. Check each project's `src/main/resources/application.properties` file for the datasource URL, username, port, and database name before running.

Do not commit real database passwords, API keys, or machine-specific configuration. Put local overrides in files such as `application-local.properties` or `.env`, which are ignored by Git.
