package Horaire;

import Horaire.Ancetres.Activite;
import Horaire.Day.*;

import java.time.LocalDate;

public class Horaire {
    private LocalDate date;
    private MorningOne morningOne = new MorningOne(new Activite(""));
    private MorningTwo morningTwo = new MorningTwo(new Activite(""));
    private Lunch lunch = new Lunch(new Activite(""));
    private AfternoonOne afternoonOne = new AfternoonOne(new Activite(""));
    private AfternoonTwo afternoonTwo = new AfternoonTwo(new Activite(""));
    private RepasSoir repasSoir = new RepasSoir(new Activite(""));

    public RepasSoir getRepasSoir() {
        return repasSoir;
    }

    public void setRepasSoir(RepasSoir repasSoir) {
        this.repasSoir = repasSoir;
    }

    public String getHoraire() {
        String str = String.format("""
                        +--------------+
                        |Horaire d'ajd:|
                        +--------------+-----------+
                        |L'heure       |  Activite | 
                        +--------------+-----------+                    
                        |%tR - %tR |  %7s   
                        |%tR - %tR |  %7s  
                        |%tR - %tR |  %7s  
                        |%tR - %tR |  %7s  
                        |%tR - %tR |  %7s 
                        |%tR - %tR |  %7s 
                        +--------------+-----------+                        
                        """,morningOne.getBegin(), morningOne.getEnd(), morningOne.getActivite().getName(),
                            morningTwo.getBegin(), morningTwo.getEnd(),morningTwo.getActivite().getName(),
                            lunch.getBegin(),lunch.getEnd(), lunch.getActivite().getName(),
                            afternoonOne.getBegin(), afternoonOne.getEnd(), afternoonOne.getActivite().getName(),
                            afternoonTwo.getBegin(), afternoonTwo.getEnd(), afternoonTwo.getActivite().getName(),
                            repasSoir.getBegin(), repasSoir.getEnd(), repasSoir.getActivite().getName());
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

//    public static void main(String[] args) {
//        Sport sport = new Sport("Basket");
//        MorningOne morningOne = new MorningOne(sport);
//        Horaire horaire = new Horaire();
//        horaire.setMorningOne(morningOne);
//        System.out.println(horaire.getHoraire());
//    }


}
