public class MainProgram {
    public static void main(String[] args) {
        Phone mesin = new Phone();

        mesin.merk = "mediatek";
        mesin.volume = 80;

        Manusia geri = new Manusia();

        geri.merk = "Foco F2pro";
        geri.mesin = mesin;
        geri.powerOn();
        geri.run();
        geri.powerOff();
    }
}