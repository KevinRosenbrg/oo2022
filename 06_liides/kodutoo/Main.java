package kodutoo;

public class Main {
    public static void main(String[] args) {

        AvgSong as = new AvgSong("Your Man", "Josh Turner", 211, 240, 130);
        as.songBy();
        System.out.println(as.calcSingPercent());
        System.out.println("");
        AvgSong as1 = new AvgSong("Love Me Tender", "Elvis Presley", 162, 162, 100);
        as1.songBy();
        System.out.println(as1.calcSingPercent());
        System.out.println("");
        AvgSong as2 = new AvgSong("Lights Out", "Evilmane", 462, 147, 200);
        as2.songBy();
        System.out.println(as2.calcSingPercent());
    }
}
