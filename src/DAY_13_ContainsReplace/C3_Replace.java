package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C3_Replace {

	public static void main(String[] args) {
		
		

		// Kullanicidan bir cumle isteyin
				// cumledeki tum bosluklari silin ve
				// tum a'larin yerine e yazdirin
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("l�tfen bir c�mle giriniz :");
		String str =scan.nextLine();
		
		
		System.out.println(str.replace(" ","").strip().replace('a', 'e'));
//		l�tfen bir c�mle giriniz :kardan adam kar�n yo�unlu�u ile yap�l�r
//		kerdenedemker�nyo�unlu�uileyep�l�r
scan.close();
	}

}
