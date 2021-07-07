package MentorKursGrup;

import java.util.Scanner;

public class Soru_20Switch›leKodBulma {

	public static void main(String[] args) {
	
		
		// A harfini bulunca ilk harf , B harfini bulunca ikinci harf, C harfini bulunca
		// ucuncu harf, D harfini bulunca dorduncu harf yazdiran kodu switch 
		// kullanarak yazdirin.

		for (int i = 0; i < 5 ; i++) {
			
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Harf giriniz :");
		char harf = scan.next().toUpperCase().charAt(0);
		
		
		
		switch(harf) {
		
		case 'A' : System.out.println("ilk harf");break;
		
		case 'B' : System.out.println("›kinci harf"); break;
		
		case 'C' : System.out.println("¸Á¸nc¸ harf"); break;
		
		case 'D' : System.out.println("Dˆrd¸nc¸ harf");break;
		
		default : System.out.println("istene harf d˝˛˝nda karakter girdiniz");
		
//		Harf giriniz :
//			a
//			ilk harf
//			Harf giriniz :
//			b
//			›kinci harf
//			Harf giriniz :
//			c
//			¸Á¸nc¸ harf
//			Harf giriniz :
//			d
//			Dˆrd¸nc¸ harf
//			Harf giriniz :
//			6
//			istene harf d˝˛˝nda karakter girdiniz
		}
		
	}

}
}