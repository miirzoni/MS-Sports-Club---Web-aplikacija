package com.example.demo.data;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import java.util.List;

public class DemoData {
    public static List<Team> getTeams() {
        List<Player> players1 = List.of(
            new Player(1L, "Mirza Haračić", 20, "Golman", 8.1),
            new Player(2L, "Dino Mujkić", 27, "Centarfor", 7.5),
            new Player(3L, "Hamo Hamić", 50, "Veteran", 9.1),
            new Player(4L, "Niko Nikić", 27, "Odbrana", 10.0)
        );

        List<Player> players2 = List.of(
            new Player(5L, "Nevzudin", 30, "Desno krilo", 7.9),
            new Player(6L, "Skela", 25, "Lijevi bek", 0.3),
            new Player(7L, "Fahrudin Opančić", 30, "Desni bek", 1.6),
            new Player(8L, "Marko Markić", 41, "Desno krilo", 8.3)
        );

        List<Player> players3 = List.of(
                new Player(9L, "Edin Džeko", 40, "Napadač", 8.1),
                new Player(10L, "Elvedin Sakić", 27, "Rezerva", 7.5),
                new Player(11L, "Ramo Isak", 19, "Centarfor", 8.4),
                new Player(12L, "Arnel Isak", 34, "Odbrana", 4.5)
        );

        List<Player> players4 = List.of(
                new Player(7L, "Lionel Messi", 30, "Veznik", 7.9),
                new Player(8L, "Cristiano Ronaldo", 35, "Kapiten", 8.3),
                new Player(8L, "Muhamed Salah", 48, "Napadač", 10.0),
                new Player(8L, "Miralem Pjanić", 35, "Divljak", 8.3)
        );


        return List.of(
                new Team(1L, "Patuljci", "Zenica", "Narcisa Hadžajlić", players1, "patuljci.jpeg"),
                new Team(2L, "Intelektualci", "Kakanj", "Edin Tabak", players2, "štreber.jpg"),
                new Team(3L, "Kornjače", "Mostar", "Samra iz studentske", players3, "tmnt.jpg"),
                new Team(4L, "Mravi", "Kaćuni", "Samir Lemeš", players4, "mrav.jpeg")
        );
    }
}
