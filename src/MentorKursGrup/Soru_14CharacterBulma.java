package MentorKursGrup;

import java.util.Scanner;

public class Soru_14CharacterBulma {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		// Di�er durumlarda ekrana �Harf de�il� yazd�r�n.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Karakter giriniz :");
		char character=scan.next().toLowerCase().charAt(0);
		
	
		
		
		if(character>='a' && character<='z') {
			
			System.out.println("girlen karakter : "+character+" "+ " harftir"  );
//			Karakter giriniz :
//				r
//				girlen karakter : r  harftir 
			
		}else {
			
			System.out.println("girilen karakter harf de�ildir");
//			Karakter giriniz :
//				5
//				girilen karakter harf de�ildir
		}
		

	}

}
