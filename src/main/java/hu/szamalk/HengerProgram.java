package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger>hengerek;

    public static void main(String[] args) {
        MertaniHenger mertaniHenger = new MertaniHenger(1,1);
        TomorHenger tomorHenger = new TomorHenger(1,1);
        LyukasHenger lyukasHenger = new LyukasHenger(1,1,1);
        System.out.println("m = " +mertaniHenger);
        System.out.println("t = " +tomorHenger);
        System.out.println("ly = " +lyukasHenger);

    }
    public HengerProgram(){
        hengerek = new ArrayList<>();
    }
    public double atlagTerfogat(){
        return 0.0;
    }
    public double csovekSulya(){
        return 0.0;
    }

    private List<MertaniHenger> lista(){
        return hengerek;
    }

    public void run(){

    }

}