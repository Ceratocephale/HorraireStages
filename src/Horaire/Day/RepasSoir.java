package Horaire.Day;

import Horaire.Activites.Repas;
import Horaire.Ancetres.Activite;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class RepasSoir extends TimeSection {
    public RepasSoir(Activite activite) {
        super(activite);
        setBegin(LocalTime.of(18, 00, 00));
        setEnd(LocalTime.of(19, 00, 00));
    }
}
