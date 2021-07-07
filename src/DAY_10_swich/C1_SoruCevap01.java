package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap01 {

	public static void main(String[] args) {

		/*
		 * Girilen bir sayýnýn önce 100 den küçük ise, 100 den küçük yazdýrýn devamýnda
		 * 50 den küçük ise 50 den küçük yazdýrýn devamýnda 25 den küçük ise 25 den
		 * küçük yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz :");
		int sayi = scan.nextInt();

		if (sayi>100) {
			System.out.println("100 den küçük sayý giriniz");
			
		}else if(sayi<100) {
			System.out.println("sayý küçüktür 100 den");
			
			if(sayi<50) {
				System.out.println("sayý küçüktür 50 den");
				
				if(sayi<25) {
					System.out.println("sayý küçüktür 25 ten");
					scan.close();
				}
			}
				
			
		}
		}

	}
