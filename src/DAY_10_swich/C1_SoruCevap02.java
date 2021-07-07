package DAY_10_swich;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class C1_SoruCevap02 {

	public static void main(String[] args) {
	
		  /*
        Kullanıcının girdiği gün sayısına karşılık gelen haftanın gününün adını yazıdırınız.
        haftanın 1.günü Pazartesi alınız.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("gun sayısı giriiniz :");
		int sayi = scan.nextInt();
		scan.close();	
		scan.close();
			
		if(sayi>0 && sayi<=7) {
					
		switch (sayi){
		
		case 1: System.out.println("pazartesi");break;
		case 2: System.out.println("salı");break;
		case 3: System.out.println("çarşamba");break;
		case 4: System.out.println("perşembe");break;
		case 5: System.out.println("cuma");break;
		case 6: System.out.println("cumartesi");break;
		case 7: System.out.println("pazar");break;
	
	
		}
		
		}
		
		System.out.println();
		
		String arr[]= {"pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"};
		
		System.out.println(Arrays.toString(arr));
		
		
		for (String string : arr) {
			
			System.out.println(Arrays.toString(arr));
			
		}
			
		
		
	
			
		}

	}


