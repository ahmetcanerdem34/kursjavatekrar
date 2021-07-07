package MentorBizimArrayArrays;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	
		 /*
        Bir sayinin mükemmel olup olmadiðini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("sayý giriniz");
		int sayi=scan.nextInt();
		
		boolean varMi = kontrolet(sayi);
		
		
	}

	public static boolean kontrolet(int sayi) {
	int bolenToplam=0;
	boolean varMi=false;
		for (int i = 1; i < sayi; i++) {
			
			if(sayi%i==0) {
				bolenToplam+=i;
			}
			
		}
		if(bolenToplam==sayi) {
			
			System.out.println("mükemmeldir");
			varMi=true;
			
		}else {
			System.out.println("deðildir");
		}
		return varMi;
		
	}

}
