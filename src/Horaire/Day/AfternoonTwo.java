package Horaire.Day;

import Horaire.Ancetres.Activite;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class AfternoonTwo extends TimeSection {
    public AfternoonTwo(Activite activite){
        super(activite);
        setBegin(LocalTime.of(15,00,00));
        setEnd(LocalTime.of(17,00,00));
    }
}
