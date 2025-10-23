public class ParaBozma {
    public static void main(String[] args) {
        int bozulacakPara = 278;
        int yuzluk = bozulacakPara / 100;
        int ellilik = (bozulacakPara % 100) / 50;
        int yirmilik = (bozulacakPara % 50) / 20;
        int onluk = (bozulacakPara % 20) / 10;
        int beslik = (bozulacakPara % 10) / 5;
        int ikilik = (bozulacakPara % 5) / 2;
        int birlik = bozulacakPara % 2;
        System.out.println("Bozulan Para: " + bozulacakPara + " TL");
        System.out.println(yuzluk + "x100, " + ellilik + "x50, " + yirmilik + "x20, " + onluk + "x10, " + beslik + "x5, " + ikilik + "x2, " + birlik + "x1");
    }
}
