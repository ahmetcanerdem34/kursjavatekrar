package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		
			//while loop ta önce þarta bakýyorduk saðlanýyorsa tekrar tekrar çalýþýyordu
		
				//do while ise önce kodu çalýþtýrýyoruz sonra þarta bakýyoruz
				//fasydasý ne= 

				Scanner scan= new Scanner (System.in);
		
		int sayi=0;//niye burda oluþturduðumuzu sonrak i ders te açýklayacað
		
		do {
			
			System.out.print("bir sayý giriniz :");
			sayi=scan.nextInt();
			
			
			
		} while (sayi<=0);
		
		System.out.println("afferin");
		
//		bir sayý giriniz :-4
//		bir sayý giriniz :-5
//		bir sayý giriniz :-67
//		bir sayý giriniz :-34
//		bir sayý giriniz :5
//		afferin
	}

}
