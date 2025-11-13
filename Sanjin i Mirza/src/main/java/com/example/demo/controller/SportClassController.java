package com.example.demo.controller;

import com.example.demo.model.SportClass;
import com.example.demo.model.Trainer;
import com.example.demo.repositories.SportClassRepository;
import com.example.demo.repositories.TrainerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/classes")
public class SportClassController {

    private final SportClassRepository sportClassRepository;
    private final TrainerRepository trainerRepository;

    public SportClassController(SportClassRepository sportClassRepository, TrainerRepository trainerRepository) {
        this.sportClassRepository = sportClassRepository;
        this.trainerRepository = trainerRepository;
    }

    @GetMapping
    public String listClasses(Model model) {
        model.addAttribute("classes", sportClassRepository.findAll());
        model.addAttribute("trainers", trainerRepository.findAll());
        model.addAttribute("sportClass", new SportClass());
        return "classes";
    }

    @PostMapping("/add")
    public String addClass(@ModelAttribute SportClass sportClass,
                           @RequestParam("trainer.id") Long trainerId) {

        Trainer trainer = trainerRepository.findById(trainerId)
                .orElseThrow(() -> new IllegalArgumentException("Ne postoji trener sa id: " + trainerId));

        sportClass.setTrainer(trainer);
        sportClassRepository.save(sportClass);

        return "redirect:/classes";
    }
}
