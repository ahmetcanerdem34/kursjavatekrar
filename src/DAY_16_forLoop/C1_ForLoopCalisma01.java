package DAY_16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoopCalisma01 {

	public static void main(String[] args) {
		
		
		 /*
	     Kullan�c�dan al�nan bir tamsay�ya kadar FIBONACCI dizisi olu�turun.
	     1-1-2-3-5-8-13-21-34....
	     */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		int n1=0;
		int n2=1;
		int n3;
		for (int i = 2; i <=sayi; i++) {
			
			n3=n1+n2;
			
			System.out.println(n3);
			n1=n2;
			n2=n3;	
		}
		System.out.println();
	}

}
