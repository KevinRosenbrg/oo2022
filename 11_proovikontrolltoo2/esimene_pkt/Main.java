package esimene_pkt;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double pendliPikkus = 0.2;
        Hammasratas hammasratas1 = new Hammasratas(60, 15);
        Hammasratas hammasratas2 = new Hammasratas(60, 30);
        Hammasratas hammasratas3 = new Hammasratas(12, 40);

        Pendel pendel = new Pendel(pendliPikkus, hammasratas1, hammasratas2, hammasratas3);

        boolean isLeft = false;
        int counter = 0;
        int ringid1 = 0;
        int ringid2 = 0;

        System.out.println("Pendli suurus: " + pendliPikkus);
        System.out.println("1. hammasratta suurus: " + hammasratas1.suurus);
        System.out.println("2. hammasratta suurus: " + hammasratas2.suurus);
        System.out.println("3. hammasratta suurus: " + hammasratas3.suurus);
        System.out.printf("Minu kella suurus: %.2f", (pendliPikkus + hammasratas1.suurus + hammasratas2.suurus + hammasratas3.suurus));

        System.out.println(pendel.vonkePeriood());

        while (true) {
            TimeUnit.MILLISECONDS.sleep((long) (pendel.vonkePeriood()*1000)/2);
            if (isLeft) {
                System.out.println("Pendel vaskakul");
                isLeft = false;
                counter++;
            } else {
                System.out.println("Pendel paremal");
                isLeft = true;

            }
            if (hammasratas1.hambad == counter) {
                ringid1++;
                counter = 0;
                if (hammasratas2.hambad == ringid1) {
                    ringid2++;
                    ringid1 = 0;
                }

            }
            System.out.println("Kell:");
            /*
            System.out.print(ringid3 + ".");
            System.out.print(ringid2 + ".");
            System.out.print(ringid1);
            */
            System.out.println(ringid2 + "." + ringid1 + "." + counter);
            System.out.println("");
        }
    }

}
