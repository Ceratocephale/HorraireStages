import Controller.ControllerHoraire;
import Horaire.Horaire;

public class Main {
    public static void main(String[] args) {
        ControllerHoraire cG = new ControllerHoraire(new Horaire());
        cG.start();
    }
}