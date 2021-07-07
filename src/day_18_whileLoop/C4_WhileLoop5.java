package day_18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop5 {

	public static void main(String[] args) {
		
		
		/*
		 * Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		 * kac tane olduklarini ekranda yazdirin
		 * 
		 */
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("sayý giriniz :");
		int sayi=scan.nextInt();
		
		int bolen=1;
		int count=0;
		
		while(bolen<=sayi) {
			
			if(sayi % bolen==0) {
				
				System.out.println(bolen);
				count++;
			}
			bolen++;
			
		}
		System.out.println(sayi+ "sayýsýnýn bölenleri" + count+ "adettir" );
//		sayý giriniz :50
//		1
//		2
//		5
//		10
//		25
//		50
//		50sayýsýnýn bölenleri6adettir
		scan.close();

	}

}
