package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsm024_methodlu {
	
	public static void main(String[] args) {
		
		  /*
	       Girilen pozitif bir sayýnýn tam kare olup olmadýðýný bulunuz,
	       tamkare ise true  deðilse false yazdýrýnýz.

	        Not: sqrt gibi fonksiyonlarý  kullanmayýn.

	        Example 1:
	        Input: 16
	        Output: true
	        Not: bu sayý tamkare çünkü 4*4 = 16

	        Example 2:
	        Input: 25
	        Output: true
	        Note: bu sayý tamkare çünkü 5*5=25


	        Example 3:
	        Input: 14
	        Output: false

	     */
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen pozitif bir sayý giriniz : ");
        int input = scanner.nextInt();
        
        
        
        double a=1;
        
        if(Math.pow(input, 1/2)==a) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
//        lütfen pozitif bir sayý giriniz : 7
//        true

		
	}

}
