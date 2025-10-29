package com.example.demo.model;

import java.util.List;

public class Team {
    private Long id;
    private String name;
    private String city;
    private String coach;
    private List<Player> players;
    private String logo;

    public Team(Long id, String name, String city, String coach, List<Player> players, String logo) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.coach = coach;
        this.players = players;
        this.logo = logo;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getCoach() { return coach; }
    public List<Player> getPlayers() { return players; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
    public void setCoach(String coach) { this.coach = coach; }
    public void setPlayers(List<Player> players) { this.players = players; }
}
