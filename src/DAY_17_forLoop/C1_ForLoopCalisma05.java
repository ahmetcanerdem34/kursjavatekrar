package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma05 {

	public static void main(String[] args) {
		
		
		//	Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen 
       //		sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		

		
		Scanner scan=new Scanner(System.in);
		System.out.print("100 den küçük bir tamsayý isteyiniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i < sayi; i++) {
			
			if(i%3==0 || i%5==0) {
				
				System.out.print(i+" ");
//				100 den küçük bir tamsayý isteyiniz :39
//				3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 
		scan.close();
			}
			
		}
		
	}

}
