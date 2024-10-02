public class Dizi2 {

    String[] elemanlar;
    int indis;
    int boyut;

    public Dizi2(int boyut) {
        this.boyut = boyut;
        this.elemanlar = new String[boyut];
        this.indis = 0;
    }

    public void ekle(String kelime) {
        if (this.indis < this.boyut) {
            this.elemanlar[this.indis] = kelime;
            this.indis++;
        } else {
            System.out.println("Dizi dolu");
        }
    }

    public int arama(String aranan) {
        for (int index = 0; index < this.indis; index++) {
            if (this.elemanlar[index].equals(aranan)) {
                return index;
            }
        }
        return -1;
    }

    public void sil(String kelime) {
        int i = arama(kelime);
        if (i != -1) {
            while (i < this.indis - 1) {
                this.elemanlar[i] = this.elemanlar[i + 1];
                i++;
            }
            this.elemanlar[this.indis - 1] = null;  // Son elemanı temizle
            this.indis--;
        } else {
            System.out.println("Silinecek eleman bulunamadı");
        }
    }

    public void guncelle(String silinecek, String kelime) {
        int i = arama(silinecek);
        if (i != -1) {
            this.elemanlar[i] = kelime;
        } else {
            System.out.println("Güncellenecek eleman bulunamadı");
        }
    }

    public void yazdir() {
        if (this.indis == 0) {
            System.out.println("Dizi boş");
        } else {
            for (int i = 0; i < this.indis; i++) {
                System.out.println(this.elemanlar[i]);
            }
        }
    }
}


