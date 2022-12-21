package Horaire.Day;

import Horaire.Activites.Sport;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class MorningTwo extends TimeSection {
    public MorningTwo(Sport sport){
        super(sport);
        setBegin(LocalTime.of(10,00,00));
        setEnd(LocalTime.of(12,00,00));
    }
}
