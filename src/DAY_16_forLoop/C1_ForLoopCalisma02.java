package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma02 {

	public static void main(String[] args) {
	
		 /*  Problem Tan�m�
        100'den 0'a kadar 13'e tam b�l�nebilen say�lar� ekrana yazd�r�n�z (b�y�kten k����e).
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
