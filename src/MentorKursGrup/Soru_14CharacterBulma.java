package MentorKursGrup;

import java.util.Scanner;

public class Soru_14CharacterBulma {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		// Diğer durumlarda ekrana “Harf değil” yazdırın.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Karakter giriniz :");
		char character=scan.next().toLowerCase().charAt(0);
		
	
		
		
		if(character>='a' && character<='z') {
			
			System.out.println("girlen karakter : "+character+" "+ " harftir"  );
//			Karakter giriniz :
//				r
//				girlen karakter : r  harftir 
			
		}else {
			
			System.out.println("girilen karakter harf değildir");
//			Karakter giriniz :
//				5
//				girilen karakter harf değildir
		}
		

	}

}
