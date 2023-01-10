import Controller.ControllerGeneral;
import Controller.ControllerHoraire;

public class Main {
    public static void main(String[] args) {
        ControllerGeneral ct = new ControllerGeneral(1998, 11,1);
        ct.start();
    }
}