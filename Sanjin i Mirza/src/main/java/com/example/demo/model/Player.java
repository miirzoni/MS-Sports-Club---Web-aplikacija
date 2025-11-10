package com.example.demo.model;

public class Player {
    private Long id;
    private String name;
    private int age;
    private String position;
    private double rating;

    public Player(Long id, String name, int age, String position, double rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public double getRating() { return rating; }



    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPosition(String position) { this.position = position; }
    public void setRating(double rating) { this.rating = rating; }


}
