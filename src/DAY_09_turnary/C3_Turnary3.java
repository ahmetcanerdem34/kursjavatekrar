package DAY_09_turnary;

import java.util.Scanner;

public class C3_Turnary3 {

	public static void main(String[] args) {
		//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		//sayinin karesini yazdirin
		
		Scanner scan =new Scanner (System.in);
		System.out.print("sayı giriniz :");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>0 ? "sayı pozitif" : "sayı negatif");
		
//		sayı giriniz :11
//		sayı pozitif
		
		System.out.println(sayi>=100 && sayi<=999? "üç basamaklı" : "üç basamaklı değil");
		
//		sayı giriniz :111
//		sayı pozitif
//		üç basamaklı
		
		scan.close();

	}

}
