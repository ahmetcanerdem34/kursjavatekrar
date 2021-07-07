package DAY_08_nestedÝf;

import java.util.Scanner;

public class C3_NestedÝf3 {

	public static void main(String[] args) {
	/*	
		
		Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		
	Kullanicidan bir sifre girmesini isteyin
	
	Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
	“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
	Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
	“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		
*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("þifre giriniz :");
		String ilkHarf=scan.nextLine();
		
		if(ilkHarf.charAt(0)>='A' && ilkHarf.charAt(0)<='Z') {
			
			
			if (ilkHarf.charAt(0)=='A') {
				
				System.out.println("geçerli þifre");
			
			} else {
				
				System.out.println("geçersiz þifre..");
				
			}		

			}else if((ilkHarf.charAt(0)>='a' && ilkHarf.charAt(0)<='z')) {
				
				
				if (ilkHarf.charAt(0)=='z') {
					
					System.out.println("þifre geçerli..");
					
				} else {
					
					System.out.println("þifre geçersiz..");
					
//					þifre giriniz :ankara56
//					þifre geçersiz..
					
//					þifre giriniz :Adana01
//					geçerli þifre
					
//					þifre giriniz :Zigana78
//					geçersiz þifre..
					
//					þifre giriniz :zigana78
//					þifre geçerli..

scan.close();
				}
				
				
				
			}
			
				
			
		}
		
		
		
}
