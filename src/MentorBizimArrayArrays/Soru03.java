package MentorBizimArrayArrays;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	
		 /*
        Bir sayinin m�kemmel olup olmadi�ini bulan bir program yaziniz.
        M�kemmel sayi : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi m�kemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M�kemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("say� giriniz");
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
			
			System.out.println("m�kemmeldir");
			varMi=true;
			
		}else {
			System.out.println("de�ildir");
		}
		return varMi;
		
	}

}
