import java.util.Scanner;

public class Kmain {

    public static void main(String[] args) {

        Song song1 = new Song("L-O-V-E", "Nat King Cole", 1965);
        Song song2 = new Song("Oh, Pretty Woman", "Roy Robinson", 1964);
        Song song3 = new Song("The Rumbling", "SiM", 2022);
        Kodu2 kodu = new Kodu2(song1);

        String song1Info = song1.toStrings();
        String song2Info = song2.toStrings();
        String song3Info = song3.toStrings();

        String song1Years = song1.countYears();
        String song2Years = song2.countYears();
        String song3Years = song3.countYears();
        String koduSong = kodu.getSong();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        while (!userInput.equals("end")) {
            if (userInput.equals("1")){
                System.out.println(song1Info);
            } if (userInput.equals("2")){
                System.out.println(song2Info);
            } if (userInput.equals("3")) {
                System.out.println(song3Info);
            } if (userInput.equals("all")) {
                System.out.println(song1Info);
                System.out.println(song2Info);
                System.out.println(song3Info);
            } if (userInput.equals("1year")){
                System.out.println(song1Years);
            } if (userInput.equals("2year")){
                System.out.println(song2Years);
            } if (userInput.equals("3year")){
                System.out.println(song3Years);
            } // else {System.out.println("Sellist käsku ei ole");}

            System.out.println(koduSong); // Laulu andmed: Song@5f184fc6

            userInput = scanner.nextLine();
        }
    }
}
