package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap02List {

	public static void main(String[] args) {
		
		  /*
        Kullan�c�n�n girdi�i g�n say�s�na kar��l�k gelen haftan�n g�n�n�n ad�n� yaz�d�r�n�z.
        haftan�n 1.g�n� Pazartesi al�n�z.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("gun say�s� giriiniz :");
		int sayi = scan.nextInt();
		
		String gunler[]= {"pazartesi", "sal�","�ar�amba","per�embe","cuma","cumartesi","pazar"};
		
		
		if(sayi>=1 && sayi<=7) {
			
			System.out.println("girmi� oldu�unuz say�ya kar��l�k gelen gun :" +" "+ gunler[sayi-1]);
			
			
		}else {
			
			System.out.println("girmi� oldu�unuz say�, g�n i�ermemektdir");
			
			scan.close();
		}
		
	}

}
