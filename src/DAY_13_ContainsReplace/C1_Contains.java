package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		
		//kullanýcýdan bir cümle ve aramak istediði bir String isteyin
				//cümle stringi içeriyorsa"baþarýlý" deðilse "baþarýsýz" yazýn

		
		//kullanýcýdan bir cümle ve alrak istediði bir String isteyin
				//cümle stringi içeriyorsa"baþarýlý" deðilse "baþarýsýz" yazýn
				
				
				
				
				Scanner scan=new Scanner(System.in);
				System.out.print("bir cümle giriniz :");
				String cumle=scan.nextLine();
				System.out.println("aramak istediðiniz kelimeyi yazýnýz :");
				String kelime=scan.next();
				
				System.out.println(cumle.contains(kelime) ? "baþarýlý" : "baþarýsýz");
				//baþarýlý
				
				System.out.println("******************************");
				
				if (cumle.contains(kelime)) {
					System.out.println("baþarýlý");
					
				}else {
					System.out.println("güzel");
					
//					bir cümle giriniz :hedef java
//					aramak istediðiniz kelimeyi yazýnýz :
//					güzel
//					baþarýsýz
//					******************************
//					güzel

					
				}
	}

}
