import java.util.ArrayList;
import java.util.List;

public class Arvud {
    List<Integer> arvudListis = new ArrayList<>();
    // [] - tuhi massiiv
    //ilma new ArrayList osata - null
    List<Double> arvudKeskmisega = new ArrayList<>();

    public Arvud(int arv1, int arv2, int arv3){
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(int arv) {
        arvudListis.add(arv);
    }
    public List<Double> libisevKeskmine() {
        List<Double> loppList = new ArrayList<>(this.arvudListis.size() - 2);
        for (int i = arvudKeskmisega.size(); i < this.arvudListis.size() - 2; i++) {
            loppList.add((this.arvudListis.get(i + 1) + this.arvudListis.get(i + 2)) / 2.0);
        }
        arvudKeskmisega.addAll(loppList);
        return arvudKeskmisega;
    }
}
