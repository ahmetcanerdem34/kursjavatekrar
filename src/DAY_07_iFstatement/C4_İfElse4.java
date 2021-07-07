package DAY_07_iFstatement;

import java.util.Scanner;

public class C4_ÝfElse4 {

	public static void main(String[] args) {
		
		
				//soru: kullanýcýdan 100 üzerinde notunu isteyin 
				//notu harf sistemine çevirip yazdýrýn
				//50 den küçükse D, 50-60 arasý C, 60-80 arasý  B, 80 ve üzeri A
		

		Scanner scan = new Scanner (System.in);
		System.out.print("100 üzerinden notunuzu giriniz :");
		double not=scan.nextDouble();
		
		
		
		if(not<0 || not>100) {
			
			System.out.println("lütfen geçerli not giriniz");
			
			
		}else if(not<60) {
			System.out.println("D");
			
			
		}else if(not<80) {
			System.out.println("B");
			
		}else {
			System.out.println("A");
			
//			100 üzerinden notunuzu giriniz :76
//			B
			
//			100 üzerinden notunuzu giriniz :101
//			lütfen geçerli not giriniz
			
//			100 üzerinden notunuzu giriniz :56
//			D

scan.close();
		}
		
	}

}
