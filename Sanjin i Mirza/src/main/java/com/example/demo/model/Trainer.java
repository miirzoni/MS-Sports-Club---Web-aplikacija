package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;



import java.util.List;

@Entity
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ime;
    private String prezime;
    private String specijalizacija;
    private int godineIskustva;


    public Trainer() {}

    public Trainer(String ime, String prezime, String specijalizacija, int godineIskustva) {
        this.ime = ime;
        this.prezime = prezime;
        this.specijalizacija = specijalizacija;
        this.godineIskustva = godineIskustva;
    }

    // Getteri i setteri
    public Long getId() { return id; }
    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }
    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }
    public String getSpecijalizacija() { return specijalizacija; }
    public void setSpecijalizacija(String specijalizacija) { this.specijalizacija = specijalizacija; }
    public int getGodineIskustva() { return godineIskustva; }
    public void setGodineIskustva(int godineIskustva) { this.godineIskustva = godineIskustva; }

    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL)
    private List<SportClass> sportClasses;
}