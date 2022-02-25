public class Main {
    public static void main(String[] args) {
        Info info = new Info("ads","asd", "das", 1, 1);
        Arvuti arvuti = new Arvuti(info,  1999)

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}