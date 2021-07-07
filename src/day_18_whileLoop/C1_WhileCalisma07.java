package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma07 {

	public static void main(String[] args) {
		//  7.Soru:
	    //TODO INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.
		
		
		
		int gecerliPin=12345;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pin kodu giriniz");
		int pin=scan.nextInt();
		
		int count =0;
		int hataliGiris=3;
			
		while (count<3){
	
		if(pin==gecerliPin) {
			
			System.out.println("pin baþarýlý");
			break;
			
		}else {
			
			System.out.println("hatalý giriþ yaptýnýz tekrar deneyiz ");
			
			
		}
		count++;
	
		
		}
		
	}

}