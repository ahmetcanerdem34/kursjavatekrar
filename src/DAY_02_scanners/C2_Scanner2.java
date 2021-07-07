package DAY_02_scanners;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("alanýný hesaplamak için dairenin yarýçapýný giriniz :");
		double ycapi=scan.nextDouble();
		
		double yacapi=3.14*ycapi*ycapi;
		
		System.out.println("dairenin alaný:"+yacapi);
		System.out.println("dairenin alaný :" + 3.14*ycapi*ycapi);
		
//		alanýný hesaplamak için dairenin yarýçapýný giriniz :45.6
//		dairenin alaný:6529.1904
//		dairenin alaný :6529.1904
		
		

		
	}

}
