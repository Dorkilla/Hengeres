package hu.szamalk.modell;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public void setFalvastagsag(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }


    @Override
    public double terfogat() {
        //sok változó a magyarázathoz:
//        double kulsoTerfogat = super.terfogat();
//        double belsoSugar = getSugar()-falvastagsag;
//        MertaniHenger belsoHenger = new MertaniHenger(belsoSugar, this.getMagassag());
//        double belsoTerfogat = belsoHenger.terfogat();
//        return kulsoTerfogat - belsoTerfogat;

        double belsoSugar = getSugar()-falvastagsag;
        MertaniHenger belsoHenger = new MertaniHenger(belsoSugar, this.getMagassag());
        //+1 henger létrejött, ezért kell csökkenteni
        MertaniHenger.csokkentHengerDarab();
        return super.terfogat() - belsoHenger.terfogat();

    }

    @Override
    public String toString() {
        String os = super.toString();
        return "LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}' + " --|> " + os;
    }
}
