package MentorKursGrup;

import java.util.Scanner;

public class Soru_12E�kenarBulam {

	public static void main(String[] args) {

		// Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u
		// birbirine e�it ise ekrana
		// �E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kenar uzunlu�u giriniz giriniz :");
		int kenar1 = scan.nextInt();
		System.out.println("Kenar uzunlu�u giriniz giriniz :");
		int kenar2 = scan.nextInt();
		System.out.println("Kenar uzunlu�u giriniz giriniz :");
		int kenar3 = scan.nextInt();

		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {

			if (kenar1 == kenar2 && kenar1 == kenar3) {

				System.out.println("E�kenar ��gen dir");
//				Kenar uzunlu�u giriniz giriniz :
//					5
//					Kenar uzunlu�u giriniz giriniz :
//					5
//					Kenar uzunlu�u giriniz giriniz :
//					5
//					E�kenar ��gen dir

			} else {

				System.out.println("E�kenar ��gen de�ildir");
//				Kenar uzunlu�u giriniz giriniz :
//					5
//					Kenar uzunlu�u giriniz giriniz :
//					4
//					Kenar uzunlu�u giriniz giriniz :
//					6
//					E�kenar ��gen de�ildir

			}

		} else if (kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {

			System.out.println("Kenar uzunluklar� s�f�r ve negatif olamaz");
//			Kenar uzunlu�u giriniz giriniz :
//				-5
//				Kenar uzunlu�u giriniz giriniz :
//				4
//				Kenar uzunlu�u giriniz giriniz :
//				3
//				Kenar uzunluklar� s�f�r ve negatif olamaz

		}
	}

}
