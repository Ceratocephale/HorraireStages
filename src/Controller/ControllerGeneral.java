package Controller;

public class ControllerGeneral {

    private ControllerHoraire cH;
    private ControllerInscriptions cI = new ControllerInscriptions();

    public void start(){
        boolean exit = false;
        while(!exit){
            System.out.println("""
                    Choisissez ce que vous voulez:
                    1. Voir tous les stages.
                    2. Rajouter un stage.
                    3. Voir une date particulière.
                    4. Voir toutes les personnes.
                    5. Quitter.
                    """);
        }
    }

    public ControllerGeneral(int year, int month, int day){
        this.cH = new ControllerHoraire(year, month, day);
    }

}
