package DAY_02_scanners;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("alan�n� hesaplamak i�in dairenin yar��ap�n� giriniz :");
		double ycapi=scan.nextDouble();
		
		double yacapi=3.14*ycapi*ycapi;
		
		System.out.println("dairenin alan�:"+yacapi);
		System.out.println("dairenin alan� :" + 3.14*ycapi*ycapi);
		
//		alan�n� hesaplamak i�in dairenin yar��ap�n� giriniz :45.6
//		dairenin alan�:6529.1904
//		dairenin alan� :6529.1904
		
		

		
	}

}
