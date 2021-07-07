package MentorBizimSetler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class SetlerSoru_06 {

	/*
	 * Node(vagonlar� birbirine ba�layan referanslar� ve vagonlar�n degerine denir
	 * )'larin de�ereleri; "Ali" "Veli" "Ayse" "Can" olan bir LinkedList olusturun
	 * Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
	 * "Bu isim LinkedList'de vardi ve silindi" diye mesaj verin Girilen isim yoksa
	 * "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
	 * 
	 */

	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<>(Arrays.asList("Ali","Veli","Ayse","Can"));
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("�sim giriniz :");
		String isim=scan.nextLine();
		
		for (String each : ll) {
			
			if (each.equalsIgnoreCase(isim)) {
				
				ll.remove(each);
			
         System.out.println("bu isim Linked da vard� ve silindi :" + ll);
         	break;
		}
			
			else {
			
			System.out.println("Bu isim linked listte yoktu silinemedi :"+ll);
		}
			
		}
		
		

	}

}
