package DAY_06_iFstatements;

import java.util.Scanner;

public class C1_�fStatements1 {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.print("bir tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		
		
		if (sayi%2==0) {
			System.out.println("girilen say� �ifttir...");
	
		}
		
		if(sayi%2==1) {
			
			System.out.println("tektir");
			
//			bir tamsay� giriniz :44
//			girilen say� �ifttir...
			
//			bir tamsay� giriniz :33
//			tektir

		}
		
		int a=10;
		int b=8;
		
		if(a>b) {
			
			System.out.println("a b�y�kt�r b");
			//a b�y�kt�r b
			
		}

		if(b<a) {
			
			System.out.println("b k���kt�r a");
			//b k���kt�r a
		}
		if(a*b==80) {
			
			System.out.println(a-b);
			//2			
			
		}
		
		if(a<b || a>b) {
			
			System.out.println("veya da �artlardan biri sa�lansa yani if i�erisi true olsa s�sl� paranteze girmesi i�in yeterlidir");
			//veya da �artlardan biri sa�lansa yani if i�erisi true olsa s�sl� paranteze girmesi i�in yeterlidir
		}
			
		
		
		
		
	}

}
