package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma06 {

	public static void main(String[] args) {
		
		
		//	Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen 
//		sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("100 den küçük sayı griniz :");
		int sayi=scan.nextInt();
		
		
		if(sayi>100 && sayi<0) {
			System.out.print("100 den küçük sayı giriniz");
		}else {
			
			for (int i = 1; i < sayi; i++) {
				
				if(i%3==0){
					
					System.out.print(i+" ");
					
				}else if(i%5==0) {
					
					System.out.print(i+" ");
//					100 den küçük sayı griniz :50
//					3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 39 40 42 45 48 
					scan.close();
				}
				
			}
			
		}

	}

}
