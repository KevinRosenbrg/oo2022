package kodutoo;

public class MMain {
    public static void main(String[] args) {

        YourMan yourman = new YourMan();
        ChopSuey chopsuey = new ChopSuey();
        NotToday nottoday = new NotToday();

        // nottoday.isPop();
        // yourman.isMusic();
        // yourman.isYourMan();
        
        yourman.yearsAfterCreation();
        System.out.println("");

        nottoday.yearsAfterCreation();
        System.out.println("");

        chopsuey.yearsAfterCreation();
        System.out.println("");

        Rock rock = new Rock();
        Pop pop = new Pop();
        Country country = new Country();

        rock.whenRock();
        pop.whenPop();
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
