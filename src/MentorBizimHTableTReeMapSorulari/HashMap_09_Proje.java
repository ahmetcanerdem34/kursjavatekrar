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
        System.out.println("yapmak istedi�iniz i�emi giriniz :\n0:i�lemi sonland�r\n" +
                "1:kullan�c� ekle\n2:kullan�c� bilgisi alma\n3:kullan�c� silme");
        int secim = sc.nextInt();//nextLine hata verir.��nk� bir �st sat�r println de�il print oldu�u i�in tum sat�r� al�r.
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
                System.out.println("yanl�� giri� yapt�n�z. Tekrar deneyiniz");
                selectOption();
                break;
        }
    }

    private static void cikis() {
        System.out.println("��k�� i�leminiz yap�ld�. haydi selametle....");
    }

    private static void removeInfo() {
        System.out.print("silinecek tc yi giriniz :");
        String silinecekTc = sc.next();//nextLine hata verir.��nk� bir �st sat�r println de�il print oldu�u i�in tum sat�r� al�r.
        if (person.containsKey(silinecekTc)) {//1. ad�m
            person.remove(silinecekTc);
            System.out.println("girilen tc gayet ba�ar�l� silindi" + person);//silinecekTc nin t�m bilgilerini person map'inden getirdik.(map.get(key);t�m de�erleri value getirir.)
        } else if (person.isEmpty()) {//3. ad�m
            System.out.println("listeye eleman girilmemi�tir.liste bo�tur mal mal i� yapma bo� listeden tyc mi silinir.");
        } else {
            System.out.println("arad���n�z tc sahip �ah�s yoktur.\n tekrar deneyin");//2. ad�m
            removeInfo();
        }//kullan�c�, silinenTc ye sahip �ah�s olmad���  i�in tekrar tc giri�i i�in
        selectOption();
    }

    private static void getInfo() {
        System.out.print("arad���n�z tc yi giriniz :");
        String arananTc = sc.next();//nextLine hata verir.��nk� bir �st sat�r println de�il print oldu�u i�in tum sat�r� al�r.
        if (person.containsKey(arananTc)) {
            System.out.println(person.get(arananTc));//aranaTc nin t�m bilgilerini person mmap'inden getirdik.(map.get(key);t�m de�erleri value getirir.)
        } else System.out.println("arad���n�z tc sahip �ah�s yoktur.\n tekrar deneyin");
        // getInfo();}//kullan�c�, arananTc ye sahip �ah�s olmad���  i�in tekrar tc giri�i i�in //kullan�c� var olan tc girdi�i i�in tekrar tc giri�i i�in saveInfo() metoda geri g�nderdik. metoda geri g�nderdik.
        selectOption();
    }

    private static void saveInfo() {
        System.out.print("4 haneli tc nizi girin : ");
        String tc = sc.next();//nextLine hata verir.��nk� bir �st sat�r println de�il print oldu�u i�in tum sat�r� al�r.
        sc.nextLine();//arda arda scan.nextline �al���nca hata vermemesi i�in bo� bir sc.nextLine(); atad�k .
        if (person.containsKey(tc)) {
            System.out.println("var bir tc girdiniz yeniden deneyiniz...");
            saveInfo();//kullan�c� var olan tc girdi�i i�in tekrar tc giri�i i�in saveInfo() metoda geri g�nderdik.
        } else {
            System.out.print("ad�n�z� giriniz: ");
            String name = sc.nextLine();
            System.out.print("soyad�n�z� giriniz: ");
            String surName = sc.nextLine();
            System.out.print("adres giriniz: ");
            String adress = sc.nextLine();
            System.out.print("tel  giriniz: ");
            String phone = sc.nextLine();
            String values = name + " " + surName + " " + adress + " " + phone;//tc haric verileri bir stringe atad�k
            person.put(tc, values);//person map'ine tc key olarak di�er bilgiler (name surname...) value olarak eklendi.
            System.out.println("verilerinizi do�ru �ekilde girdiniz tebrikler verileriniz kaydedildi. verileriniz : " + person);
            System.out.println("     *****    ");
            selectOption();
        }
    }
}