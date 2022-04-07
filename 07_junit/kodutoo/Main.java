package kodutoo;

public class Main {
        public static void main(String[] args) {
            TuluKulu esimene = new TuluKulu(300, 10, 30, 3, 2500, 10, 500, 2500, 450, 0, 200, 150, 1000, 3000);
            System.out.println(esimene.maxTulu());
            System.out.println(esimene.renditudRadadeTulu());
            System.out.println(esimene.kuuTulu());
            System.out.println(esimene.protRajadKasutuses());
            System.out.println(esimene.maxKulud());
            System.out.println(esimene.kuuKulud());
            System.out.println(esimene.maxKasum());
            System.out.println(esimene.kuuKasum());
        }
}
