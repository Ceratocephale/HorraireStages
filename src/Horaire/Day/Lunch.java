package Horaire.Day;

import Horaire.Ancetres.Activite;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class Lunch extends TimeSection {
    public Lunch(Activite activite) {
        super(activite);
        setBegin(LocalTime.of(12, 00, 00));
        setEnd(LocalTime.of(13, 00, 00));
    }
}
