public class SaatDonusturme {
    public static void main(String[] args) {
        int saniye = 3665;
        int saat = saniye / 3600;
        int dakika = (saniye % 3600) / 60;
        int kalanSaniye = saniye % 60;
        System.out.print(saat + ":");
        if(dakika < 10) {
            System.out.print("0");
        }
        System.out.print(dakika + ":");
        if(kalanSaniye < 10) {
            System.out.print("0");
        }
        System.out.print(kalanSaniye);
    }
}
