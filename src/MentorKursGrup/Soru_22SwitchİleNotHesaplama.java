package MentorKursGrup;

import java.util.Scanner;

public class Soru_22Switch�leNotHesaplama {

	public static void main(String[] args) {
		
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 aras� - C   3. 60(dahil) ile 80 aras� - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz
		
		for (int i = 0; i < 5; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz :");
		int not= scan.nextInt();
		String sonuc=" ";
		
		
		if(not>=0 && not<=100) {
			
		if(not>=0 && not<50) {
			sonuc="D";
		}if(not>=50 && not<60) {
			sonuc="C";
		}if(not>=60 && not<80) {
			sonuc="B";
		}if(not>=80) {
			sonuc="A";
		}
		}else {
			System.out.println("not 100 den yukar� 0 dan a�a�� olamaz");
		}
		switch(sonuc) {
		case "D" : System.out.println("D"); break;
		case "B" : System.out.println("B"); break;
		case "C" : System.out.println("C"); break;
		case "A" : System.out.println("A"); break;
		
//		Notunuzu giriniz :
//			45
//			D
//			Notunuzu giriniz :
//			0
//			D
//			Notunuzu giriniz :
//			-13
//			not 100 den yukar� 0 dan a�a�� olamaz
//			Notunuzu giriniz :
//			110
//			not 100 den yukar� 0 dan a�a�� olamaz
//			Notunuzu giriniz :
//			67
//			B
		
		}
		}
	}

}
