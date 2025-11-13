package com.example.demo.controller;

import com.example.demo.model.Trainer;
import com.example.demo.repositories.TrainerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerRepository trainerRepository;

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @GetMapping
    public String listTrainers(Model model) {
        model.addAttribute("trainers", trainerRepository.findAll());
        model.addAttribute("trainer", new Trainer());
        return "trainers";
    }

    @PostMapping("/add")
    public String addTrainer(@ModelAttribute Trainer trainer) {
        trainerRepository.save(trainer);
        return "redirect:/trainers";
    }
}