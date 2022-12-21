package Horaire.Day;

import Horaire.Activites.Sport;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class AfternoonTwo extends TimeSection {
    public AfternoonTwo(Sport sport){
        super(sport);
        setBegin(LocalTime.of(15,00,00));
        setEnd(LocalTime.of(17,00,00));
    }
}
