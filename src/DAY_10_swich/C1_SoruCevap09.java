package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap09 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir pozitif tamsay� girmesini isteyin, o pozitif tamsay� 
		//3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
		// 3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		// �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("pozi say� giriniz :");
		int sayi = scan.nextInt();
		
		if(sayi>99 && sayi < 1000) {
			
			System.out.println("girilen sayi = "+" "+sayi+" "+"�� basamakl�d�r");
	
			}
		else if(sayi<100) {
			 
			 if(sayi%2==0) {
				 System.out.println("3 basamakl� olmayan �ift say��");
			 }else {
				 System.out.println("basamakl� olmayan tek say� yazd�r�n");
			 }
			
		}
		

	}

}
