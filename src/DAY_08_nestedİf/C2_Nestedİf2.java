package DAY_08_nested�f;

import java.util.Scanner;

public class C2_Nested�f2 {

	public static void main(String[] args) {
		
		
		
				//verilen yas ve cinsiyet i�in emekli olup olmayaca��n� yaz�n�z
				//soru: e�er �al��an kad�n 60 yas�ndan buyuk oldu�unda emekli olabilir 
				//�la��san erkekse 65 yas�ndan buyukse emekli olabilir
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("ya��n�z� giirniz :");
		int yas=scan.nextInt();
		System.out.print("cinsiyetinizi giriniz :");
		String cinsiyet=scan.next().toLowerCase();
		
		
		if (cinsiyet.equals("kad�n") && yas >= 60) {
			
			System.out.println("emekli olabilirsiniz ..");
			
		}else if(cinsiyet.equals("kad�n") && yas < 60) {

		System.out.println("emekli olamazs�n�z..");		
			
		}else if(cinsiyet.equals("erkek") && yas >=60 ) {
			
			System.out.println("emekli olabilirsiniz..");
		}else if(cinsiyet.equals("erkek") && yas < 60) {
			
			System.out.println("emekli olamazs�n�z..");
		}else {
			
			System.out.println("cinsiyet ve ya� tan�ms�z");
			
//			ya��n�z� giirniz :65
//			cinsiyetinizi giriniz :erkek
//			emekli olabilirsiniz..
		}
		
		
		if(cinsiyet.equals("kad�n")) {
		
			
			if (yas >=60) {
				System.out.println("emekli olabilrsiniz..");
				
			} else {
				
				System.out.println("emekli olamazs�n�z..");
			}
			
		}
			
			else if(cinsiyet.equals("erkek")) {
				
					if (yas>=60) {
				
				System.out.println("emekli olabilirsiniz..");
				
			} else {
				
				System.out.println("emekli olamazs�n�z...");
scan.close();
			}	

		
	}
	}
}
