package Controller;

import Horaire.Horaire;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ControllerGeneral {

    private ControllerHoraire cH;
    private ControllerInscriptions cI = new ControllerInscriptions();
    private Map<LocalDate, Horaire> calendrier = new HashMap();

    public void start(){
        boolean exit = false;
        while(!exit){
            System.out.println("""
                    Choisissez ce que vous voulez:
                    1. Voir l'horraire d'une date spécifique.
                    2. Voir des stages.
                    3. Voir toutes les personnes.
                    4. Quitter.
                    """);
        }
    }



}
