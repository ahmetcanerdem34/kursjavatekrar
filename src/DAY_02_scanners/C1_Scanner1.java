package DAY_02_scanners;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("l�tfen 100'den k���k pozitif tam say� giriniz :");
		int sayi=scan.nextInt();
		
		System.out.println("girilen pozitif tamsay� de�eri :"+sayi);

//		l�tfen 100'den k���k pozitif tam say� giriniz :389
//		girilen pozitif tamsay� de�eri :389
		
		
		
		System.out.println("*******************************************");
		
		Scanner scan1=new Scanner (System.in);
		System.out.print("l�tfen karenin kenar uzunlu�unu giriniz :");
		double kenar=scan1.nextDouble();
		
		double kareAlani=kenar*kenar;
		
		System.out.println("karenin alan� :" +kareAlani );
		System.out.println(kenar*kenar);
		
//		l�tfen karenin kenar uzunlu�unu giriniz :46.5
//		karenin alan� :2162.25
//		2162.25
		
		
		
	}

}
