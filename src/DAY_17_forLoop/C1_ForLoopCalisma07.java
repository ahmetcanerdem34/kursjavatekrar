package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma07 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan pozitif tam say� al�n
		//1 den kullan�c�n�n girdi�i say�ya kadar tum tam say�lar�n toplam�n� yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("say� giriniz :");
		int sayi=scan.nextInt();
		
		int toplam=0;
		for (int i = 1; i < sayi; i++) {
			
			toplam+=i;
			
			
		}
		System.out.print("girilen say�ya kadar olan say�lar�n toplam� :" +toplam);
//		say� giriniz :
//			35
//			girilen say�ya kadar olan say�lar�n toplam� :595
scan.close();
	}

}
