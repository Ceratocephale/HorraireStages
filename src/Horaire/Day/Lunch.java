package Horaire.Day;

import Horaire.Activites.Repas;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class Lunch extends TimeSection {
    public Lunch(Repas repas) {
        super(repas);
        setBegin(LocalTime.of(12, 00, 00));
        setEnd(LocalTime.of(13, 00, 00));
    }
}
