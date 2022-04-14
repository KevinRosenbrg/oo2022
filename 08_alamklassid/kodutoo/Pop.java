package kodutoo;

public class Pop extends Music{
    int popStarted = 1950;
    String genre = "pop music";

    public void isPop() {
        System.out.println("It is pop");
    }

    public void whenPop() {
        int year = 35000 - (2022 - popStarted);
        System.out.println("About " + year + " years after music was created " + genre + " was invented.");
    }
}
