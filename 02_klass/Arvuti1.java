public class Arvuti1 {
    Info info;
    int maksumus;

    public Arvuti1(Info info, int maksumus) {
        this.info = info;
        this.maksumus = maksumus;
    }

    public String getInfo() {
        return "Arvuti on parameetritega: " + this.info + ". Maksumus on: " + this.maksumus;
    }
}