package MentorBizimHTableTReeMapSorulari;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_09_Proje {

    static HashMap<String, String> person = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    /*
                        1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                        2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin
                        saveInfo() method olusturun:
                        3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                        4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                        5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
                        getInfo() method olusturun:
                       1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                        2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
                        removeInfo() method olusturun:
                        1)Kimlik numarasini girerek data silin.
                        2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                        3)Collection bos ise kullaniciya hata mesaji verin.
                        selectOption() method olusturun:
                        1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
                  */
    public static void main(String[] args) {
        selectOption();
    }

    private static void selectOption() {
        System.out.println("yapmak istediðiniz iþemi giriniz :\n0:iþlemi sonlandýr\n" +
                "1:kullanýcý ekle\n2:kullanýcý bilgisi alma\n3:kullanýcý silme");
        int secim = sc.nextInt();//nextLine hata verir.çünkü bir üst satýr println deðil print olduðu için tum satýrý alýr.
        switch (secim) {
            case 0:
                cikis();
                break;
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
            default:
                System.out.println("yanlýþ giriþ yaptýnýz. Tekrar deneyiniz");
                selectOption();
                break;
        }
    }

    private static void cikis() {
        System.out.println("çýkýþ iþleminiz yapýldý. haydi selametle....");
    }

    private static void removeInfo() {
        System.out.print("silinecek tc yi giriniz :");
        String silinecekTc = sc.next();//nextLine hata verir.çünkü bir üst satýr println deðil print olduðu için tum satýrý alýr.
        if (person.containsKey(silinecekTc)) {//1. adým
            person.remove(silinecekTc);
            System.out.println("girilen tc gayet baþarýlý silindi" + person);//silinecekTc nin tüm bilgilerini person map'inden getirdik.(map.get(key);tüm deðerleri value getirir.)
        } else if (person.isEmpty()) {//3. adým
            System.out.println("listeye eleman girilmemiþtir.liste boþtur mal mal iþ yapma boþ listeden tyc mi silinir.");
        } else {
            System.out.println("aradýðýnýz tc sahip þahýs yoktur.\n tekrar deneyin");//2. adým
            removeInfo();
        }//kullanýcý, silinenTc ye sahip þahýs olmadýðý  için tekrar tc giriþi için
        selectOption();
    }

    private static void getInfo() {
        System.out.print("aradýðýnýz tc yi giriniz :");
        String arananTc = sc.next();//nextLine hata verir.çünkü bir üst satýr println deðil print olduðu için tum satýrý alýr.
        if (person.containsKey(arananTc)) {
            System.out.println(person.get(arananTc));//aranaTc nin tüm bilgilerini person mmap'inden getirdik.(map.get(key);tüm deðerleri value getirir.)
        } else System.out.println("aradýðýnýz tc sahip þahýs yoktur.\n tekrar deneyin");
        // getInfo();}//kullanýcý, arananTc ye sahip þahýs olmadýðý  için tekrar tc giriþi için //kullanýcý var olan tc girdiði için tekrar tc giriþi için saveInfo() metoda geri gönderdik. metoda geri gönderdik.
        selectOption();
    }

    private static void saveInfo() {
        System.out.print("4 haneli tc nizi girin : ");
        String tc = sc.next();//nextLine hata verir.çünkü bir üst satýr println deðil print olduðu için tum satýrý alýr.
        sc.nextLine();//arda arda scan.nextline çalýþýnca hata vermemesi için boþ bir sc.nextLine(); atadýk .
        if (person.containsKey(tc)) {
            System.out.println("var bir tc girdiniz yeniden deneyiniz...");
            saveInfo();//kullanýcý var olan tc girdiði için tekrar tc giriþi için saveInfo() metoda geri gönderdik.
        } else {
            System.out.print("adýnýzý giriniz: ");
            String name = sc.nextLine();
            System.out.print("soyadýnýzý giriniz: ");
            String surName = sc.nextLine();
            System.out.print("adres giriniz: ");
            String adress = sc.nextLine();
            System.out.print("tel  giriniz: ");
            String phone = sc.nextLine();
            String values = name + " " + surName + " " + adress + " " + phone;//tc haric verileri bir stringe atadýk
            person.put(tc, values);//person map'ine tc key olarak diðer bilgiler (name surname...) value olarak eklendi.
            System.out.println("verilerinizi doðru þekilde girdiniz tebrikler verileriniz kaydedildi. verileriniz : " + person);
            System.out.println("     *****    ");
            selectOption();
        }
    }
}