package MentorKursGrup;

import java.util.Scanner;

public class Soru_34StringiBastanSonaBuyukYaz {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
		// biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lng�� harf de�eri giriniz:");
		char ilk=scan.next().toUpperCase().charAt(0);
		System.out.println("biti� harf de�eri giriniz:");
		char son=scan.next().toUpperCase().charAt(0);
		
		String yeni="";
		for (char i = ilk; i <=son; i++) {
			
			yeni+=i;
			System.out.print(i+",");
//			    ba�lng�� harf de�eri giriniz:
//				a
//				biti� harf de�eri giriniz:
//				k
//				A,B,C,D,E,F,G,H,I,J,K,
			
		}
		
	}

}
