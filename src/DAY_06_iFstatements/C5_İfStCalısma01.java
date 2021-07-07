package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma01 {

	public static void main(String[] args) {
		
		   /* kullanýcýdan alýnacak double1 ve double2 isimli iki tane double oluþturulmuþtur
		    
        Eðer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdýrýnýz.
        Eðer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdýrýnýz.
        */

		
		double sayi1=15.5;
		double sayi2=12.56;
		
		
		if(sayi1>sayi2) {
			System.out.println("double 1 is greater than double 2");
			
		}else
			System.out.println("double 1 is smaller than double 2" );
		
		//double 1 is greater than double 2
		
		
		
		 /*     kullanýcýdan alýnýarak  int number oluþturun.
        Eðer int number 0 yazdýrýlýrsa "Im neutral",
        Eðer int number 0'dan büyükse "I m positive",
        Eðer int number 0'dan küçükse "I am negative" yazdýrýlsýn.   */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("sayý giriniz:");
		int sayi=scan.nextInt();
		
		
		if (sayi==0) {
			System.out.println("\"Im neutral\"");
			
		}else if (sayi>0) {
			
			System.out.println("\"I m positive\",");
		}else
			System.out.println("\"I am negative\" ");
		
//		sayý giriniz:-12
//		"I am negative" 
//		sayý giriniz:34
//		"I m positive",
		
		
		
		 /*  kullanýcýdan alacaðýnýz int number için
	     Eðer, int number ikiye bölündüðünde geri kalaný 0'a eþit ise "number is a EVEN number" yazdýrýn.
	     Eðer, int number ikiye bölündüðünde geri kalaný 0'a eþit deðil ise "number is a ODD number" yazdýrýn.
	*/
		
		if (sayi%2==0) {
			
			System.out.println("number is a EVEN number" );
			
		}else
			System.out.println("number is a ODD number");
//		sayý giriniz:45
//		number is a ODD number
		
		
		  /*  33 deðerinde bir int oluþturun.
        Eðer, 33'ü 4'e böldüðünüzde kalan 3'e eþit ise "Remainder is 3" yazdýrýnýz.
        Eðer, 33'ü 4'e böldüðünüzde kalan 2'e eþit ise "Remainder is 2" yazdýrýnýz.
        Eðer, 33'ü 4'e böldüðünüzde kalan 1'e eþit ise "Remainder is 1" yazdýrýnýz.
        Aksi halde (else) "Reminder is 0" yazdýrýnýz.  */
		
		
		if (sayi%4==3) {
			
			System.out.println("\"Remainder is 3\" ");
			
		}else if(sayi%4==2) {
			
			System.out.println("Remainder is 2" );
		}
		else if (sayi%4==1) {
			System.out.println("Remainder is 1");
			
		}else
			System.out.println("\"Reminder is 0\" ");
		
//		sayý giriniz:33
//		"I m positive",
//		number is a ODD number
//		Remainder is 1
		
	
		scan.close();
		
	}

}
