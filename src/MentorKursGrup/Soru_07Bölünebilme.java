package MentorKursGrup;

import java.util.Scanner;

public class Soru_07Bölünebilme {

	public static void main(String[] args) {
		
				// Kullanýcýdan bir tamsayý alýn eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
				// 3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.

		Scanner scan=new Scanner(System.in);
		System.out.println("Tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi%3==0) {
			
			System.out.println("“3’ün katý”");
			
		}else {
			
			System.out.println(" “3’ün katý deðildir”");
//			Tamsayý giriniz :
//				9
//				“3’ün katý”
			
//			Tamsayý giriniz :
//				4
//				 “3’ün katý deðildir”
		}

	}

}
