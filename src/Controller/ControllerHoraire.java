package Controller;

import Horaire.Activites.Repas;
import Horaire.Activites.Sport;
import Horaire.Day.*;
import Horaire.Horaire;

public class ControllerHoraire {

    static Horaire h;
    static scanner sc = new scanner();

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println(h.getHoraire());

            System.out.println("""
                    Choisissez les modifications:
                    1. Rajouter une activite.
                    2. Supprimer une activite.
                    3. Modifier une activite.
                    4. Supprimer tout.
                    5. Quitter.
                    """);
            switch (sc.readNum()) {
                case 1,3 -> rajouterActivite();
                case 2 -> supprimerActivite();
                case 4 -> supprimerTout();
                case 5 -> exit = true;
                default -> System.out.println("Frere tes con ou koi");
            }

        }
    }

    static void rajouterActivite(){
        System.out.println(tranchesHoraire());
        int reponse = sc.readNum();
        String str = propositionInput();
        switch (reponse) {
            case 1:
                h.setMorningOne(new MorningOne(new Sport(str)));
                break;
            case 2:
                h.setMorningTwo(new MorningTwo(new Sport(str)));
                break;
            case 3:
                h.setLunch(new Lunch(new Repas(str)));
                break;
            case 4:
                h.setAfternoonOne(new AfternoonOne(new Sport(str)));
                break;
            case 5:
                h.setAfternoonTwo(new AfternoonTwo(new Sport(str)));
                break;
            case 6:
                h.setRepasSoir(new RepasSoir(new Repas(str)));
                break;
            case 7:
            default:
                System.out.println("Mauvais input");

        }

    }

    static void supprimerActivite(){
        System.out.println(tranchesHoraire());
        int reponse = sc.readNum();
        switch (reponse) {
            case 1:
                h.setMorningOne(new MorningOne(new Sport("")));
                break;
            case 2:
                h.setMorningTwo(new MorningTwo(new Sport("")));
                break;
            case 3:
                h.setLunch(new Lunch(new Repas("")));
                break;
            case 4:
                h.setAfternoonOne(new AfternoonOne(new Sport("")));
                break;
            case 5:
                h.setAfternoonTwo(new AfternoonTwo(new Sport("")));
                break;
            case 6:
                h.setRepasSoir(new RepasSoir(new Repas("")));
                break;
            case 7:
            default:
                System.out.println("Mauvais input");

        }
    }

    static void supprimerTout(){
        h.setMorningOne(new MorningOne(new Sport("")));
        h.setMorningTwo(new MorningTwo(new Sport("")));
        h.setLunch(new Lunch(new Repas("")));
        h.setAfternoonOne(new AfternoonOne(new Sport("")));
        h.setAfternoonTwo(new AfternoonTwo(new Sport("")));
        h.setRepasSoir(new RepasSoir(new Repas("")));
    }

    static String tranchesHoraire(){
       return """
                Dans quelle tranche horaire?
                1.08h-10h
                2.10h-12h
                3.12h-13h
                4.13h-15h
                5.15h-17h
                6.18h-19h
                """;

    }

    static String propositionInput(){
        System.out.println("Indiquez le nom de l'activité");
        String str = sc.readString();
        return str;
    }
    static String typesActivites(){
        return """
                1.Activite sportive
                2.Repas/Lunch
                """;
    }

    public ControllerHoraire(int year, int month, int day){
        this.h = new Horaire(year, month, day);
    }

}
