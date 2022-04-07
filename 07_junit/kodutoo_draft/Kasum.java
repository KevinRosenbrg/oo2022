package kodutoo_draft;

import kodutoo_draft.Kulud;
import kodutoo_draft.LiidesKasum;
import kodutoo_draft.Tulud;

public class Kasum extends Kulud {
    public Kasum(int pinnaRent, int elektriHind, int toitlustus, int koristamine, int hooldus, int kommunaal, int palgaFond) {
        super(pinnaRent, elektriHind, toitlustus, koristamine, hooldus, kommunaal, palgaFond);
    }

    public class Kulud extends Tulud implements LiidesKasum {

        public Kulud(int avatudAeg, int rajad, int rajaRent, int jalanouRent, int rajadKasutuses, int toitlustus, int klientideArv) {
            super(avatudAeg, rajad, rajaRent, jalanouRent, rajadKasutuses, toitlustus, klientideArv);
        }


        @Override
        public String maxKasum() {
            int kasum = (rajad * avatudAeg * rajaRent) - (pinnaRent + elektriHind + koristamine + hooldus + kommunaal + palgaFond);
            String tulemus = "Maksimaalne tulu oleks " + kasum;
            return tulemus;
        }

        @Override
        public String kuuKasum() {
            int kasum = ((klientideArv * (toitlustus + jalanouRent)) + (rajadKasutuses * rajaRent)) - (pinnaRent + elektriHind + toitlustus + koristamine + hooldus + kommunaal + palgaFond);
            String tulemus = "Kuu kasum on " + kasum;
            return tulemus;
        }
    }
}
