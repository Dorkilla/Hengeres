package hu.szamalk;

public class MertaniHenger {
    private int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "hengerDarab=" + hengerDarab +
                ", sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
    public double terfogat(){
    return 0.0;
    }

    public int getHengerDarab() {
        return hengerDarab;
    }
}
