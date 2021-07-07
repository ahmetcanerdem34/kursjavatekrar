package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma06_methodlu {

	public static void main(String[] args) {
	
	      /* Kullanýcýdan bir str isminde bir String alýnýz.
	       * 
        Eðer String Orange'ye eþit ise ve uzunluðu 6'ya eþit ise "Orange has six letters" yazdýrýnýz.
        
        Eðer String Apple'ye eþit ise ve uzunluðu 5'ya eþit ise "Apple has five letters" yazdýrýnýz.
        Eðer String Orange'yi kapsýyorsa ve uzunluðu 10'dan fazla ise
        
        "String contain orange and length is more then 10" yazdýrýnýz.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayýsýndan bahsediliyor.  */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("yazý giriniz");
		String yazi=scan.nextLine().toLowerCase();
		
		int uzunluk=yazi.length();
		
		if(yazi.contains("orange") && uzunluk==6) {
			
			System.out.println("Orange has six letters\"");
		
		}else if(yazi.contains("apple") && uzunluk==5) {
			
			System.out.println("Apple has five letters" );
		}else if(yazi.contains("orange") && uzunluk>10) {
			
			System.out.println("\"String contain orange and length is more then 10\"");
			
			
//			yazý giriniz
//			apple
//			Apple has five letters
//			yazý giriniz
//			orange
//			"Orange has six letters"
			
			scan.close();
		}
		
	}

}
