package kodutoo_draft;

public class Main {
    public static void main(String[] args) {
        Kulud kulud1 = new Kulud(2500, 450, 0, 200, 150, 1000, 3000);
        System.out.println(kulud1.maxKulud());
        System.out.println();

        Kulud kulud2 = new Kulud(1200, 300, 250, 170, 120, 700, 3000);
        System.out.println(kulud2.kuuKulud());
        System.out.println();

        Tulud tulud1 = new Tulud(300, 10, 30, 3, 2500, 10, 500);
        System.out.println(tulud1.maxTulu());
        System.out.println(tulud1.renditudRadadeTulu());
        System.out.println(tulud1.kuuTulu());
        System.out.println(tulud1.protRajadKasutuses());
        System.out.println();

        Tulud tulud2 = new Tulud(300,10, 33, 5, 2000, 5, 300);
        System.out.println(tulud2.maxTulu());
        System.out.println(tulud2.renditudRadadeTulu());
        System.out.println(tulud2.kuuTulu());
        System.out.println(tulud2.protRajadKasutuses());
        System.out.println();

        Tulud tulud3 = new Tulud(300, 12, 35, 4, 1533, 15, 255);
        System.out.println(tulud3.maxTulu());
        System.out.println(tulud3.renditudRadadeTulu());
        System.out.println(tulud3.kuuTulu());
        System.out.println(tulud3.protRajadKasutuses());



    }
}
