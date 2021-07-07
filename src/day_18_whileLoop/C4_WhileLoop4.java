package day_18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop4 {

	public static void main(String[] args) {
		
		/*	
		Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
Kullanicinin hata yapmadigini farz edin.
		
	*/	
		
		Scanner scan =new Scanner (System.in);
		System.out.print("baþlangýç harfi giriniz :");
		char basHarf=scan.next().toUpperCase().charAt(0);
		System.out.print("bitiþ harfi giriniz :");
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		
		for (int i = basHarf; i < args.length; i++) {
			
			System.out.println(i+" ");
			
		}
		
		
		while (basHarf<=sonHarf) {
			
			System.out.println(basHarf+" ");
			basHarf++;
//			D 
//			E 
//			F 
//			G 
//			H 
//			I 
//			J 
			
		}
		

	}

}
