package com.example.demo.controller;

import com.example.demo.model.SportClass;
import com.example.demo.repositories.SportClassRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class SportClassRestController {

    private final SportClassRepository sportClassRepository;

    public SportClassRestController(SportClassRepository sportClassRepository) {
        this.sportClassRepository = sportClassRepository;
    }

    @GetMapping
    public List<SportClass> getAllClasses() {
        return sportClassRepository.findAll();
    }
}
