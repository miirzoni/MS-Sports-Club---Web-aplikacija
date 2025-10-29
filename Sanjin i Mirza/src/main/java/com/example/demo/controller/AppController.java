package com.example.demo.controller;

import com.example.demo.data.DemoData;
import com.example.demo.model.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @GetMapping("/teams")
    public String showTeams(Model model) {
        model.addAttribute("teams", DemoData.getTeams());
        return "teams";
    }

    @GetMapping("/players")
    public String showPlayers(Model model) {
        model.addAttribute("players",
            DemoData.getTeams().stream().flatMap(t -> t.getPlayers().stream()).toList());
        return "players";
    }

    @GetMapping("/team/{id}")
    public String showTeamPlayers(@PathVariable Long id, Model model) {
        Team team = DemoData.getTeams().stream()
            .filter(t -> t.getId().equals(id))
            .findFirst()
            .orElse(null);

        model.addAttribute("team", team);
        return "action";
    }
}
