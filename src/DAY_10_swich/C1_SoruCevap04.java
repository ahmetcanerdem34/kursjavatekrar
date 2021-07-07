package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap04 {

	public static void main(String[] args) {
	
		
		  // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız


		Scanner scan = new Scanner(System.in);
		System.out.println("ay numarası giriniz :");
		int ayNumarasi = scan.nextInt();
		
		if(ayNumarasi>0 && ayNumarasi <=12) {
			
			
			switch (ayNumarasi) {
			
			
			case  1 : System.out.println(1+ ". ay ocak 31 gün çeker ");break;
			case  2 : System.out.println(2+ ". ay şubat 28 gün çeker ");break;
			case  3 : System.out.println(3+ ". ay mart 31 gün çeker ");break;
			
			
			
			
			
			}
			
			
			
		}
		
	}

}
