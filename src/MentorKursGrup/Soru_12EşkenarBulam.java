package MentorKursGrup;

import java.util.Scanner;

public class Soru_12EþkenarBulam {

	public static void main(String[] args) {

		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu
		// birbirine eþit ise ekrana
		// “Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kenar uzunluðu giriniz giriniz :");
		int kenar1 = scan.nextInt();
		System.out.println("Kenar uzunluðu giriniz giriniz :");
		int kenar2 = scan.nextInt();
		System.out.println("Kenar uzunluðu giriniz giriniz :");
		int kenar3 = scan.nextInt();

		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {

			if (kenar1 == kenar2 && kenar1 == kenar3) {

				System.out.println("Eþkenar üçgen dir");
//				Kenar uzunluðu giriniz giriniz :
//					5
//					Kenar uzunluðu giriniz giriniz :
//					5
//					Kenar uzunluðu giriniz giriniz :
//					5
//					Eþkenar üçgen dir

			} else {

				System.out.println("Eþkenar Üçgen deðildir");
//				Kenar uzunluðu giriniz giriniz :
//					5
//					Kenar uzunluðu giriniz giriniz :
//					4
//					Kenar uzunluðu giriniz giriniz :
//					6
//					Eþkenar Üçgen deðildir

			}

		} else if (kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {

			System.out.println("Kenar uzunluklarý sýfýr ve negatif olamaz");
//			Kenar uzunluðu giriniz giriniz :
//				-5
//				Kenar uzunluðu giriniz giriniz :
//				4
//				Kenar uzunluðu giriniz giriniz :
//				3
//				Kenar uzunluklarý sýfýr ve negatif olamaz

		}
	}

}
