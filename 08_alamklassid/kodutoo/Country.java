package kodutoo;

public class Country extends Music{
    int countryStarted = 1920;
    String genre = "country music";

    public void isCountry() {
        System.out.println("It is country");
    }

    public void whenCountry() {
        int year = 35000 - (2022 - countryStarted);
        System.out.println("About " + year + " years after music was created " + genre + " was invented.");
    }
}
