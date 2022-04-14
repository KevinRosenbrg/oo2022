package kodutoo;

public class ChopSuey extends Rock{
    int chopSueyOut = 2001;
    String name = "Chop Suey";

    public void yearsAfterCreation() {
        int year = chopSueyOut - rockStarted;
        System.out.println(name +" came out about " + year + " years after " + genre + " was created.");
    }
}
