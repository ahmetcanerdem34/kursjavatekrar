package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C7_ParametreliDegDondurenStringOrnk {

	public static void main(String[] args) {
		
		
		String a =adSoyadAl();
		
		//String adSoyad;
		yaz(a);
		
//		Ad�n�z� giriniz :m�sl�m
//		Soyad�n�z� giriniz :g�rses
//		ho�geldin :m�sl�m g�rses
		

	}
	
	public static String adSoyadAl() {

		
		Scanner sc=new Scanner (System.in);
		//bu scanner � sadece bu blokta kullanabilirim
		
		String ad;
		String soyad;
		
		
		System.out.print("Ad�n�z� giriniz :");
		
		ad=sc.next();
		System.out.print("Soyad�n�z� giriniz :");
		soyad=sc.next();
		
		sc.close();
		return ad +" "+soyad;
	
		
	}
	
	
	
	public static void yaz(String adSoyad) {
		
		System.out.println("ho�geldin :" + adSoyad);
		
		
		
		
		
		
		
		
		
		
		
	}
}
