package MentorKursGrup;

import java.util.Scanner;

public class Soru_01KareninKenarUzun {

	public static void main(String[] args) {
		

		// Kullan�c�dan karenin kenar uzunlu�unu isteyin ve sonra bu karenin alan ve
				// �evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
				// karenin alani a*a...cevresi 4a;
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kenar uzunlu�u girinz :");
		int uzunluk=scan.nextInt();
		int alan=uzunluk*uzunluk;
		int �evresi=uzunluk*4;
		
		
		if(uzunluk<=0) {
			
			System.out.println("karenin uzunlu�u 0 a e�it ve k���k olamaz");
		}else {
			
			System.out.println("Karenin alan� :"+alan);
			System.out.println("karenin �evresi :"+�evresi);
		}
		
				

	}

}
