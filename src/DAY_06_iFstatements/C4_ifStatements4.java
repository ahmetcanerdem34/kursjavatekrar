package DAY_06_iFstatements;

import java.util.Scanner;

public class C4_ifStatements4 {

	public static void main(String[] args) {
		
		
		//soru: kullan�c�dan bir dikd�rtgenin 2 kenar uzunlu�unu al�n
		//kena r uzunluklar�u e�itse kare de�ilse dikd�rtgen yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" 2 kenar uzunlu�u giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
	
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			
			System.out.println("girilen kenar uzunluklar� e�it oldu�u i�in �ekil karedir..");
//			2 kenar uzunlu�u giriniz :
//				4.5
//				4.5
//				girilen kenar uzunluklar� e�it oldu�u i�in �ekil karedir..
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			
			System.out.println("girilen kenar uzunluklar� e�it olmad���ndan, bu �ekil dikd�rtgendir..");
			
//			 2 kenar uzunlu�u giriniz :
//				 45
//				 34
//				 girilen kenar uzunluklar� e�it olmad���ndan, bu �ekil dikd�rtgendir..
			
		}
		if(kenar1<0 && kenar2<0) {
			
			System.out.println("kenar uzunluklar� 0 dan b�y�k olmal�d�r");
			
//			 2 kenar uzunlu�u giriniz :
//				 -5
//				 -7
//				 kenar uzunluklar� 0 dan b�y�k olmal�d�r
			
			
			scan.close();
		}
		
	}
	
	
	

}
