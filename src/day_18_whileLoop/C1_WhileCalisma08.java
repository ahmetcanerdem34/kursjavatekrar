package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma08 {

	public static void main(String[] args) {
		//  //TODO STRING OLAN PIN kodunuzu kontrol eden bir kod yaz�n�z.

		String pinKodu="1453GS";
	
		Scanner scan=new Scanner(System.in);
		
		
		int a=0;
		
		do {
		
			System.out.println("pin kodu giriniz:");
			String pin=scan.nextLine();
			
			if(pin.equalsIgnoreCase(pinKodu)) {
				
				System.out.println("giri� ba�ar�l�");
			}else {
				System.out.println("hatl� giri� yapt�n�z");
			}
			a++;
			
		} while (a<3);
		
		
	}

}
