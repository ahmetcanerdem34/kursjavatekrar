package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma07 {

	public static void main(String[] args) {
	
		
	    /*  Kullan�c�dan bir String al�n�z...
	     * 
        E�er String null (0) de�ilse ve String uzunlu�u 14 ise ve String "i love java" y� kaps�yorsa
        "String is i love java and 14 character." yazd�r�n�z.

        E�er String null(0) de�ilse ve karakter bi�imini (b�y�k, k�c�k harf) g�rmezden gelirse,
        "String is I love java" yazd�r�n.
    */

		
		stringKaracter();
		
		System.out.println("********************************");
		
		stringKaracter();
		
		
		

	}

	public static void stringKaracter() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("yaz� giriniz :");
		String caracter=scan.nextLine();
		
		if (!caracter.equals(null) && caracter.length()==14 && caracter.contains("I love java"))  {
			
			System.out.println("String is i love java and 14 character." );
			
		} else if (!caracter.equals(null) && caracter.equalsIgnoreCase(caracter)) {
			
			System.out.println("String is I love java");
			
//			yaz� giriniz :I love java jv
//			String is i love java and 14 character.
//			********************************
//			yaz� giriniz :� love java d�nyas�
//			String is I love java

		}
		
		
	}

}
