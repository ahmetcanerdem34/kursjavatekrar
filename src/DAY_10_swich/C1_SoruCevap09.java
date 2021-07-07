package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap09 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 
		//3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		// 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		// Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("pozi sayı giriniz :");
		int sayi = scan.nextInt();
		
		if(sayi>99 && sayi < 1000) {
			
			System.out.println("girilen sayi = "+" "+sayi+" "+"üç basamaklıdır");
	
			}
		else if(sayi<100) {
			 
			 if(sayi%2==0) {
				 System.out.println("3 basamaklı olmayan çift sayı”");
			 }else {
				 System.out.println("basamaklı olmayan tek sayı yazdırın");
			 }
			
		}
		

	}

}
