package MentorKursGrup;

import java.util.Scanner;

public class Soru_22Ay�smineG�reSay�s�n�Bulma {

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
		case "2" : System.out.println("�ubat");break;
		case "3" : System.out.println("Mart"); break;
		case "4" : System.out.println("Nisan");break;
		case "5" : System.out.println("May�s");break;
		case "6" : System.out.println("Haziran");break;
		case "7" : System.out.println("Temmuz");break;
		case "8" : System.out.println("A�ustos");break;
		case "9" : System.out.println("Eyl�l");break;
		case "10" : System.out.println("Ekim"); break;
		case "11" : System.out.println("Kas�m");break;
		case "12": System.out.println("Aral�k");break;
		
		default : System.out.println("yanl�� ay say�s� girdiniz");
		
//		Ay ismi giriniz :
//			1
//			Ocak
//			Ay ismi giriniz :
//			2
//			�ubat
//			Ay ismi giriniz :
//			3
//			Mart
//			Ay ismi giriniz :
//			4
//			Nisan
//			Ay ismi giriniz :
//			5
//			May�s
//			Ay ismi giriniz :
//			6
//			Haziran
//			Ay ismi giriniz :
//			76
//			yanl�� ay say�s� girdiniz
//			Ay ismi giriniz :
//			8
//			A�ustos
//			Ay ismi giriniz :
//			9
//			Eyl�l
//			Ay ismi giriniz :
//			0
//			yanl�� ay say�s� girdiniz
//			Ay ismi giriniz :

		
		}
		}
}
}