package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap06 {

	public static void main(String[] args) {
		
		   //  Girilen 3 basamakl� bir say�y� yaz� ile yazd�r�n�z
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("say� giriniz :");
		int sayi = scan.nextInt();
		
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler =sayi/100;
		
		switch (birler) {
		
		case 0 :System.out.println("s�f�r");
		
		//bu �ekilde dokuz basamak yazd�r�lmal� ve onlar yuzler i�inde ayn�s� yap�lmal�
		
		}

		switch (onlar) {
		
		case 0 :System.out.println("s�f�r");

	}

		switch (yuzler) {
		
		case 0 :System.out.println("s�f�r");

}
	}
}

