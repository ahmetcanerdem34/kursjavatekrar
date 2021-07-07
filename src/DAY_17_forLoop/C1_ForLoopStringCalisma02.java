package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopStringCalisma02 {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin deðilse
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		

		Scanner scan=new Scanner (System.in);
		System.out.print("tamsayý griniz :");
		int sayi=scan.nextInt();
		System.out.println("sinýr deðeri giriniz");
		int sinir=scan.nextInt();
		
	scan.close();	
		if(sayi<=0) {
			
			System.out.println("pozi bir sayý giriniz");
			
		}else if(rakamlarToplami(sayi)>sinir) {
			
			System.out.println("\"girdiðiniz sayýnýn rakamalr toplamý gidrgiðiniz sýnýr deðerinden buyuk\"");
		}else {
			System.out.println("küçük");
//			tamsayý griniz :234
//			sinýr deðeri giriniz
//			10
//			küçük
		}
		

	}

	public static int rakamlarToplami(int sayi) {//34567
		int rakamlarToplami=0;
		String sayi2=sayi+"";
		
		for (int i = 0; i < sayi2.length(); i++) {
			
			rakamlarToplami=rakamlarToplami+sayi%10;
			sayi/=10;
			
		}
		return rakamlarToplami;
		
		
	}

}
