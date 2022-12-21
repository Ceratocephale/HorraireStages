package Horaire.Ancetres;

import Personnes.Personne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.SortedSet;
import java.util.TreeSet;

public class Activite {
    private LocalDate date;
    private LocalDateTime heure;
    private String name;
    private SortedSet<Personne> personnes = new TreeSet();

    public LocalDate getDate() {
        return this.date;
    }

    public LocalDateTime getTime() {
        return this.heure;
    }

    public void setHeure(LocalDateTime heure) {
        this.heure = heure;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SortedSet<Personne> getList() {
        return this.personnes;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activite(String name) {
        this.name = name;
    }
}
