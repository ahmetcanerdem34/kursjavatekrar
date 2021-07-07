package MentorKursGroupGenelSoruCozum;

import java.util.Scanner;



public class mini_ProjeSonHali {

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya(1.oyuncuya) kelimedeki harf sayisi kadar puan ekleyin
     *        ve else durumunda 2. oyuncuya da puan ekleyin...3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    static Scanner scan= new Scanner(System.in);
    static int oyuncu=1;
    static int puan1=0;
    static int puan2=0;
    static String kelime="";
    static String yeniKelime="";


    public static void main(String[] args) {//kelime girmesini istiyorsam Scanner ile girilen kelimeyi almam gerekecektir ve yazdýracaðým

        System.out.print(oyuncu+". oyuncu bir kelime giriniz :");
        String kelime=scan.next();
        System.out.println(oyuncu + ". oyuncunun girdiði kelime:"+kelime);

        girilenKelimeKabulMu();
        oyuncuDegistir();

    }
    public static void girilenKelimeKabulMu() {

        System.out.print("Girilen kelimeyi kabul ediyor musunuz?\nEvetse: 1\nHayýrsa 0\nGiriniz:");
        int kabul =scan.nextInt();
        if(kabul==1){
            if(oyuncu==1)
                puan1=puan1+kelime.length();
            else
                puan2=puan2+kelime.length();
                oyunaDevamMi();

        }else{
           oyunuBitir();
        }

    }
    public static void oyunaDevamMi() {

        System.out.print(oyuncu+". oyuncu oyuna Devam Etmek Ýstiyor musunuz?\nEvetse: 1\nHayýrsa 0\nGiriniz:");
        int tercih=scan.nextInt();
        if(tercih==1){
            kelimeEkle();
        }else
            oyunuBitir();
    }
    private static void kelimeEkle() {
        System.out.print("Eski kelimeye eklemek için yeni kelime giriniz:");
        yeniKelime=scan.next();
        System.out.print("Yeni kelimeyi önceki kelimenin baþýna mý sonuna mý eklemek istersiniz?\nBasina 3\nSonuna 4\nGiriniz:");
        int basSon=scan.nextInt();

        if(basSon==3)
           kelime=yeniKelime+kelime;
        else
            kelime=kelime+yeniKelime;
            oyuncuDegistir();
            girilenKelimeKabulMu();

    }
    public static void oyuncuDegistir() {
        if(oyuncu==1){
            oyuncu=2;
        }else{
            oyuncu=1;
        }
    }
    public static void oyunuBitir() {

        System.out.println("oyun bitti...");
        System.out.println("1. oyuncu puaný :" + puan1);
        System.out.println("2. oyuncu puaný :" + puan2);
        if (puan1 > puan2) {
            System.out.println("kazanan 1 oyuncu");
        }
        if (puan1 < puan2) {
            System.out.println("kazanan 2 oyuncu");
        } else System.out.println("oyun berabere bitti..");

    }

}
