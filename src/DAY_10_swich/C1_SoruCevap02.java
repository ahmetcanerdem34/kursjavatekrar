package DAY_10_swich;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class C1_SoruCevap02 {

	public static void main(String[] args) {
	
		  /*
        Kullan�c�n�n girdi�i g�n say�s�na kar��l�k gelen haftan�n g�n�n�n ad�n� yaz�d�r�n�z.
        haftan�n 1.g�n� Pazartesi al�n�z.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("gun say�s� giriiniz :");
		int sayi = scan.nextInt();
		scan.close();	
		scan.close();
			
		if(sayi>0 && sayi<=7) {
					
		switch (sayi){
		
		case 1: System.out.println("pazartesi");break;
		case 2: System.out.println("sal�");break;
		case 3: System.out.println("�ar�amba");break;
		case 4: System.out.println("per�embe");break;
		case 5: System.out.println("cuma");break;
		case 6: System.out.println("cumartesi");break;
		case 7: System.out.println("pazar");break;
	
	
		}
		
		}
		
		System.out.println();
		
		String arr[]= {"pazartesi","sal�","�ar�amba","per�embe","cuma","cumartesi","pazar"};
		
		System.out.println(Arrays.toString(arr));
		
		
		for (String string : arr) {
			
			System.out.println(Arrays.toString(arr));
			
		}
			
		
		
	
			
		}

	}


