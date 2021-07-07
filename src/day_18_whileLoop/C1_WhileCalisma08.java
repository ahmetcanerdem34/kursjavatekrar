package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma08 {

	public static void main(String[] args) {
		//  //TODO STRING OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.

		String pinKodu="1453GS";
	
		Scanner scan=new Scanner(System.in);
		
		
		int a=0;
		
		do {
		
			System.out.println("pin kodu giriniz:");
			String pin=scan.nextLine();
			
			if(pin.equalsIgnoreCase(pinKodu)) {
				
				System.out.println("giriþ baþarýlý");
			}else {
				System.out.println("hatlý giriþ yaptýnýz");
			}
			a++;
			
		} while (a<3);
		
		
	}

}
