package MentorKursGrup;

import java.util.Scanner;

public class Soru_08SesliHarfBulma {

	public static void main(String[] args) {
	
		// Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		// �b, c, d, e� den biri ise ekrana �Sessiz harf� yazd�r�n.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz :");
		char harf=scan.next().toLowerCase().charAt(0);
		
		
		
		if(harf=='a' || harf=='e' || harf=='i' || harf=='0' || harf=='u') {
			
			System.out.println("�Sesli harf�");
			
		}else if(harf=='b' || harf=='c' || harf=='d') {
			
			System.out.println("Seessiz harfler");
			
			
		}else {
			
			System.out.println("�STENEN HARFLER DI�INDA HARF G�RD�N�Z");
//			harf giriniz :
//				A
//				�Sesli harf�
//			harf giriniz :
//				F
//				�STENEN HARFLER DI�INDA HARF G�RD�N�Z
		}
		

	}

}
