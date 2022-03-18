package isikukood;

public class IsikukoodEE implements IsikukoodObject {
    String isikukood;
    String[] kuud = {"Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember"};

    // 50398092458

    public IsikukoodEE(String isikukood) { // kohustab uue klassi loomisel votma isikukoodi kaasa
        this.isikukood = isikukood;
    }

    @Override
    public boolean isMale() {
        return isikukood.startsWith("1") || isikukood.startsWith("3") || isikukood.startsWith("5");
    }

    @Override
    public int getBirthYear() {
        return 1900 + Integer.parseInt(isikukood.substring(1,3));
    }

    @Override
    public String getBirthMonth() {
        return kuud[Integer.parseInt(this.isikukood.substring(3,5))-1];
    }
}