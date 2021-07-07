package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma07 {

	public static void main(String[] args) {
	
		
	    /*  Kullanýcýdan bir String alýnýz...
	     * 
        Eðer String null (0) deðilse ve String uzunluðu 14 ise ve String "i love java" yý kapsýyorsa
        "String is i love java and 14 character." yazdýrýnýz.

        Eðer String null(0) deðilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
        "String is I love java" yazdýrýn.
    */

		
		stringKaracter();
		
		System.out.println("********************************");
		
		stringKaracter();
		
		
		

	}

	public static void stringKaracter() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("yazý giriniz :");
		String caracter=scan.nextLine();
		
		if (!caracter.equals(null) && caracter.length()==14 && caracter.contains("I love java"))  {
			
			System.out.println("String is i love java and 14 character." );
			
		} else if (!caracter.equals(null) && caracter.equalsIgnoreCase(caracter)) {
			
			System.out.println("String is I love java");
			
//			yazý giriniz :I love java jv
//			String is i love java and 14 character.
//			********************************
//			yazý giriniz :ý love java dünyasý
//			String is I love java

		}
		
		
	}

}
