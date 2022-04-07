package kodutoo;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class AutomaatTest {

    @Test
    public void kas_maksimaalne_tulu_on_90000_kui_radasid_on_10_ja_avatud_aeg_on_300_tundi_ja_raja_rent_on_30_eurot() {
        TuluKulu esimene = new TuluKulu(300, 10, 30, 3, 2500, 10, 500, 2500, 450, 0, 200, 150, 1000, 3000);
        assertEquals("Maksimaalne tulu oleks 90000.0",esimene.maxTulu());
    }

    @Test
    public void kas_maksimaalne_kulu_on_7300() {
        TuluKulu esimene = new TuluKulu(300, 10, 30, 3, 2500, 10, 500, 2500, 450, 0, 200, 150, 1000, 3000);
        assertEquals("Maksimaalne kulu oleks (ilma toitlustuseta) 7300",esimene.maxKulud());
    }

    @Test
    public void kas_maksimaalne_kasum_on_82700() {
        TuluKulu esimene = new TuluKulu(300, 10, 30, 3, 2500, 10, 500, 2500, 450, 0, 200, 150, 1000, 3000);
        assertEquals("Maksimaalne kasum oleks 82700",esimene.maxKasum());
    }

    @Test
    public void kas_radade_kasutuse_protsent_on_83() {
        TuluKulu esimene = new TuluKulu(300, 10, 30, 3, 2500, 10, 500, 2500, 450, 0, 200, 150, 1000, 3000);
        assertEquals("Rajad olid kasutuses 83% maksimaalsest ajast.",esimene.protRajadKasutuses());
    }

}
