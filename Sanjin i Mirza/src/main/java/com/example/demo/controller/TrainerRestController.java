package com.example.demo.controller;

import com.example.demo.model.Trainer;
import com.example.demo.repositories.TrainerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainers")
public class TrainerRestController {

    private final TrainerRepository trainerRepository;

    public TrainerRestController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @GetMapping
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }
}
