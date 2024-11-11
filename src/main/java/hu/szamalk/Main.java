package hu.szamalk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MertaniHenger mertaniHenger = new MertaniHenger(1,1);
        TomorHenger tomorHenger = new TomorHenger(1,1);
        LyukasHenger lyukasHenger = new LyukasHenger(1,1,1);
        System.out.println("m = " +mertaniHenger);
        System.out.println("t = " +tomorHenger);
        System.out.println("ly = " +lyukasHenger);

    }
}