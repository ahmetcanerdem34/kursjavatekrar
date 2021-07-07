package MentorKursGrup;

import java.util.Scanner;

public class Soru_22AyİsmineGöreSayısınıBulma {

	public static void main(String[] args) {
		
		// Kullanici ay ismini girsin
        // Program kacinci ay oldugunu ekrana yazsin
        // Buyuk harf kucuk harf hepsi icin calissin
        // Yanlis ay ismi girerse ekrana "Gecerli ay ismi giriniz" yazsin

		for (int i = 0; i < 13; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismi giriniz :");
		String ay=scan.next();
		
		switch(ay) {
		
		case "1" : System.out.println("Ocak"); break;
		case "2" : System.out.println("Şubat");break;
		case "3" : System.out.println("Mart"); break;
		case "4" : System.out.println("Nisan");break;
		case "5" : System.out.println("Mayıs");break;
		case "6" : System.out.println("Haziran");break;
		case "7" : System.out.println("Temmuz");break;
		case "8" : System.out.println("Ağustos");break;
		case "9" : System.out.println("Eylül");break;
		case "10" : System.out.println("Ekim"); break;
		case "11" : System.out.println("Kasım");break;
		case "12": System.out.println("Aralık");break;
		
		default : System.out.println("yanlış ay sayısı girdiniz");
		
//		Ay ismi giriniz :
//			1
//			Ocak
//			Ay ismi giriniz :
//			2
//			Şubat
//			Ay ismi giriniz :
//			3
//			Mart
//			Ay ismi giriniz :
//			4
//			Nisan
//			Ay ismi giriniz :
//			5
//			Mayıs
//			Ay ismi giriniz :
//			6
//			Haziran
//			Ay ismi giriniz :
//			76
//			yanlış ay sayısı girdiniz
//			Ay ismi giriniz :
//			8
//			Ağustos
//			Ay ismi giriniz :
//			9
//			Eylül
//			Ay ismi giriniz :
//			0
//			yanlış ay sayısı girdiniz
//			Ay ismi giriniz :

		
		}
		}
}
}