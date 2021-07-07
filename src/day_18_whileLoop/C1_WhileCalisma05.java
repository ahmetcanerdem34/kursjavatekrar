package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma05 {

	public static void main(String[] args) {
		
		//5.Soru:
	    //TODO --------GÝRÝLEN SAYININ BASAMAKLARINDAKÝ RAKAMLARIN TOPLAMINI BULUNUZ.

		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz :");
		int sayi=scan.nextInt();
		
	
		int i=0;
		int top=0;
		while(i<15) {//15 le girdýik INTEGER ýn alaný belli
			
			top+=sayi%10;
			sayi/=10;
			
			i++;
		}
		
		System.out.println(top);
		
	}

}
