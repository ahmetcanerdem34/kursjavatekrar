package DAY_16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoopCalisma21 {

	public static void main(String[] args) {
	
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("");
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
				
			}
			
		}
		

	}

}
