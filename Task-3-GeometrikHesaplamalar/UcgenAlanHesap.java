public class UcgenAlanHesap {
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        double c = 3;
        double s = (a + b + c) / 2;
        double alan = (s-a)*(s-b)*(s-c) * s;
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
