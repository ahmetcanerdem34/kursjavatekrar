package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma04 {

	public static void main(String[] args) {

		// Soru 4) Kullanicidan 100�den kucuk bir tamsayi isteyin. 1�den baslayarak
		// girilen
		// sayiya kadar 3�un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.print("100 den k���k bir tamsay� girniz :");
		int sayi = scan.nextInt();

		if (sayi > 100 || sayi<=0) {
			System.out.println("100 dn k���k 0 dan buyuk say� giriniz :");
		} else if (sayi < 100) {

			for (int i = 1; i <sayi; i++) {
				
				if(i%3==0) {
					System.out.print(i+" ");
//					100 den k���k bir tamsay� girniz :60
//					3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 
					
					scan.close();
				}
				
			}
		}

	}
}