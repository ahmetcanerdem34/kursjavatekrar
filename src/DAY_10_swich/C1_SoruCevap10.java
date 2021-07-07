package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap10 {

	public static void main(String[] args) {
		
		
	       //Ternary Operator (If Else If) (Nested Ternary)
		
			//Kullanicidan bir sayi aliniz
			//Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
			//10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
			//Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pozi sayı giriniz :");
		int sayi = scan.nextInt();
		
		String sonuc=(sayi>=0 ? sayi<10 ? "rakam" : "Pozitif Sayi" : "negatif sayı");
		
		System.out.println(sonuc);
	scan.close();
	}

}
