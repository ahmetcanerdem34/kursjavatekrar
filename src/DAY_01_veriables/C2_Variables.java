package DAY_01_veriables;

import java.util.Scanner;

public class C2_Variables {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Adýnýzý\nSoyadýnýzý\ntelnonuzu\nve yaþýnýzý giriniz :");
		String ad=scan.next();
		String soyAd=scan.next();
		String telNo=scan.next();		
		int yas=scan.nextInt();
		
		
		System.out.println(ad + " "+ soyAd+" "+telNo+" "+yas);
//		Adýnýzý
//		Soyadýnýzý
//		telnonuzu
//		ve yaþýnýzý giriniz :
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
		//dikdörtgen,in alanýný bulalým
		
		double uzunluk =34.67;
		double genislik=50.5;
		
		double alani=uzunluk*genislik;
		
		System.out.println("dikdörtgenin alaný :" + alani);
//		dikdörtgenin alaný :1750.835
		
		


	}
	
	
}
