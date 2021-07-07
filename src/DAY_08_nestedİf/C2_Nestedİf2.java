package DAY_08_nestedÝf;

import java.util.Scanner;

public class C2_NestedÝf2 {

	public static void main(String[] args) {
		
		
		
				//verilen yas ve cinsiyet için emekli olup olmayacaðýný yazýnýz
				//soru: eðer çalýþan kadýn 60 yasýndan buyuk olduðunda emekli olabilir 
				//çlaýþsan erkekse 65 yasýndan buyukse emekli olabilir
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("yaþýnýzý giirniz :");
		int yas=scan.nextInt();
		System.out.print("cinsiyetinizi giriniz :");
		String cinsiyet=scan.next().toLowerCase();
		
		
		if (cinsiyet.equals("kadýn") && yas >= 60) {
			
			System.out.println("emekli olabilirsiniz ..");
			
		}else if(cinsiyet.equals("kadýn") && yas < 60) {

		System.out.println("emekli olamazsýnýz..");		
			
		}else if(cinsiyet.equals("erkek") && yas >=60 ) {
			
			System.out.println("emekli olabilirsiniz..");
		}else if(cinsiyet.equals("erkek") && yas < 60) {
			
			System.out.println("emekli olamazsýnýz..");
		}else {
			
			System.out.println("cinsiyet ve yaþ tanýmsýz");
			
//			yaþýnýzý giirniz :65
//			cinsiyetinizi giriniz :erkek
//			emekli olabilirsiniz..
		}
		
		
		if(cinsiyet.equals("kadýn")) {
		
			
			if (yas >=60) {
				System.out.println("emekli olabilrsiniz..");
				
			} else {
				
				System.out.println("emekli olamazsýnýz..");
			}
			
		}
			
			else if(cinsiyet.equals("erkek")) {
				
					if (yas>=60) {
				
				System.out.println("emekli olabilirsiniz..");
				
			} else {
				
				System.out.println("emekli olamazsýnýz...");
scan.close();
			}	

		
	}
	}
}
