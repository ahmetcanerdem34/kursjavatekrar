package DAY_06_iFstatements;

import java.util.Scanner;

public class C4_ifStatements4 {

	public static void main(String[] args) {
		
		
		//soru: kullanýcýdan bir dikdörtgenin 2 kenar uzunluðunu alýn
		//kena r uzunluklarýu eþitse kare deðilse dikdörtgen yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" 2 kenar uzunluðu giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
	
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			
			System.out.println("girilen kenar uzunluklarý eþit olduðu için þekil karedir..");
//			2 kenar uzunluðu giriniz :
//				4.5
//				4.5
//				girilen kenar uzunluklarý eþit olduðu için þekil karedir..
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			
			System.out.println("girilen kenar uzunluklarý eþit olmadýðýndan, bu þekil dikdörtgendir..");
			
//			 2 kenar uzunluðu giriniz :
//				 45
//				 34
//				 girilen kenar uzunluklarý eþit olmadýðýndan, bu þekil dikdörtgendir..
			
		}
		if(kenar1<0 && kenar2<0) {
			
			System.out.println("kenar uzunluklarý 0 dan büyük olmalýdýr");
			
//			 2 kenar uzunluðu giriniz :
//				 -5
//				 -7
//				 kenar uzunluklarý 0 dan büyük olmalýdýr
			
			
			scan.close();
		}
		
	}
	
	
	

}
