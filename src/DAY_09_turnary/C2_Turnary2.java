package DAY_09_turnary;

import java.util.Scanner;

public class C2_Turnary2 {

	public static void main(String[] args) {
		
		//soru 2: kullan�c�dan bir tamsay� al�n
		//tek mi �ift mi oldu�unu yazd�r�n
				
		
		Scanner scan =new Scanner (System.in);
		System.out.print("say� giriniz :");
		int sayi=scan.nextInt();
		
		String sonuc=sayi%2==0 ? "say� �ift" : "say� tek";
		
		System.out.println(sonuc);
		
//		say� giriniz :36
//		say� �ift
		
		
		////girilen say�n�n mutlak de�erini bulunuz
		
		int mutlakDeger=Math.abs(sayi);
		
		System.out.println(mutlakDeger);//6
		System.out.println("say�n�n  mutlak de�eri : "+(sayi>0? sayi : -sayi));//6
		
//		say� giriniz :-8
//		say� �ift
//		8
//		say�n�n  mutlak de�eri : 8
		
		scan.close();
	}

}
