package Horaire.Day;

import Horaire.Activites.Sport;
import Horaire.Ancetres.Activite;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class MorningTwo extends TimeSection {
    public MorningTwo(Activite activite){
        super(activite);
        setBegin(LocalTime.of(10,00,00));
        setEnd(LocalTime.of(12,00,00));
    }
}
