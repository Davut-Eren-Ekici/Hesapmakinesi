import java.util.Scanner;

public class Main {
    public static void Arti(int Sayi1, int sayi2) {
        int toplam = Sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
    }

    public static void Cikarma(int Sayi1, int sayi2) {
        int cikarma = Sayi1 - sayi2;
        System.out.println("Cikarma: " + cikarma);
    }

    public static void Carpma(int Sayi1, int sayi2) {
        int carpma = Sayi1 * sayi2;
        System.out.println("Carpma: " + carpma);
    }

    public static void Bolme(double Sayi1, double sayi2) {
        double bolme = Sayi1 / sayi2;
        System.out.println("Bolme: " + bolme);
    }
   

    public static void main(String[] args) {
        System.out.println("===Basit Hesap Makinesi===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz(+, -, *, /): ");
        String islem = scanner.next();

        switch (islem) {
            case "+":
                Arti(sayi1, sayi2);
                break;
            case "-":
                Cikarma(sayi1, sayi2);
                break;
            case "*":
                Carpma(sayi1, sayi2);
                break;
            case "/":
                Bolme((double) sayi1, (double) sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem!");
        }
        scanner.close();
    }
}