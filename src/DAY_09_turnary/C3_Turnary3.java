package DAY_09_turnary;

import java.util.Scanner;

public class C3_Turnary3 {

	public static void main(String[] args) {
		//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse �Sayi pozitif� yazdirin, negatifse
		//sayinin karesini yazdirin
		
		Scanner scan =new Scanner (System.in);
		System.out.print("say� giriniz :");
		int sayi=scan.nextInt();
		
		System.out.println(sayi>0 ? "say� pozitif" : "say� negatif");
		
//		say� giriniz :11
//		say� pozitif
		
		System.out.println(sayi>=100 && sayi<=999? "�� basamakl�" : "�� basamakl� de�il");
		
//		say� giriniz :111
//		say� pozitif
//		�� basamakl�
		
		scan.close();

	}

}
