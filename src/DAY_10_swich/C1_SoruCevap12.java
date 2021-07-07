package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap12 {

	public static void main(String[] args) {
		
		
		/*
		Kullanicidan bir sayi aliniz
		Sayi cift ise 10 bolunup bolunmedigini kontrol ediniz
		Sayi 10 a bolunuyorsa "Wooow 10" yazdiriniz, 10 a bolunmuyorsa "Yazik 10" yazdiriniz
		Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz
		Sayi 5 e bolunuyorsa "Wooow 5" yazdiriniz, 5 e bolunmuyorsa "Yazik 5" yazdiriniz
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pozi sayý giriniz :");
		int sayi = scan.nextInt();
		
		
		if(sayi%2==0) {
			
			if(sayi%10==0) {
				System.out.println("wow");
			}else{
				System.out.println("yazýk sana");
		}
	}else if(sayi%2==1) {
		
		if(sayi%5==0) {
			System.out.println("WOW 5");
		}else {
			System.out.println("yazýk bize 5");
		}
		
		scan.close();
	}

	}

}
