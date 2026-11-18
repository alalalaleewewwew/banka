import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bakiye = 10000.0;
        int islemSayisi = 0;
        double toplamYatirilan = 0;
        double toplamCekilen = 0;

        while (true) {
            System.out.println("\n--- ATM Menusu ---");
            System.out.println("1. Bakiye Goruntuleme");
            System.out.println("2. Para Yatirma");
            System.out.println("3. Para Cekme");
            System.out.println("4. Cikis");
            System.out.print("Seciminiz: ");
            
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("Guncel Bakiye: " + bakiye + " TL");
                islemSayisi++;
            } else if (secim == 2) {
                System.out.print("Yatirilacak tutar: ");
                double miktar = scanner.nextDouble();
                
                if (miktar <= 0) {
                    System.out.println("Hata: Negatif veya sifir miktar yatiraysamaz.");
                } else {
                    bakiye += miktar;
                    toplamYatirilan += miktar;
                    islemSayisi++;
                    System.out.println("Islem basarili. Yeni bakiye: " + bakiye + " TL");
                }
            } else if (secim == 3) {
                System.out.print("Cekilecek tutar: ");
                double miktar = scanner.nextDouble();
                
                if (miktar <= 0) {
                    System.out.println("Hata: Gecersiz tutar.");
                } else if (miktar > bakiye) {
                    System.out.println("Hata: Yetersiz bakiye.");
                } else {
                    bakiye -= miktar;
                    toplamCekilen += miktar;
                    islemSayisi++;
                    System.out.println("Islem basarili. Kalan bakiye: " + bakiye + " TL");
                }
            } else if (secim == 4) {
                System.out.println("\n--- Oturum Sonlandirildi ---");
                System.out.println("Toplam Yapilan Islem Sayisi: " + islemSayisi);
                System.out.println("Toplam Yatirilan Tutar    : " + toplamYatirilan + " TL");
                System.out.println("Toplam Cekilen Tutar      : " + toplamCekilen + " TL");
                System.out.println("Son Bakiye                : " + bakiye + " TL");
                break;
            } else {
                System.out.println("Hata: Gecersiz secim. 1-4 arasinda bir deger girin.");
            }
        }
        
        scanner.close();
    }
}
