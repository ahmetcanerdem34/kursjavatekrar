package DAY_12;

import java.util.Scanner;

public class C2_ÝndexOf {

	public static void main(String[] args) {
	
		
		
		String str="java kod yazdýkça geliþir";
		
		System.out.println(str.indexOf('ç'));
		System.out.println(str.indexOf('þ'));
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('K'));
		System.out.println(str.indexOf("ko"));
		
//		15
//		22
//		0
//		-1--->olmayan index harfi için -1 verir
//		5
		
		System.out.println(str.indexOf('a', 4));
		//10--->4. indexten sonra 10. indexte a harfi var anlamýnda
	System.out.println("*************************************************");
		
		//kullanýcýdan bir cümle isteyin 
				//case sensitive olmadan java keliemsi olup olmadýðýný yazdýrýn
				
				
				
				Scanner sc=new Scanner (System.in);
				System.out.print("string giriniz :");
				String cumle=sc.nextLine().toLowerCase();
				
				System.out.println(cumle.indexOf("java"));//-->girilen cümlede java kelimesi var mý?
//				string giriniz :beyaz java
//				6--->6. index le beraber java baþlýyor j yi verdi yani
				
				int sonuc=cumle.indexOf("java");
				
				System.out.println(sonuc==-1 ? "java içermiyor" : "java içeriyor");
				
//				string giriniz :beyaz java
//				6
//				java içeriyor
				
				if(cumle.indexOf("java")>=0) {
					
					System.out.println("java içeriyor");
				}else {
					
					System.out.println("içermiyor");
//					
//					string giriniz :java güzel
//					0
//					java içeriyor
//					java içeriyor-->j nin index i 0 a eþit yada büyük olacak.. eþit
				}
	}

}
