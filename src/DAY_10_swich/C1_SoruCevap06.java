package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap06 {

	public static void main(String[] args) {
		
		   //  Girilen 3 basamaklý bir sayýyý yazý ile yazdýrýnýz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz :");
		int sayi = scan.nextInt();
		
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler =sayi/100;
		
		switch (birler) {
		
		case 0 :System.out.println("sýfýr");
		
		//bu þekilde dokuz basamak yazdýrýlmalý ve onlar yuzler içinde aynýsý yapýlmalý
		
		}

		switch (onlar) {
		
		case 0 :System.out.println("sýfýr");

	}

		switch (yuzler) {
		
		case 0 :System.out.println("sýfýr");

}
	}
}

