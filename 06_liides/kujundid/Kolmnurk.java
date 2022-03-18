package kujundid;

public class Kolmnurk implements Kujund{
    double kylg1;
    double kylg2;
    double kylg3;

    public Kolmnurk(double kylg1, double v, double v1) {
        this.kylg1 = kylg1;
        this.kylg2 = v;
        this.kylg3 = v1;
    }

    @Override
    public double arvutaUmbermoot() {
        return kylg1 + kylg2 + kylg3;
    }

    @Override
    public double arvutaPindala() {
        return Math.sqrt(arvutaUmbermoot() * (arvutaUmbermoot()/2 - kylg1) * (arvutaUmbermoot()/2 - kylg2) * (arvutaUmbermoot()/2 - kylg3));
    }
}
