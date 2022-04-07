package kodutoo_draft;

public class Tulud implements LiidesTulud{
    int avatudAeg;
    int rajad;
    int rajaRent;
    int jalanouRent;
    int rajadKasutuses;
    int toitlustus;
    int klientideArv;


    public Tulud(int avatudAeg, int rajad, int rajaRent, int jalanouRent, int rajadKasutuses, int toitlustus, int klientideArv) {
        this.avatudAeg = avatudAeg;
        this.rajad = rajad;
        this.rajaRent = rajaRent;
        this.jalanouRent = jalanouRent;
        this.rajadKasutuses = rajadKasutuses;
        this.toitlustus = toitlustus;
        this.klientideArv = klientideArv;
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
        int tulu = klientideArv * (toitlustus + jalanouRent + rajaRent);
        String tulemus = "Selle kuu tulu on " + tulu;
        return tulemus;
    }

    @Override
    public String protRajadKasutuses() {
        int max = rajad * avatudAeg;
        String tulemus = "Rajad olid kasutuses " + (rajadKasutuses * 100) / max + "% maksimaalsest ajast.";
        return tulemus;
    }


}