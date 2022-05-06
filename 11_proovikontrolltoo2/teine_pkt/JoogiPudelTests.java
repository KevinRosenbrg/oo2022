package teine_pkt;

import org.junit.Test;
import org.testng.Assert;

public class JoogiPudelTests {

    // add JUnit 4 to classpath
    @Test
    public void arvutaKoguMassKuiJookiPole() {
        JoogiPudel joogipudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        double mass = joogipudel.getMass();
        Assert.assertEquals(20.0, mass, 0.1);
    }

    @Test
    public void arvutaKoguMassKuiJookOn() {
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca Cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double mass = joogiPudel.getMass();
        Assert.assertEquals(21.4, mass, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookiPole() {
        JoogiPudel joogipudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        double hind = joogipudel.getKoguhind();
        Assert.assertEquals(0.2, hind, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookOn() {
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca Cola", 0.6, 1.4);
        joogiPudel.jook = coca;
        double hind = joogiPudel.getKoguhind();
        Assert.assertEquals(1.04, hind, 0.1);
    }

}
