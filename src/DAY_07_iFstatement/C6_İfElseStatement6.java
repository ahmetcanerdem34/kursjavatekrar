package DAY_07_iFstatement;

import java.util.Scanner;

public class C6_�fElseStatement6 {

	public static void main(String[] args) {
	
				//soru: kullan�c�dan gun ismini yazma�sn� isteyizniz
				//girilen isim ge�erli ise 
				//gun isimlerinin 1. 2. 3. harflerini ilk harf buyuk di�er ikisi kucuk olarak yazd�r�n
				//gun ismi ge�erli de�il se gecerli gun smi giriniz
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("g�n ismi giriniz :");
		String gun=scan.nextLine().toLowerCase();
		
		if(gun.equals("pazartesi") || gun.equals("pazar")) {
			
			System.out.println("Paz");
			
		}else if(gun.equals("sal�")) {
			
			System.out.println("Sal");
			
		}else if(gun.equals("�ar�amba")) {
			
			System.out.println("�ar");
		}else if (gun.equals("per�embe")) {
			
			System.out.println("Per");
		}else if(gun.equals("cuma")) {
			System.out.println("Cum");
			
		}else if(gun.equals("cumartesi")) {
			
			System.out.println("Cum");
		}else {
			System.out.println("ge�erli g�n giriniz...");
//			
//			g�n ismi giriniz :cumartesi
//			Cum
			
//			g�n ismi giriniz :�ar�amba
//			�ar
			
//			g�n ismi giriniz :hersan
//			ge�erli g�n giriniz...
scan.close();
		}
				

	}

}
