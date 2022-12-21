package Horaire;

import Horaire.Activites.Repas;
import Horaire.Activites.Sport;
import Horaire.Day.*;

public class Horaire {
    private MorningOne morningOne = new MorningOne(new Sport(""));
    private MorningTwo morningTwo = new MorningTwo(new Sport(""));
    private Lunch lunch = new Lunch(new Repas(""));
    private AfternoonOne afternoonOne = new AfternoonOne(new Sport(""));
    private AfternoonTwo afternoonTwo = new AfternoonTwo(new Sport(""));
    private RepasSoir repasSoir = new RepasSoir(new Repas(""));

    public String getHoraire() {
        String str = String.format("""
                        Horaire d'ajd:
                        Debut | Activite | Fin  
                                            
                        %tR | %7s  | %tR 
                        %tR | %7s  | %tR  
                        %tR | %7s  | %tR 
                        %tR | %7s  | %tR  
                        %tR | %7s  | %tR 
                        %tR | %7s  | %tR 
                                                
                        """, morningOne.getBegin(), morningOne.getActivite().getName(), morningOne.getEnd(),
                morningTwo.getBegin(), morningTwo.getActivite().getName(), morningTwo.getEnd(),
                lunch.getBegin(), lunch.getActivite().getName(), lunch.getEnd(),
                afternoonOne.getBegin(), afternoonOne.getActivite().getName(), afternoonOne.getEnd(),
                afternoonTwo.getBegin(), afternoonTwo.getActivite().getName(), afternoonTwo.getEnd(),
                repasSoir.getBegin(), repasSoir.getActivite().getName(), repasSoir.getEnd());
        return str;
    }

    public MorningOne getMorningOne() {
        return morningOne;
    }

    public void setMorningOne(MorningOne morningOne) {
        this.morningOne = morningOne;
    }

    public MorningTwo getMorningTwo() {
        return morningTwo;
    }

    public void setMorningTwo(MorningTwo morningTwo) {
        this.morningTwo = morningTwo;
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public AfternoonOne getAfternoonOne() {
        return afternoonOne;
    }

    public void setAfternoonOne(AfternoonOne afternoonOne) {
        this.afternoonOne = afternoonOne;
    }

    public AfternoonTwo getAfternoonTwo() {
        return afternoonTwo;
    }

    public void setAfternoonTwo(AfternoonTwo afternoonTwo) {
        this.afternoonTwo = afternoonTwo;
    }

    public static void main(String[] args) {
        Sport sport = new Sport("Basket");
        MorningOne morningOne = new MorningOne(sport);
        Horaire horaire = new Horaire();
        horaire.setMorningOne(morningOne);
        System.out.println(horaire.getHoraire());
    }


}
