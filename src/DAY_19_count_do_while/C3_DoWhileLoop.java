package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		
			//while loop ta �nce �arta bak�yorduk sa�lan�yorsa tekrar tekrar �al���yordu
		
				//do while ise �nce kodu �al��t�r�yoruz sonra �arta bak�yoruz
				//fasydas� ne= 

				Scanner scan= new Scanner (System.in);
		
		int sayi=0;//niye burda olu�turdu�umuzu sonrak i ders te a��klayaca�
		
		do {
			
			System.out.print("bir say� giriniz :");
			sayi=scan.nextInt();
			
			
			
		} while (sayi<=0);
		
		System.out.println("afferin");
		
//		bir say� giriniz :-4
//		bir say� giriniz :-5
//		bir say� giriniz :-67
//		bir say� giriniz :-34
//		bir say� giriniz :5
//		afferin
	}

}
