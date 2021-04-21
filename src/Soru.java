import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    File dosya = new File("sorular.txt");

    public void SoruEkle(String[] soru) throws IOException {
        if (dosya.exists())
            dosya.createNewFile();
        FileWriter fw = new FileWriter(dosya, true);
        PrintWriter yaz = new PrintWriter(fw);
        for (int i = 0; i < soru.length; i++)
            fw.write(soru[i]);
        yaz.close();
    }

    public void SoruGetir() throws IOException {
        ArrayList<String> list = new ArrayList();
        FileReader fr = new FileReader(dosya);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            list.add(br.readLine());
        }
        String[] gelenSoru = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            gelenSoru[i] = list.get(i);

        String[] soruOku = new String[6];
        String _soru = "a", a, b, c, d, cvp;
        for (int i = 0; i < gelenSoru.length; i++) {
                soruOku = gelenSoru[i].split("-");
                if (soruOku.length == 6) {
                    _soru = soruOku[0];
                    a = soruOku[1];
                    b = soruOku[2];
                    c = soruOku[3];
                    d = soruOku[4];
                    cvp = soruOku[5];
                    Cevapla(_soru, a, b, c, d, cvp);
                }
        }
        System.out.println("Sınav Bitti");
    }

    static int sayac = 1;

    void Cevapla(String _soru, String a, String b, String c, String d, String cvp) {
        Scanner read = new Scanner(System.in);
        String cevapVer, mesaj = "";
        System.out.println("-------" + sayac + ". Soru" + "-------");
        System.out.println();
        System.out.println("Soru : " + _soru);
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println();
        System.out.print("Cevap: ");
        cevapVer = read.nextLine();
        if (cevapVer.equals("A")) {
            if (!a.equals(cvp))
                mesaj = "Yanlış Cevap! Doğru cevap " + cvp;
            else mesaj = "Tebrikler Bildiniz!!";

        } else if (cevapVer.equals("B")) {
            if (!b.equals(cvp))
                mesaj = "Yanlış Cevap! Doğru cevap " + cvp;
            else mesaj = "Tebrikler Bildiniz!!";
        } else if (cevapVer.equals("C")) {
            if (!c.equals(cvp))
                mesaj = "Yanlış Cevap! Doğru cevap " + cvp;
            else mesaj = "Tebrikler Bildiniz!!";
        } else if (cevapVer.equals("D")) {
            if (!d.equals(cvp))
                mesaj = "Yanlış Cevap! Doğru cevap " + cvp;
            else mesaj = "Tebrikler Bildiniz!!";
        }
        System.out.println(mesaj);
        sayac++;
    }
}
