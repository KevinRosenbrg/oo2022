package teine_pkt;

import java.sql.SQLOutput;

public class Joogivaat {
    double ruumala;
    double liitritesJooki;

    public Joogivaat(double ruumala, double liitritesJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitritesJooki;
    }

    public boolean taidaJoogiPudel(JoogiPudel joogiPudel) {
        if (liitritesJooki > joogiPudel.maht) {
            System.out.print("Jooki mahub!~");
            return true;
        } else {
            System.out.print("Jooki ei mahu!");
            return false;
        }
    }

    public int villiPudelid(JoogiPudel joogiPudel) {
        int loendur = 0;
        while (liitritesJooki >= joogiPudel.maht) {
            liitritesJooki -= joogiPudel.maht;
            loendur++;
        }
        System.out.print("Villisid " + loendur + " jooki.");
        return loendur;
    }

}
