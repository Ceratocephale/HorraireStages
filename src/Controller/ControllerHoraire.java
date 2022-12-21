package Controller;

import Horaire.Horaire;

public class ControllerHoraire {

    static Horaire h = new Horaire();
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
                case 1 -> rajouterActivite();
                case 2 -> supprimerActivite();
                case 3 -> modifierActivite();
                case 4 -> supprimerTout();
                case 5 -> exit = true;
                default -> System.out.println("Frere tes con ou koi");
            }

        }
    }

    static void rajouterActivite(){
        System.out.println(tranchesHoraire());

        switch (sc.readNum()) {
            case 1 -> mor
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }

    }
    static void modifierActivite(){
        tranchesHoraire();
    }

    static void supprimerActivite(){
        tranchesHoraire();
    }

    static void supprimerTout(){

    }

    static String tranchesHoraire(){
       return """
                Dans quelle tranche horaire?
                1.08h-10h
                2.
                3.
                4.
                5.
                6.
                7.
                """;
    }
    static String typesActivites(){
        return """
                1.Activite sportive
                2.Repas/Lunch
                """;
    }


}
