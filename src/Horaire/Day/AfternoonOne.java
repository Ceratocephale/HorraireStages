package Horaire.Day;

import Horaire.Activites.Sport;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class AfternoonOne extends TimeSection {
    public AfternoonOne(Sport sport){
        super(sport);
        setBegin(LocalTime.of(13,00,00));
        setEnd(LocalTime.of(15,00,00));
    }

}
