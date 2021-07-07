package DAY_16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoopCalisma16 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.

    // sayacý ritmik ilerleyen ve adým sayýsý belli ise FOR kullanýlýr.
// DEÐÝLSE While kullanýlýr, ðer döngüye bir kez mutlaka girilecekse DO_WHILE kullanýlýr.

		Scanner scan= new Scanner(System.in);	
		int toplam=0;
		
		
		for (int i = 1; i <=5; i++) {
		System.out.println("sayý giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi>5 && sayi<10) {//6 7 8 9 sayýlarý girilirse pas geçilecek
			
		continue;//bu özellik istenen sayýlarý es geçer
			
			
		}
		toplam=toplam+sayi;
		
	}		
		System.out.println(toplam);
	}
}
	
		
		
		
	


