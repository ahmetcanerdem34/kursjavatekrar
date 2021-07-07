package DAY_02_scanners;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("lütfen 100'den küçük pozitif tam sayý giriniz :");
		int sayi=scan.nextInt();
		
		System.out.println("girilen pozitif tamsayý deðeri :"+sayi);

//		lütfen 100'den küçük pozitif tam sayý giriniz :389
//		girilen pozitif tamsayý deðeri :389
		
		
		
		System.out.println("*******************************************");
		
		Scanner scan1=new Scanner (System.in);
		System.out.print("lütfen karenin kenar uzunluðunu giriniz :");
		double kenar=scan1.nextDouble();
		
		double kareAlani=kenar*kenar;
		
		System.out.println("karenin alaný :" +kareAlani );
		System.out.println(kenar*kenar);
		
//		lütfen karenin kenar uzunluðunu giriniz :46.5
//		karenin alaný :2162.25
//		2162.25
		
		
		
	}

}
