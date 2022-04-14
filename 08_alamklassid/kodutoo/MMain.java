package kodutoo;

public class MMain {
    public static void main(String[] args) {

        YourMan yourman = new YourMan();
        // yourman.isMusic();
        // yourman.isYourMan();
        yourman.yearsAfterCreation();
        System.out.println("");

        NotToday nottoday = new NotToday();
        // nottoday.isPop();
        nottoday.yearsAfterCreation();
        System.out.println("");

        ChopSuey chopsuey = new ChopSuey();
        chopsuey.yearsAfterCreation();
        System.out.println("");

        Rock rock = new Rock();
        rock.whenRock();
        Pop pop = new Pop();
        pop.whenPop();
        Country country = new Country();
        country.whenCountry();

        /* test code
        Pop pop = new Pop();
        pop.isPop();
        System.out.println("");

        Country country = new Country();
        country.isCountry();
        System.out.println("");

        Rock rock = new Rock();
        rock.isMusic();
        System.out.println("");
         */
    }
}
