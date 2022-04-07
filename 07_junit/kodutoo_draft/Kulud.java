package kodutoo_draft;

public class Kulud implements LiidesKulud {
    int pinnaRent;
    int elektriHind;
    int toitlustus;
    int koristamine;
    int hooldus;
    int kommunaal;
    int palgaFond;

    public Kulud(int pinnaRent, int elektriHind, int toitlustus, int koristamine, int hooldus, int kommunaal, int palgaFond) {
        this.pinnaRent = pinnaRent;
        this.elektriHind = elektriHind;
        this.toitlustus = toitlustus;
        this.koristamine = koristamine;
        this.hooldus = hooldus;
        this.kommunaal = kommunaal;
        this.palgaFond = palgaFond;
    }

    @Override
    public String maxKulud() {
        int kokku = pinnaRent + elektriHind + koristamine + hooldus + kommunaal + palgaFond;
        String tulemus = "Maksimaalne kulu oleks (ilma toitlustuseta) " + kokku;
        return tulemus;
    }

    @Override
    public String kuuKulud() {
        int kokku = pinnaRent + elektriHind + toitlustus + koristamine + hooldus + kommunaal + palgaFond;
        String tulemus = "Selle kuu kulu on " + kokku;
        return tulemus;
    }

}
