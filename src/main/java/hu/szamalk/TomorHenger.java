package hu.szamalk;

public class TomorHenger extends MertaniHenger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag,1);

    }

    public TomorHenger(double sugar, double magassag,double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    public double suly(){
//        double v0=terfogat();
//        double v1=this.terfogat();
//        double v2=super.terfogat();
//        double v=v1;
        return this.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return "TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}' + " --|> " + os;
    }
}
