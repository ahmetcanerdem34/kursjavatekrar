package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhile2 {

	public static void main(String[] args) {
		
		
		
		/*	
		Kullanicidan toplamak uzere pozitif sayi isteyin, 
		islemi bitirmek icin 0�a basmasini soyleyin.
		  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin 
		  ve �Negatif sayi giremezsiniz� yazdirip basa donun
		  Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini, 
		  yanlislikla kac negative sayi girdigini 
		  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		*/
		
		
		Scanner scan= new Scanner (System.in);
		
	
		
		
		
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int sayi=1;
		
		System.out.println("oyuna ho�geldiniz, bitirmek istedi�inizde 0 a bas�n");
		
		
		do {
			
			System.out.print("pozi say� giriniz :");
			sayi=scan.nextInt();
			
			
			if(sayi>0) {
				countPoz++;
				toplamPoz+=sayi;
				
			}
			if(sayi<0) {
				
				countNeg++;
				System.out.println("negatif say� giremezsiniz");
				
			}
			
			
		} 
		while (sayi!=0);
		
		System.out.println("toplam" + countPoz+" "+" "+"pozitif say� girdiniz");
		System.out.println("toplam" + countNeg+" "+" "+"negatif say� girdiniz");
		System.out.println("girdi�iniz pozitif say�lar�n toplam�"+" "+ toplamPoz);
	scan.close();
	
	
//	oyuna ho�geldiniz, bitirmek istedi�inizde 0 a bas�n
//	pozi say� giriniz :-5
//	negatif say� giremezsiniz
//	pozi say� giriniz :-7
//	negatif say� giremezsiniz
//	pozi say� giriniz :45
//	pozi say� giriniz :34
//	pozi say� giriniz :23
//	pozi say� giriniz :34
//	pozi say� giriniz :0
//	toplam4  pozitif say� girdiniz
//	toplam2  negatif say� girdiniz
//	girdi�iniz pozitif say�lar�n toplam� 136
	}

}
