import java.awt.datatransfer.SystemFlavorMap;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Soru soruClass = new Soru();
        Scanner read = new Scanner(System.in);
        String karar;
        System.out.print("Oyuna Girmek İçin 'a' \t -- Soru eklemek için 'b' tuşuna basınız\n");
        boolean kontrol = true;
        while (kontrol) {
            System.out.print("Karar : ");
            karar = read.nextLine();
            if (karar.equals("a")) {
                soruClass.SoruGetir();
                kontrol = false;
            } else if (karar.equals("b")) {
                System.out.print("Soru Sayısı: ");
                int soruSayisi = Integer.parseInt(read.nextLine());
                String[] soru = new String[soruSayisi];
                String _soru, a, b, c, d, cevap;
                for (int i = 0; i < soruSayisi; i++) {
                    System.out.print("Soru: ");
                    _soru = read.nextLine();
                    System.out.print("A Şıkkı: ");
                    a = read.nextLine();
                    System.out.print("B Şıkkı: ");
                    b = read.nextLine();
                    System.out.print("C Şıkkı: ");
                    c = read.nextLine();
                    System.out.print("D Şıkkı: ");
                    d = read.nextLine();
                    System.out.print("Cevap: ");
                    cevap = read.nextLine();
                    soru[i] = _soru + "-" + a + "-" + b + "-" + c + "-" + d + "-" + cevap;
                }
                soruClass.SoruEkle(soru);
                kontrol = false;
            } else {
                System.out.println("Lütfen 'a' veya 'b' tuşlarına basınız!");
            }
        }
        System.out.print("Dögü bitti!");

    }
}
