import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dizi2 sınıfından bir nesne oluşturuyoruz. Dizinin boyutu 5 olarak belirleniyor.
        Dizi2 dizi = new Dizi2(5);
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            // Kullanıcıya seçim menüsü sunuyoruz
            System.out.println("Lütfen bir işlem seçin:");
            System.out.println("1. Eleman Ekle");
            System.out.println("2. Eleman Ara");
            System.out.println("3. Eleman Sil");
            System.out.println("4. Eleman Güncelle");
            System.out.println("5. Diziyi Yazdır");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine(); // Satır sonunu okumak için

            switch (secim) {
                case 1:
                    // Eleman ekle
                    System.out.print("Eklenecek eleman: ");
                    String kelimeEkle = scanner.nextLine();
                    dizi.ekle(kelimeEkle);
                    break;

                case 2:
                    // Eleman ara
                    System.out.print("Aranacak eleman: ");
                    String kelimeAra = scanner.nextLine();
                    int index = dizi.arama(kelimeAra);
                    if (index != -1) {
                        System.out.println(kelimeAra + " dizide bulundu. İndeks: " + index);
                    } else {
                        System.out.println(kelimeAra + " dizide bulunamadı.");
                    }
                    break;

                case 3:
                    // Eleman sil
                    System.out.print("Silinecek eleman: ");
                    String kelimeSil = scanner.nextLine();
                    dizi.sil(kelimeSil);
                    break;

                case 4:
                    // Eleman güncelle
                    System.out.print("Güncellenecek eleman: ");
                    String kelimeEski = scanner.nextLine();
                    System.out.print("Yeni eleman: ");
                    String kelimeYeni = scanner.nextLine();
                    dizi.guncelle(kelimeEski, kelimeYeni);
                    break;

                case 5:
                    // Diziyi yazdır
                    dizi.yazdir();
                    break;

                case 0:
                    // Programdan çıkış
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        } while (secim != 0);

        scanner.close();
    }
}
