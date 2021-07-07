package DAY_07_iFstatement;

import java.util.Scanner;

public class C2_ÝfElse2 {

	public static void main(String[] args) {
		
		
		//Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup 
		//olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.print("bir kararkter giriniz :");
		char karakter=scan.next().toLowerCase().charAt(0);
		
		
		if(karakter>='a' && karakter<='z') {
			
			System.out.println("girilen karakter harftir");
		}else {
			
			System.out.println("girilen karakter harf deðildir");
//			bir kararkter giriniz :t
//			girilen karakter harftir
			
//			bir kararkter giriniz :+
//			girilen karakter harf deðildir
		}
		
		//Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, 
		//calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin
		
		System.out.print("YAÞINIZI GÝRÝNÝZ :");
		int yas =scan.nextInt();
		
		
		if(yas>=65) {
			
			System.out.println("emekli olabilirsiniz");
		}else {
			
			System.out.println("emekli olamazsýnýz");
			
//			YAÞINIZI GÝRÝNÝZ :66
//			emekli olabilirsiniz
			
//			YAÞINIZI GÝRÝNÝZ :54
//			emekli olamazsýnýz
			
			scan.close();
		}
		
		
		
		
		
	}
}
