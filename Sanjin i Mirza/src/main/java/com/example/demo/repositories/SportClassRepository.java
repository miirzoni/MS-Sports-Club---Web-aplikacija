package com.example.demo.repositories;

import com.example.demo.model.SportClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportClassRepository extends JpaRepository<SportClass, Long> {
}
