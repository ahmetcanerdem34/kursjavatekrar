package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma09 {

	public static void main(String[] args) {
		
		/*
	     ***********
	      *********
	       *******
	        *****
	         ***
	          *

	     þekli yazdýrýnýz
	     */
		
		
		  for (int satir = 6; satir >=0; satir--) { //baba for
			
			for (int bosluk = 0; bosluk <6-satir; bosluk++) {//cocuk for
				System.out.print(" ");
				
			}
			for (int yildiz = 0; yildiz < 2*satir-1; yildiz++) {//cocuk for
				System.out.print("*");
				
			}
			System.out.println();
		}
//		  
//		  
//		  
//		  
//		  
//		  
//		  
//		  
//		  
//			for (int satir = 6; satir >=0; satir--) { //baba for
//			
//			for (int bosluk = 0; bosluk <6-satir; bosluk++) {//cocuk for
//				System.out.print(" ");
//				
//			}
//			for (int yildiz = 0; yildiz < 2*satir-1; yildiz++) {//cocuk for
//				System.out.println("*");
//				
//			}
//			System.out.println();
//		}
			
		}
			
			
}
		
	


