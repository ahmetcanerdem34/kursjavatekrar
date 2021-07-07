package MentorKursGrup;

import java.util.Scanner;

public class Soru_08SesliHarfBulma {

	public static void main(String[] args) {
	
		// Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		// “b, c, d, e” den biri ise ekrana “Sessiz harf” yazdýrýn.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz :");
		char harf=scan.next().toLowerCase().charAt(0);
		
		
		
		if(harf=='a' || harf=='e' || harf=='i' || harf=='0' || harf=='u') {
			
			System.out.println("“Sesli harf”");
			
		}else if(harf=='b' || harf=='c' || harf=='d') {
			
			System.out.println("Seessiz harfler");
			
			
		}else {
			
			System.out.println("ÝSTENEN HARFLER DIÞINDA HARF GÝRDÝNÝZ");
//			harf giriniz :
//				A
//				“Sesli harf”
//			harf giriniz :
//				F
//				ÝSTENEN HARFLER DIÞINDA HARF GÝRDÝNÝZ
		}
		

	}

}
