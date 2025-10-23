public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Kitap";
        int miktar1 = 3;
        double fiyat1 = 29.99;

        String urun2 = "Defter";
        int miktar2 = 5;
        double fiyat2 = 9.99;

        String urun3 = "Kalem";
        int miktar3 = 10;
        double fiyat3 = 1.99;

        double toplam1 = miktar1 * fiyat1;
        double toplam2 = miktar2 * fiyat2;
        double toplam3 = miktar3 * fiyat3;

        double genelToplam = toplam1 + toplam2 + toplam3;

        System.out.println("----------------------------------------------");
        System.out.println("| Ürün        | Miktar | Fiyat (TL) | Toplam ");
        System.out.println("----------------------------------------------");

        // Satırlar
        System.out.println("| " + urun1 + "          " + miktar1 + "         " + fiyat1 + "          " + (miktar1 * fiyat1));
        System.out.println("| " + urun2 + "          " + miktar2 + "         " + fiyat2 + "          " + (miktar2 * fiyat2));
        System.out.println("| " + urun3 + "          " + miktar3 + "         " + fiyat3 + "          " + (miktar3 * fiyat3));

        System.out.println("----------------------------------------------");
        System.out.printf("| Genel Toplam:                       %.2f\n", genelToplam);
        System.out.println("----------------------------------------------");
    }
}
