package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma02 {

	public static void main(String[] args) {
	
		 /*  Problem Tanýmý
        100'den 0'a kadar 13'e tam bölünebilen sayýlarý ekrana yazdýrýnýz (büyükten küçüðe).
        */
		int sayi=100;
		
		for (int i = 100; i>=0; i--) {
			
			if(i%13==0) {
				System.out.print( i+" ");
				
				//91 78 65 52 39 26 13 0 
			}
			
		}

	}

}
