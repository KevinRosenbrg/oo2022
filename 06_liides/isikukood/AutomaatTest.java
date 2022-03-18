package isikukood;


import kujundid.Kolmnurk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("50110040868");
        assertEquals(false,ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_synniaata_1951_kui_isikukoodi_keskel_on_51() {
        IsikukoodLV lv = new IsikukoodLV("041001-51237");
        assertEquals(false,lv.getBirthYear());
    }

    @Test
    public void kontrolli_kas_kujundi_pindala_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18.0,kolmnurk.arvutaUmbermoot(),0.1);
    }

}
