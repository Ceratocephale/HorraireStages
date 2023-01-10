package Horaire.Day;

import Horaire.Ancetres.Activite;
import Horaire.Ancetres.TimeSection;

import java.time.LocalTime;

public class MorningOne extends TimeSection {
    public MorningOne(Activite activite){
        super(activite);
        setBegin(LocalTime.of(8,00,00));
        setEnd(LocalTime.of(10,00,00));
    }

}
