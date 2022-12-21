package Horaire.Day;

import Horaire.Activites.Sport;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class MorningOne extends TimeSection {
    public MorningOne(Sport sport){
        super(sport);
        setBegin(LocalTime.of(8,00,00));
        setEnd(LocalTime.of(10,00,00));
    }

}
