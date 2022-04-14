package kodutoo;

public class Rock extends Music{
    int rockStarted = 1940;
    String genre = "rock music";

    public void isRock() {
        System.out.println("It is rock");
    }

    public void whenRock() {
        int year = 35000 - (2022 - rockStarted);
        System.out.println("About " + year + " years after music was created " + genre + " was invented.");
    }
}
