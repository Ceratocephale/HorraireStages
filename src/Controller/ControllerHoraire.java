package Controller;

import Horaire.Horaire;

public class ControllerHoraire {

    private Horaire h;

    public Horaire getH() {
        return h;
    }

    public void setH(Horaire h) {
        this.h = h;
    }

    static scanner sc = new scanner();


    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println(getH().getHoraire());

            System.out.println("""
                    Choisissez les modifications:
                    1. Rajouter une activite.
                    2. Supprimer une activite.
                    3. Modifier une activite.
                    4. Supprimer tout.
                    5. Quitter.
                    """);
            switch (sc.readNum()) {
                case 1, 3 -> modifierActivite();
                case 2 -> supprimerActivite();
                case 4 -> supprimerTout();
                case 5 -> exit = true;
                default -> System.out.println("Frere tes con ou koi");
            }

        }
    }

//    static void rajouterActivite(){
//        System.out.println(tranchesHoraire());
//        int reponse = sc.readNum();
//        String str = propositionInput();
//        switch (reponse) {
//            case 1:
//                h.setMorningOne(new MorningOne(new Sport(str)));
//                break;
//            case 2:
//                h.setMorningTwo(new MorningTwo(new Sport(str)));
//                break;
//            case 3:
//                h.setLunch(new Lunch(new Repas(str)));
//                break;
//            case 4:
//                h.setAfternoonOne(new AfternoonOne(new Sport(str)));
//                break;
//            case 5:
//                h.setAfternoonTwo(new AfternoonTwo(new Sport(str)));
//                break;
//            case 6:
//                h.setRepasSoir(new RepasSoir(new Repas(str)));
//                break;
//            case 7:
//            default:
//                System.out.println("Mauvais input");
//
//        }
//
//    }

    void modifierActivite() {
        System.out.println(tranchesHoraire());
        int reponse = sc.readNum();
        String str = propositionInput();
        switch (reponse) {
            case 1:
                getH().getMorningOne().getActivite().setName(str);
                break;
            case 2:
                getH().getMorningTwo().getActivite().setName(str);
                break;
            case 3:
                getH().getLunch().getActivite().setName(str);
                break;
            case 4:
                getH().getAfternoonOne().getActivite().setName(str);
                break;
            case 5:
                getH().getAfternoonTwo().getActivite().setName(str);
                break;
            case 6:
                getH().getRepasSoir().getActivite().setName(str);
                break;
            case 7:
            default:
                System.out.println("Mauvais input");

        }
    }

    void supprimerActivite() {
        System.out.println(tranchesHoraire());
        int reponse = sc.readNum();
        switch (reponse) {
            case 1:
                getH().getMorningOne().getActivite().setName("");
                break;
            case 2:
                getH().getMorningTwo().getActivite().setName("");
                break;
            case 3:
                getH().getLunch().getActivite().setName("");
                break;
            case 4:
                getH().getAfternoonOne().getActivite().setName("");
                break;
            case 5:
                getH().getAfternoonTwo().getActivite().setName("");
                break;
            case 6:
                getH().getRepasSoir().getActivite().setName("");
                break;
            case 7:
            default:
                System.out.println("Mauvais input");

        }
    }

    void supprimerTout() {
        getH().getMorningOne().getActivite().setName("");
        getH().getMorningTwo().getActivite().setName("");
        getH().getLunch().getActivite().setName("");
        getH().getAfternoonOne().getActivite().setName("");
        getH().getAfternoonTwo().getActivite().setName("");
        getH().getRepasSoir().getActivite().setName("");

    }

    static String tranchesHoraire() {
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

    static String propositionInput() {
        System.out.println("Indiquez le nom de l'activité");
        String str = sc.readString();
        return str;
    }

    static String typesActivites() {
        return """
                1.Activite sportive
                2.Repas/Lunch
                """;
    }

    public ControllerHoraire(Horaire h) {
        this.h = h;
    }

}
