package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma18_methodlu {

	public static void main(String[] args) {
		
		
		  // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
	
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        
        String terstenCumle ="";//istenen þeyin tanýmlamk için yaptýk, hiçlikle

        
        for (int i = cumle.length()-1; i >= 0; i--) {//ayse 
        	terstenCumle+=cumle.charAt(i);
        	
        	
        	  	
		}
        System.out.println(terstenCumle);
	
		
		
	
	if(cumle.equals(terstenCumle)) {
		
		System.out.println("cumle polidrome");
	}else {
		System.out.println("cumle polidrome deðil");
	
	}
}
}
