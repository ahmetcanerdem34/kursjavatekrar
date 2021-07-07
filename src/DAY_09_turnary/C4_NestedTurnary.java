package DAY_09_turnary;

import java.util.Scanner;

public class C4_NestedTurnary {

	public static void main(String[] args) {
	
				//Kullanýcýdan dikdortgenin uzunluðunu ve geniþliðiini alýn 
				//girilen degerlere göre kare mi dikdörtgen mi yazýdýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.print("kenar uzunluðu giriniz :");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		
		System.out.println(kenar1==kenar2 ? "kare" : "dikdörtgen");
		
//		kenar uzunluðu giriniz :23
//		23
//		kare
		
		
		System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "dikdörtgen" : "geçersiz kenar uzunluðu");
		//geçersiz kenar uzunluðu
		
		
		scan.close();
	}

}
