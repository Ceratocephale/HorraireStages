package Horaire.Ancetres;

import Personnes.Personne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.SortedSet;
import java.util.TreeSet;

public class Activite {
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private LocalDateTime heure;
    private String name;
    private SortedSet<Personne> personnes = new TreeSet();



    public LocalDateTime getTime() {
        return this.heure;
    }

    public void setHeure(LocalDateTime heure) {
        this.heure = heure;
    }



    public SortedSet<Personne> getList() {
        return this.personnes;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
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
