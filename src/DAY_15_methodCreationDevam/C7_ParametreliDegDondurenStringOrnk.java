package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C7_ParametreliDegDondurenStringOrnk {

	public static void main(String[] args) {
		
		
		String a =adSoyadAl();
		
		//String adSoyad;
		yaz(a);
		
//		Adýnýzý giriniz :müslüm
//		Soyadýnýzý giriniz :gürses
//		hoþgeldin :müslüm gürses
		

	}
	
	public static String adSoyadAl() {

		
		Scanner sc=new Scanner (System.in);
		//bu scanner ý sadece bu blokta kullanabilirim
		
		String ad;
		String soyad;
		
		
		System.out.print("Adýnýzý giriniz :");
		
		ad=sc.next();
		System.out.print("Soyadýnýzý giriniz :");
		soyad=sc.next();
		
		sc.close();
		return ad +" "+soyad;
	
		
	}
	
	
	
	public static void yaz(String adSoyad) {
		
		System.out.println("hoþgeldin :" + adSoyad);
		
		
		
		
		
		
		
		
		
		
		
	}
}
