package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sm024_methodlu {
	
	public static void main(String[] args) {
		
		  /*
	       Girilen pozitif bir say�n�n tam kare olup olmad���n� bulunuz,
	       tamkare ise true  de�ilse false yazd�r�n�z.

	        Not: sqrt gibi fonksiyonlar�  kullanmay�n.

	        Example 1:
	        Input: 16
	        Output: true
	        Not: bu say� tamkare ��nk� 4*4 = 16

	        Example 2:
	        Input: 25
	        Output: true
	        Note: bu say� tamkare ��nk� 5*5=25


	        Example 3:
	        Input: 14
	        Output: false

	     */
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("l�tfen pozitif bir say� giriniz : ");
        int input = scanner.nextInt();
        
        
        
        double a=1;
        
        if(Math.pow(input, 1/2)==a) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
//        l�tfen pozitif bir say� giriniz : 7
//        true

		
	}

}
