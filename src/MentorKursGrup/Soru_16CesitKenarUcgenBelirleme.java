package MentorKursGrup;

import java.util.Scanner;

public class Soru_16CesitKenarUcgenBelirleme {

	public static void main(String[] args) {

		// Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u
		// birbirine e�it ise ekrana
		// �E�kenar ��gen� yazd�r�n. Sadece iki kenar uzunlu�u birbirine e�it ise ekrana
		// �Ikizkenar ��gen�
		// yazd�r�n. T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen
		// yazd�r�n�

		for (int i = 0; i < 4; i++) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Kenar uzunlu�u giriniz :");
			int kenar1 = scan.nextInt();
			System.out.println("Kenar uzunlu�u giriniz :");
			int kenar2 = scan.nextInt();
			System.out.println("Kenar uzunlu�u giriniz :");
			int kenar3 = scan.nextInt();

			if (kenar1 >0 && kenar2 >0 && kenar3 >0) {

				if (kenar1 == kenar2 && kenar1 == kenar3) {

					System.out.println("E�kenar ��gen");

				} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {

					System.out.println("ikiz kenar ��gen");

				} else {

					System.out.println("�e�it kenar ��gen");

				}
			} else {
				System.out.println("kenar uzunlugu 0 ve negatif olamaz");
				
//				Kenar uzunlu�u giriniz :
//					5
//					Kenar uzunlu�u giriniz :
//					5
//					Kenar uzunlu�u giriniz :
//					4
//					ikiz kenar ��gen
//					Kenar uzunlu�u giriniz :
//					5
//					Kenar uzunlu�u giriniz :
//					5
//					Kenar uzunlu�u giriniz :
//					5
//					E�kenar ��gen
//					Kenar uzunlu�u giriniz :
//					5
//					Kenar uzunlu�u giriniz :
//					4
//					Kenar uzunlu�u giriniz :
//					3
//					�e�it kenar ��gen
//					Kenar uzunlu�u giriniz :
//					0
//					Kenar uzunlu�u giriniz :
//					9
//					Kenar uzunlu�u giriniz :
//					7
//					kenar uzunlugu 0 ve negatif olamaz
			}
		}
	}

}
