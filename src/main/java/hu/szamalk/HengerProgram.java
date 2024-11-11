package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger>hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }
        public void run(){
            int db = MertaniHenger.getHengerDarab();
            System.out.printf("A felhasznált hengerek(%d db):\n", db);
            //for(MertaniHenger henger : hengerek){
            for(MertaniHenger henger : this.lista()){
                System.out.println(henger);
            }
            System.out.println("Átlagtérfogat: " + this.atlagTerfogat());
            System.out.println("Csövek össz. súlya: " + this.csovekSulya());
        }


    public HengerProgram(){
        hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(1,1));
        hengerek.add(new TomorHenger(1,1));
        hengerek.add(new LyukasHenger(1,1,1));
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
}
