package za.ac.cput.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Lecturer;

import java.util.Set;

/*
    ILecturerRepository.java
    Repository for the Lecturer
    Author: Cameron Henry Noemdo (219115443)
    Date: 21 August 2022
 */
public interface ILecturerRepository extends JpaRepository<Lecturer, String> {
    Set<Lecturer> getAll();
}