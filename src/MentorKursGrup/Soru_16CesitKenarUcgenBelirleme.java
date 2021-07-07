package MentorKursGrup;

import java.util.Scanner;

public class Soru_16CesitKenarUcgenBelirleme {

	public static void main(String[] args) {

		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu
		// birbirine eþit ise ekrana
		// “Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana
		// “Ikizkenar üçgen”
		// yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen
		// yazdýrýn”

		for (int i = 0; i < 4; i++) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Kenar uzunluðu giriniz :");
			int kenar1 = scan.nextInt();
			System.out.println("Kenar uzunluðu giriniz :");
			int kenar2 = scan.nextInt();
			System.out.println("Kenar uzunluðu giriniz :");
			int kenar3 = scan.nextInt();

			if (kenar1 >0 && kenar2 >0 && kenar3 >0) {

				if (kenar1 == kenar2 && kenar1 == kenar3) {

					System.out.println("Eþkenar üçgen");

				} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {

					System.out.println("ikiz kenar üçgen");

				} else {

					System.out.println("Çeþit kenar üçgen");

				}
			} else {
				System.out.println("kenar uzunlugu 0 ve negatif olamaz");
				
//				Kenar uzunluðu giriniz :
//					5
//					Kenar uzunluðu giriniz :
//					5
//					Kenar uzunluðu giriniz :
//					4
//					ikiz kenar üçgen
//					Kenar uzunluðu giriniz :
//					5
//					Kenar uzunluðu giriniz :
//					5
//					Kenar uzunluðu giriniz :
//					5
//					Eþkenar üçgen
//					Kenar uzunluðu giriniz :
//					5
//					Kenar uzunluðu giriniz :
//					4
//					Kenar uzunluðu giriniz :
//					3
//					Çeþit kenar üçgen
//					Kenar uzunluðu giriniz :
//					0
//					Kenar uzunluðu giriniz :
//					9
//					Kenar uzunluðu giriniz :
//					7
//					kenar uzunlugu 0 ve negatif olamaz
			}
		}
	}

}
