package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap13 {

	public static void main(String[] args) {
		
		
		 /*
		   A þehrinden uçamk isyteyen bir kiþi B þehrine 500km C þehrine  700km  D þehrine  900 km mesafededir.
		   
		   km birim fiyati : 0.10$ 
		   
		   12 yasindan kucukse toplam fiyat %50 indirim=0.05$ 
		   
		   12 ve 24 yas arasindaysa 10%=0.09 
		   
		   65 yasindan buyukse 30% =0.07
		   
		   gidis donus alirsa20%
		    
		   bu kosullara gore yolcudan gideceði mesafeyi isteyip ucak biletini hesaplayan program
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" gideceðiniz mesafeyi giriniz :");
		int yol = scan.nextInt();
		System.out.println(" yaþýnýzý giriniz :");
		int yas=scan.nextInt();
		System.out.println(" gidiþ dönüþ mü :");
		boolean karar=scan.nextBoolean();
		
		
		if(karar==true) {
			
			if(yas< 12) {
				
				System.out.println(yol*0.4);	 
					
					
				}else if(yas>12 && yas<24) {
					
					System.out.println((yol*0.9)*0.8);
					
				}else if(yas>65) {
					
					System.out.println((yol*0.7)*0.8);
				}else {
					
					System.out.println((yol*0.10)*0.8);
				}
				
			
			
		}else {
			if(yas< 12) {
				
				System.out.println(yol*0.5);	 
					
					
				}else if(yas>12 && yas<24) {
					
					System.out.println(yol*0.9);
					
				}else if(yas>65) {
					
					System.out.println(yol*0.7);
				}else {
					
					System.out.println(yol*0.10);
					
					scan.close();
				}
				
				
			
		
		}
		
		
		
		
		
		
		

	}

}
