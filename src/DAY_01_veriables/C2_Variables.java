package DAY_01_veriables;

import java.util.Scanner;

public class C2_Variables {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Ad�n�z�\nSoyad�n�z�\ntelnonuzu\nve ya��n�z� giriniz :");
		String ad=scan.next();
		String soyAd=scan.next();
		String telNo=scan.next();		
		int yas=scan.nextInt();
		
		
		System.out.println(ad + " "+ soyAd+" "+telNo+" "+yas);
//		Ad�n�z�
//		Soyad�n�z�
//		telnonuzu
//		ve ya��n�z� giriniz :
//		Mehmet
//		Bulut
//		+858688666
//		57
//		Mehmet Bulut +858688666 57
		
		
		
		
		System.out.println("********************************************************");
		
		int age=34;
		String isim="Mehmet";
		String surName="Bulut";
		char harf='M';
		double num=24.50;
		
		System.out.println(age+" "+isim+" "+surName+" "+harf+" "+num);
//		34 Mehmet Bulut M 24.5
		
		System.out.println("*********************************************************");
		//dikd�rtgen,in alan�n� bulal�m
		
		double uzunluk =34.67;
		double genislik=50.5;
		
		double alani=uzunluk*genislik;
		
		System.out.println("dikd�rtgenin alan� :" + alani);
//		dikd�rtgenin alan� :1750.835
		
		


	}
	
	
}
