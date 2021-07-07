package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhile2 {

	public static void main(String[] args) {
		
		
		
		/*	
		Kullanicidan toplamak uzere pozitif sayi isteyin, 
		islemi bitirmek icin 0’a basmasini soyleyin.
		  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin 
		  ve “Negatif sayi giremezsiniz” yazdirip basa donun
		  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
		  yanlislikla kac negative sayi girdigini 
		  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		*/
		
		
		Scanner scan= new Scanner (System.in);
		
	
		
		
		
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int sayi=1;
		
		System.out.println("oyuna hoþgeldiniz, bitirmek istediðinizde 0 a basýn");
		
		
		do {
			
			System.out.print("pozi sayý giriniz :");
			sayi=scan.nextInt();
			
			
			if(sayi>0) {
				countPoz++;
				toplamPoz+=sayi;
				
			}
			if(sayi<0) {
				
				countNeg++;
				System.out.println("negatif sayý giremezsiniz");
				
			}
			
			
		} 
		while (sayi!=0);
		
		System.out.println("toplam" + countPoz+" "+" "+"pozitif sayý girdiniz");
		System.out.println("toplam" + countNeg+" "+" "+"negatif sayý girdiniz");
		System.out.println("girdiðiniz pozitif sayýlarýn toplamý"+" "+ toplamPoz);
	scan.close();
	
	
//	oyuna hoþgeldiniz, bitirmek istediðinizde 0 a basýn
//	pozi sayý giriniz :-5
//	negatif sayý giremezsiniz
//	pozi sayý giriniz :-7
//	negatif sayý giremezsiniz
//	pozi sayý giriniz :45
//	pozi sayý giriniz :34
//	pozi sayý giriniz :23
//	pozi sayý giriniz :34
//	pozi sayý giriniz :0
//	toplam4  pozitif sayý girdiniz
//	toplam2  negatif sayý girdiniz
//	girdiðiniz pozitif sayýlarýn toplamý 136
	}

}
