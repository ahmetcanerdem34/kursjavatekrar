package DAY_07_iFstatement;

import java.util.Scanner;

public class C1_�fElseStatment1 {

	public static void main(String[] args) {
		
		
		int a =2;
		int b =5;
		
		if(a>b) {
			System.out.println("a b�y�kt�r b");
		}else {
			System.out.println(a*b);
//			10
			
		
		}
		
		
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare 
		//olup olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.print("kenar uzunluklar� giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			
			System.out.println("�ekil karedir");
		}else {
			System.out.println("�ekil dikd�rtgendir");
//			kenar uzunluklar� giriniz :34.5
//			34.5
//			�ekil karedir
			
//			kenar uzunluklar� giriniz :34
//			34
//			�ekil karedir
			
			scan.close();
		}
		
		
	}

}
