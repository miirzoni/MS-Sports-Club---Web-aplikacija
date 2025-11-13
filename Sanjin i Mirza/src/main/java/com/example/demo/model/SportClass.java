package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SportClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naziv;
    private String opis;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    public SportClass() {}

    public SportClass(String naziv, String opis, Trainer trainer) {
        this.naziv = naziv;
        this.opis = opis;
        this.trainer = trainer;
    }

    // Getteri i setteri
    public Long getId() { return id; }
    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }
    public String getOpis() { return opis; }
    public void setOpis(String opis) { this.opis = opis; }
    public Trainer getTrainer() { return trainer; }
    public void setTrainer(Trainer trainer) { this.trainer = trainer; }
}