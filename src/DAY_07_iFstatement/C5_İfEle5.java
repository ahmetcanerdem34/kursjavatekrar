package DAY_07_iFstatement;

import java.util.Scanner;

public class C5_ÝfEle5 {

	public static void main(String[] args) {
		
		
				//soru: kullanýcýdan 2 sayý isteyin, sayýlarýn 2 side pozitifse sayýlarýn yazdýrýn
				//2 side negatifse sayýlarýn çarpýmýný yazýdýrn
				//farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz yazýn
				//sayýlardan sýfýra eþit olan varsa sýfýr çarpmaya göre yutan elemandýr yazdýrýn
		
			Scanner scan=new Scanner (System.in);
			System.out.print("2 sayi girniz :");
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			if(sayi1>0 && sayi2>0) {
				System.out.println("Girilen sayýlar :" +sayi1+" "+ sayi2);
				
			}else if(sayi1<0 && sayi2<0) {
				
				System.out.println(sayi1*sayi2);
				
			}else if(sayi1==0 || sayi2==0) {
				
				System.out.println("sýfýr çarpmaya göre yutan elemandýr...");
			}else {
				
				System.out.println("farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz...");
				
//				2 sayi girniz :45
//				54
//				Girilen sayýlar :45 54		
				
//				2 sayi girniz :-7
//				-6
//				42

//				2 sayi girniz :0
//				0
//				sýfýr çarpmaya göre yutan elemandýr...
				
//				2 sayi girniz :56
//				-6
//				farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz...
scan.close();
			}
			
		
		
	}

}
