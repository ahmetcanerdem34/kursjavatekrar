package DAY_09_turnary;

import java.util.Scanner;

public class C4_NestedTurnary {

	public static void main(String[] args) {
	
				//Kullan�c�dan dikdortgenin uzunlu�unu ve geni�li�iini al�n 
				//girilen degerlere g�re kare mi dikd�rtgen mi yaz�d�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.print("kenar uzunlu�u giriniz :");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		
		System.out.println(kenar1==kenar2 ? "kare" : "dikd�rtgen");
		
//		kenar uzunlu�u giriniz :23
//		23
//		kare
		
		
		System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "dikd�rtgen" : "ge�ersiz kenar uzunlu�u");
		//ge�ersiz kenar uzunlu�u
		
		
		scan.close();
	}

}
