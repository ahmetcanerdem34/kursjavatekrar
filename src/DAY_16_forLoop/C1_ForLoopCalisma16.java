package DAY_16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoopCalisma16 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.

    // sayac� ritmik ilerleyen ve ad�m say�s� belli ise FOR kullan�l�r.
// DE��LSE While kullan�l�r, �er d�ng�ye bir kez mutlaka girilecekse DO_WHILE kullan�l�r.

		Scanner scan= new Scanner(System.in);	
		int toplam=0;
		
		
		for (int i = 1; i <=5; i++) {
		System.out.println("say� giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi>5 && sayi<10) {//6 7 8 9 say�lar� girilirse pas ge�ilecek
			
		continue;//bu �zellik istenen say�lar� es ge�er
			
			
		}
		toplam=toplam+sayi;
		
	}		
		System.out.println(toplam);
	}
}
	
		
		
		
	


