package DAY_07_iFstatement;

import java.util.Scanner;

public class C4_�fElse4 {

	public static void main(String[] args) {
		
		
				//soru: kullan�c�dan 100 �zerinde notunu isteyin 
				//notu harf sistemine �evirip yazd�r�n
				//50 den k���kse D, 50-60 aras� C, 60-80 aras�  B, 80 ve �zeri A
		

		Scanner scan = new Scanner (System.in);
		System.out.print("100 �zerinden notunuzu giriniz :");
		double not=scan.nextDouble();
		
		
		
		if(not<0 || not>100) {
			
			System.out.println("l�tfen ge�erli not giriniz");
			
			
		}else if(not<60) {
			System.out.println("D");
			
			
		}else if(not<80) {
			System.out.println("B");
			
		}else {
			System.out.println("A");
			
//			100 �zerinden notunuzu giriniz :76
//			B
			
//			100 �zerinden notunuzu giriniz :101
//			l�tfen ge�erli not giriniz
			
//			100 �zerinden notunuzu giriniz :56
//			D

scan.close();
		}
		
	}

}
