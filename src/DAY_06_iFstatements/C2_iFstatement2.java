package DAY_06_iFstatements;

import java.util.Scanner;

public class C2_iFstatement2 {

	public static void main(String[] args) {
		
		//soru kullanýcdan bir sayý isteyin ve sayýnýn tekmi çift mi onu yazdýrýn
		
				Scanner scan=new Scanner (System.in);
				
				System.out.print("istediðiniz günün ilk harfini giriniz :");
				char ilkHarf=scan.next().toLowerCase().charAt(0);
				
				
				if(ilkHarf=='p') {
					
					System.out.println("pazartesi - perþembe - pazar");
				}
				
				if(ilkHarf=='s') {
					
					System.out.println("salý");
				}
				
				if(ilkHarf=='ç') {
					System.out.println("çarþamba");
				}
				
				if(ilkHarf=='c') {
					
					System.out.println("cuma - cumartesi");
				}
				else if(ilkHarf >'a' != ilkHarf < 'z' )  {
					
					System.out.println("yanlýþ gün karakteri girdiniz...");
					
					
					
//					istediðiniz günün ilk harfini giriniz :p
//					pazartesi - perþembe - pazar
					
//					istediðiniz günün ilk harfini giriniz :%
//					yanlýþ gün karakteri girdiniz...
					
//					istediðiniz günün ilk harfini giriniz :c
//					cuma - cumartesi

				}
	}
				
		
	}


