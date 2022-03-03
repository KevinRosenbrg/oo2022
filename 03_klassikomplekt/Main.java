public class Main {
    public static void main(String[] args) {
//        Arvuti arvuti = new Arvuti(new Info("asd","ads","da",1,1),1999);

        Info info = new Info("asd","ads","da",1,1);
        Arvuti2 arvuti = new Arvuti2(info,1999);

        String arvutiInfo = arvuti.toString();
        System.out.println(arvutiInfo);
    }
}