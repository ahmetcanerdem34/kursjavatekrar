package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma033_methodlu {

	public static void main(String[] args) {
		
		
		  /*
        Scanner class kullan�larak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile ayn� ise ayn� olan harflerin birisini kald�r�n

        �rnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print(" 2 string giriniz :");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		
		
		
		if (str1.charAt(str1.length()-1)==str2.charAt(0)) {
			
			String yeniKelime=str1.concat(str2.substring(1));//local 
			
			System.out.println(yeniKelime);
			
			
			
		}
		else {
			System.out.println(str1.concat(str2));
			
//			 2 string giriniz :ankara
//			 ba�kent
//			 ankaraba�kent
		}
		
		
		
		
		
		
	}

}
