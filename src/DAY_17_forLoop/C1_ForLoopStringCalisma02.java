package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopStringCalisma02 {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin de�ilse
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		

		Scanner scan=new Scanner (System.in);
		System.out.print("tamsay� griniz :");
		int sayi=scan.nextInt();
		System.out.println("sin�r de�eri giriniz");
		int sinir=scan.nextInt();
		
	scan.close();	
		if(sayi<=0) {
			
			System.out.println("pozi bir say� giriniz");
			
		}else if(rakamlarToplami(sayi)>sinir) {
			
			System.out.println("\"girdi�iniz say�n�n rakamalr toplam� gidrgi�iniz s�n�r de�erinden buyuk\"");
		}else {
			System.out.println("k���k");
//			tamsay� griniz :234
//			sin�r de�eri giriniz
//			10
//			k���k
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
