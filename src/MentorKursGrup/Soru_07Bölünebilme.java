package MentorKursGrup;

import java.util.Scanner;

public class Soru_07B�l�nebilme {

	public static void main(String[] args) {
		
				// Kullan�c�dan bir tamsay� al�n e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n.
				// 3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n.

		Scanner scan=new Scanner(System.in);
		System.out.println("Tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi%3==0) {
			
			System.out.println("�3��n kat��");
			
		}else {
			
			System.out.println(" �3��n kat� de�ildir�");
//			Tamsay� giriniz :
//				9
//				�3��n kat��
			
//			Tamsay� giriniz :
//				4
//				 �3��n kat� de�ildir�
		}

	}

}
