package DAY_08_nested�f;

import java.util.Scanner;

public class C3_Nested�f3 {

	public static void main(String[] args) {
	/*	
		
		Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		
	Kullanicidan bir sifre girmesini isteyin
	
	Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise
	�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
	Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise
	�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		
*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�ifre giriniz :");
		String ilkHarf=scan.nextLine();
		
		if(ilkHarf.charAt(0)>='A' && ilkHarf.charAt(0)<='Z') {
			
			
			if (ilkHarf.charAt(0)=='A') {
				
				System.out.println("ge�erli �ifre");
			
			} else {
				
				System.out.println("ge�ersiz �ifre..");
				
			}		

			}else if((ilkHarf.charAt(0)>='a' && ilkHarf.charAt(0)<='z')) {
				
				
				if (ilkHarf.charAt(0)=='z') {
					
					System.out.println("�ifre ge�erli..");
					
				} else {
					
					System.out.println("�ifre ge�ersiz..");
					
//					�ifre giriniz :ankara56
//					�ifre ge�ersiz..
					
//					�ifre giriniz :Adana01
//					ge�erli �ifre
					
//					�ifre giriniz :Zigana78
//					ge�ersiz �ifre..
					
//					�ifre giriniz :zigana78
//					�ifre ge�erli..

scan.close();
				}
				
				
				
			}
			
				
			
		}
		
		
		
}
