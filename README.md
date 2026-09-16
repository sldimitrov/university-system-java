# University Management System

A console-based Java application for managing students, teachers, courses, and rooms, built as an OOP practice project.

## Features (planned)

- Manage students, teachers, courses, and rooms
- Enroll/drop students from courses
- Assign teachers to courses
- Schedule courses into time slots and rooms, avoiding conflicts
- View a student's schedule, a teacher's courses, or a course's roster

## Project structure

```
src/
  model/       // Person, Student, Teacher, Course, Room, TimeSlot, enums
  service/     // classes coordinating enrollment, scheduling, conflict checks
  Main.java    // entry point
```

## Requirements

- Java 17+ (or whatever JDK version you're targeting)

## Status

Work in progress - building core model classes first (`TimeSlot`, `Room`, `Person` hierarchy) before wiring up the coordinating logic.