package DAY_09_turnary;

import java.util.Scanner;

public class C2_Turnary2 {

	public static void main(String[] args) {
		
		//soru 2: kullanýcýdan bir tamsayý alýn
		//tek mi çift mi olduðunu yazdýrýn
				
		
		Scanner scan =new Scanner (System.in);
		System.out.print("sayý giriniz :");
		int sayi=scan.nextInt();
		
		String sonuc=sayi%2==0 ? "sayý çift" : "sayý tek";
		
		System.out.println(sonuc);
		
//		sayý giriniz :36
//		sayý çift
		
		
		////girilen sayýnýn mutlak deðerini bulunuz
		
		int mutlakDeger=Math.abs(sayi);
		
		System.out.println(mutlakDeger);//6
		System.out.println("sayýnýn  mutlak deðeri : "+(sayi>0? sayi : -sayi));//6
		
//		sayý giriniz :-8
//		sayý çift
//		8
//		sayýnýn  mutlak deðeri : 8
		
		scan.close();
	}

}
