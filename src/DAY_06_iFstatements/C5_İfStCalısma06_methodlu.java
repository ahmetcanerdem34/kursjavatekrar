package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma06_methodlu {

	public static void main(String[] args) {
	
	      /* Kullan�c�dan bir str isminde bir String al�n�z.
	       * 
        E�er String Orange'ye e�it ise ve uzunlu�u 6'ya e�it ise "Orange has six letters" yazd�r�n�z.
        
        E�er String Apple'ye e�it ise ve uzunlu�u 5'ya e�it ise "Apple has five letters" yazd�r�n�z.
        E�er String Orange'yi kaps�yorsa ve uzunlu�u 10'dan fazla ise
        
        "String contain orange and length is more then 10" yazd�r�n�z.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter say�s�ndan bahsediliyor.  */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("yaz� giriniz");
		String yazi=scan.nextLine().toLowerCase();
		
		int uzunluk=yazi.length();
		
		if(yazi.contains("orange") && uzunluk==6) {
			
			System.out.println("Orange has six letters\"");
		
		}else if(yazi.contains("apple") && uzunluk==5) {
			
			System.out.println("Apple has five letters" );
		}else if(yazi.contains("orange") && uzunluk>10) {
			
			System.out.println("\"String contain orange and length is more then 10\"");
			
			
//			yaz� giriniz
//			apple
//			Apple has five letters
//			yaz� giriniz
//			orange
//			"Orange has six letters"
			
			scan.close();
		}
		
	}

}
