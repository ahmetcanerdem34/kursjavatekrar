package MentorKursGrup;

import java.util.Scanner;

public class Soru_17NotHarfDurumuBelirleme {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn.
		// 1. 50 den az - D 2. 50(dahil) ile 60 arasý - C 3. 60(dahil) ile 80 arasý - B. 4. 80(dahil) ustu- A

		
		
		for (int i = 0; i < 5; i++) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Notunuzu giriniz :");
			int not = scan.nextInt();
		
		if(not>=0 && not<=100) {
			
			if(not<50) {
				System.out.println("D");
				
			}else if(not>=50 && not<=60) {
				System.out.println("C");
			
			}else if(not>60 && not<=80) {
				System.out.println("B");
			
			}else if(not>80 && not<=100) {
				System.out.println("A");
			
			}
		
		}else {
			System.out.println("Yanlýþ not girdiniz");
			
//			Notunuzu giriniz :
//				0
//				D
//				Notunuzu giriniz :
//				-4
//				Yanlýþ not girdiniz
//				Notunuzu giriniz :
//				6
//				D
//				Notunuzu giriniz :
//				70
//				B
//				Notunuzu giriniz :
//				91
//				A
		}
	}
	}
}
