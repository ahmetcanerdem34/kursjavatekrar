package DAY_07_iFstatement;

import java.util.Scanner;

public class C6_ÝfElseStatement6 {

	public static void main(String[] args) {
	
				//soru: kullanýcýdan gun ismini yazmaýsný isteyizniz
				//girilen isim geçerli ise 
				//gun isimlerinin 1. 2. 3. harflerini ilk harf buyuk diðer ikisi kucuk olarak yazdýrýn
				//gun ismi geçerli deðil se gecerli gun smi giriniz
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("gün ismi giriniz :");
		String gun=scan.nextLine().toLowerCase();
		
		if(gun.equals("pazartesi") || gun.equals("pazar")) {
			
			System.out.println("Paz");
			
		}else if(gun.equals("salý")) {
			
			System.out.println("Sal");
			
		}else if(gun.equals("çarþamba")) {
			
			System.out.println("Çar");
		}else if (gun.equals("perþembe")) {
			
			System.out.println("Per");
		}else if(gun.equals("cuma")) {
			System.out.println("Cum");
			
		}else if(gun.equals("cumartesi")) {
			
			System.out.println("Cum");
		}else {
			System.out.println("geçerli gün giriniz...");
//			
//			gün ismi giriniz :cumartesi
//			Cum
			
//			gün ismi giriniz :çarþamba
//			Çar
			
//			gün ismi giriniz :hersan
//			geçerli gün giriniz...
scan.close();
		}
				

	}

}
