package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C4_ParametresizDegerDondurenString {

	public static void main(String[] args) {
	
		String gelen = adSoyadAl();
		
		System.out.println("HO�GELD�N :" + gelen);
//		Ad�n�z� giriniz :m�sl�m
//		Soyad�n�z� giriniz :g�rses
//		HO�GELD�N :m�sl�m g�rses
		

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
	
	return ad +" "+soyad;
	
	
}
	
	
}