package kodutoo;

public class YourMan extends Country{
    int yourManOut = 2006;
    String name  = "Your Man";

    public void isYourMan() {
        System.out.println("It is Your Man");
    }
    public void yearsAfterCreation() {
        int year = yourManOut - countryStarted;
        System.out.println(name + " came out about " + year + " years after " + genre + " was created.");
    }
}
