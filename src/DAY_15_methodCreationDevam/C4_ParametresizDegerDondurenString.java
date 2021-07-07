package DAY_15_methodCreationDevam;

import java.util.Scanner;

public class C4_ParametresizDegerDondurenString {

	public static void main(String[] args) {
	
		String gelen = adSoyadAl();
		
		System.out.println("HOÞGELDÝN :" + gelen);
//		Adýnýzý giriniz :müslüm
//		Soyadýnýzý giriniz :gürses
//		HOÞGELDÝN :müslüm gürses
		

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
	
	return ad +" "+soyad;
	
	
}
	
	
}