package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap04 {

	public static void main(String[] args) {
	
		
		  // Girilen bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z


		Scanner scan = new Scanner(System.in);
		System.out.println("ay numaras� giriniz :");
		int ayNumarasi = scan.nextInt();
		
		if(ayNumarasi>0 && ayNumarasi <=12) {
			
			
			switch (ayNumarasi) {
			
			
			case  1 : System.out.println(1+ ". ay ocak 31 g�n �eker ");break;
			case  2 : System.out.println(2+ ". ay �ubat 28 g�n �eker ");break;
			case  3 : System.out.println(3+ ". ay mart 31 g�n �eker ");break;
			
			
			
			
			
			}
			
			
			
		}
		
	}

}
