public class programerConstructor{

    public static void main(String[] args, programer programer) {

        programer yanto = new programer("yanto", 100000, 1000);

        System.out.println("nama : " + programer.nama);
        System.out.println("gajihpokok : " + programer.gajipokok);
        System.out.println("bonus : " + programer.bonus);
    }
}