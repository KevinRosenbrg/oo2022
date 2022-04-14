package kodutoo;

public class NotToday extends Pop{
    int notTodayOut = 2017;
    String name = "Not Today";

    public void yearsAfterCreation() {
        int year = notTodayOut - popStarted;
        System.out.println(name + " came out about " + year + " years after " + genre + " was created.");
    }
}
