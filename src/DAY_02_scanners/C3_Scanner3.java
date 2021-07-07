package DAY_02_scanners;

import java.util.Scanner;

public class C3_Scanner3 {
	
	public static void main(String[] args) {
		
		//kullanýcýdan ismini ve soyismini alýp aralarýnda boþluk býrakarak isim soyisim yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lütfen isminizi ve soyisminiz  giriniz :");
		String isim=scan.nextLine();
		String soyÝsim=scan.nextLine();
		
		System.out.println("Ýsim ve Soyisminiz :"+isim+" "+soyÝsim);
		
//		lütfen isminizi ve soyisminiz  giriniz :Ahmet Can
//		Temur
//		Ýsim ve Soyisminiz :Ahmet Can Temur
//		
		
		scan.close();
		
	}

}
