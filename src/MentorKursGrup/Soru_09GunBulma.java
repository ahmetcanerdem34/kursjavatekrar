package MentorKursGrup;

import java.util.Scanner;

public class Soru_09GunBulma {

	public static void main(String[] args) {
		
		
			// Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
			// �Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. �Pazar� ise ekrana
			// �H�ristiyanlar icin kutsal g�n� yazd�r�n
			
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz :");
		String gun= scan.next().toUpperCase();
		
		switch (gun) {
		
		case "CUMA" : System.out.println("�M�sl�manlar icin kutsal g�n�");break;
		
		case "CUMARTES�" :System.out.println("�Yahudiler icin kutsal g�n�");break;
		
		case "PAZAR" : System.out.println("�H�ristiyanlar icin kutsal g�n� ");break;
		
		default : System.out.println("yanl�� g�n girdiniz");
		
//		harf giriniz :
//			cuma
//			�M�sl�manlar icin kutsal g�n�
//		harf giriniz :
//			sal�
//			yanl�� g�n girdiniz
		}

	}

}
