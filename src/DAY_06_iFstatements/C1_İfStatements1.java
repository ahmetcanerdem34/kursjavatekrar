package DAY_06_iFstatements;

import java.util.Scanner;

public class C1_ÝfStatements1 {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.print("bir tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		
		
		if (sayi%2==0) {
			System.out.println("girilen sayý çifttir...");
	
		}
		
		if(sayi%2==1) {
			
			System.out.println("tektir");
			
//			bir tamsayý giriniz :44
//			girilen sayý çifttir...
			
//			bir tamsayý giriniz :33
//			tektir

		}
		
		int a=10;
		int b=8;
		
		if(a>b) {
			
			System.out.println("a büyüktür b");
			//a büyüktür b
			
		}

		if(b<a) {
			
			System.out.println("b küçüktür a");
			//b küçüktür a
		}
		if(a*b==80) {
			
			System.out.println(a-b);
			//2			
			
		}
		
		if(a<b || a>b) {
			
			System.out.println("veya da þartlardan biri saðlansa yani if içerisi true olsa süslü paranteze girmesi için yeterlidir");
			//veya da þartlardan biri saðlansa yani if içerisi true olsa süslü paranteze girmesi için yeterlidir
		}
			
		
		
		
		
	}

}
