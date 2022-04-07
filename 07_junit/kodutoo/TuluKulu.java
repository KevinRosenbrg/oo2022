package kodutoo;

public class TuluKulu implements LiidesTK {
    int avatudAeg;
    int rajad;
    int rajaRent;
    int jalanouRent;
    int rajadKasutuses;
    int toitlustusTulu;
    int klientideArv;

    int pinnaRent;
    int elektriHind;
    int toitlustusKulu;
    int koristamine;
    int hooldus;
    int kommunaal;
    int palgaFond;

    public TuluKulu(int avatudAeg, int rajad, int rajaRent, int jalanouRent, int rajadKasutuses, int toitlustusTulu, int klientideArv, int pinnaRent, int elektriHind, int toitlustusKulu, int koristamine, int hooldus, int kommunaal, int palgaFond) {
        this.avatudAeg = avatudAeg;
        this.rajad = rajad;
        this.rajaRent = rajaRent;
        this.jalanouRent = jalanouRent;
        this.rajadKasutuses = rajadKasutuses;
        this.toitlustusTulu = toitlustusTulu;
        this.klientideArv = klientideArv;
        this.pinnaRent = pinnaRent;
        this.elektriHind = elektriHind;
        this.toitlustusKulu = toitlustusKulu;
        this.koristamine = koristamine;
        this.hooldus = hooldus;
        this.kommunaal = kommunaal;
        this.palgaFond = palgaFond;
    }

    @Override
    public String maxTulu() {   // kommentaar seletuseks
        double tulu = rajad * avatudAeg * rajaRent; // kommentaar
        String tulemus = "Maksimaalne tulu oleks " + tulu;
        return tulemus;
    }

    @Override
    public String renditudRadadeTulu() {
        int tulu = rajadKasutuses * rajaRent;
        String tulemus = "Radade rentimise tulu on " + tulu;
        return tulemus;
    }

    @Override
    public String kuuTulu() {
        int tulu = klientideArv * (toitlustusTulu + jalanouRent);
        String tulemus = "Selle kuu teeninduse tulu on " + tulu;
        return tulemus;
    }

    @Override
    public String protRajadKasutuses() {
        int max = rajad * avatudAeg;
        String tulemus = "Rajad olid kasutuses " + (rajadKasutuses * 100) / max + "% maksimaalsest ajast.";
        return tulemus;
    }

    @Override
    public String maxKulud() {
        int kokku = pinnaRent + elektriHind + koristamine + hooldus + kommunaal + palgaFond;
        String tulemus = "Maksimaalne kulu oleks (ilma toitlustuseta) " + kokku;
        return tulemus;
    }

    @Override
    public String kuuKulud() {
        int kokku = pinnaRent + elektriHind + toitlustusKulu + koristamine + hooldus + kommunaal + palgaFond;
        String tulemus = "Selle kuu kulu on " + kokku;
        return tulemus;
    }

    @Override
    public String maxKasum() {
        int kasum = (rajad * avatudAeg * rajaRent) - (pinnaRent + elektriHind + koristamine + hooldus + kommunaal + palgaFond);
        String tulemus = "Maksimaalne kasum oleks " + kasum;
        return tulemus;
    }

    @Override
    public String kuuKasum() {
        int kasum = ((klientideArv * (toitlustusTulu + jalanouRent)) + (rajadKasutuses * rajaRent)) - (pinnaRent + elektriHind + toitlustusKulu + koristamine + hooldus + kommunaal + palgaFond);
        String tulemus = "Kuu kasum on " + kasum;
        return tulemus;
    }

}
