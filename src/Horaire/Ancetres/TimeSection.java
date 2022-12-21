package Horaire.Ancetres;

import Horaire.Activites.Logement;
import Horaire.Activites.Repas;
import Horaire.Activites.Sport;

import java.sql.Time;
import java.time.LocalTime;

public class TimeSection{

    private LocalTime begin;
    private LocalTime end;

    private Activite activite;

    public Activite getActivite() {
        return this.activite;
    }

    public LocalTime getBegin() {
        return begin;
    }

    public void setBegin(LocalTime begin) {
        this.begin = begin;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public TimeSection(Sport sport) {
        this.activite = sport;
    }

    public TimeSection(Logement logement) {
        this.activite = logement;
    }

    public TimeSection(Repas repas) {
        this.activite = repas;
    }

}
