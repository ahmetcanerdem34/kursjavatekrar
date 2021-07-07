package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopStringCalisma01 {

	public static void main(String[] args) {
		

		//Soru 8 ) Interview Question Kullanicidan bir String isteyin //
				//ve Stringi tersine ceviren bir program yazin.
				
				Scanner scan=new Scanner (System.in);
				System.out.print("string girin:");
				String cumle =scan.nextLine();//kara basma iz olur
		
				String yeniCumle="";
				
				for (int i = cumle.length()-1; i >=0; i--) {
					
					yeniCumle=yeniCumle+cumle.charAt(i);
					
				}
				System.out.println(yeniCumle);
//				string girin:kara basma iz olur
//				rulo zi amsab arak
				
				scan.close();
	}

}
