package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run() {
        //MertaniHenger.csokkentHengerDarab();
        int db = MertaniHenger.getHengerDarab();
        System.out.printf("A felhasznált hengerek(%d db):\n", db);
        //for(MertaniHenger henger : hengerek){
        for (MertaniHenger henger : this.lista()) {
            System.out.println(henger);
        }
        System.out.println("Átlagtérfogat: " + this.atlagTerfogat());
        System.out.println("Csövek össz. súlya: " + this.csovekSulya());
    }


    public HengerProgram() {
        hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1,.5));
        hengerek.add(new LyukasHenger(1, 1, 1,.1));
        hengerek.add(new LyukasHenger(1, 1, 1,.5));
        hengerek.add(new LyukasHenger(1, 1, 1,1));
    }

    public double atlagTerfogat() {
        double ossz = 0;
        for (MertaniHenger henger : this.lista()) {
            ossz += henger.terfogat();
        }
        return ossz / MertaniHenger.getHengerDarab();
    }

    public double csovekSulya() {
        double ossz = 0;
        for (MertaniHenger henger : this.lista()) {
            //Mértaninak nincs súlya, csak tömörnek,
            //de nekünk a lyukas kell, ami megörökli a tömörtől a súlyt,
            //ezért, ha a Henger dinamikus típusa LyukasHenger akkor kasztolunk,
            //különben ClassCastException:
            if (henger instanceof LyukasHenger)
            {
                /*2 sorban:
                LyukasHenger ly = (LyukasHenger) henger;
                ossz += ly.suly();*/

                /*1 sorban: */
                ossz += ((LyukasHenger) henger).suly();
            }
        }
        return ossz;
    }

    private List<MertaniHenger> lista(){
        return hengerek;
    }
}
