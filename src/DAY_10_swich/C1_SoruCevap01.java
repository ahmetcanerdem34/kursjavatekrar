package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap01 {

	public static void main(String[] args) {

		/*
		 * Girilen bir say�n�n �nce 100 den k���k ise, 100 den k���k yazd�r�n devam�nda
		 * 50 den k���k ise 50 den k���k yazd�r�n devam�nda 25 den k���k ise 25 den
		 * k���k yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("say� giriniz :");
		int sayi = scan.nextInt();

		if (sayi>100) {
			System.out.println("100 den k���k say� giriniz");
			
		}else if(sayi<100) {
			System.out.println("say� k���kt�r 100 den");
			
			if(sayi<50) {
				System.out.println("say� k���kt�r 50 den");
				
				if(sayi<25) {
					System.out.println("say� k���kt�r 25 ten");
					scan.close();
				}
			}
				
			
		}
		}

	}
