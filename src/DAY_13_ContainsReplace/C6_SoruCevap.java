package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C6_SoruCevap {

	public static void main(String[] args) {

		//kullanýcýdan 4 harfli bir kelime isteyin ve tersten yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		
		System.out.print("4 harfli bir kelime giriniz :");
		String str=scan.nextLine();
		
		
		if(str.length()!=4) {
			System.out.println("4 harfli kelime giriniz :");
		}else {
			
			System.out.println(str.substring(3));
			System.out.println(str.substring(2,3));
			System.out.println(str.substring(1,2));
			System.out.println(str.substring(0,1));
			
//			4 harfli bir kelime giriniz :kalem
//			4 harfli kelime giriniz :
//			4 harfli bir kelime giriniz :zara
//			a
//			r
//			a
//			z
			
			scan.close();
		}

	}

}
