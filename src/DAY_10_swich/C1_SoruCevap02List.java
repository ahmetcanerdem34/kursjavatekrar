package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap02List {

	public static void main(String[] args) {
		
		  /*
        Kullanıcının girdiği gün sayısına karşılık gelen haftanın gününün adını yazıdırınız.
        haftanın 1.günü Pazartesi alınız.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("gun sayısı giriiniz :");
		int sayi = scan.nextInt();
		
		String gunler[]= {"pazartesi", "salı","çarşamba","perşembe","cuma","cumartesi","pazar"};
		
		
		if(sayi>=1 && sayi<=7) {
			
			System.out.println("girmiş olduğunuz sayıya karşılık gelen gun :" +" "+ gunler[sayi-1]);
			
			
		}else {
			
			System.out.println("girmiş olduğunuz sayı, gün içermemektdir");
			
			scan.close();
		}
		
	}

}
