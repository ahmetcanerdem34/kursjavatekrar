package DAY_12;

import java.util.Scanner;

public class C2_�ndexOf {

	public static void main(String[] args) {
	
		
		
		String str="java kod yazd�k�a geli�ir";
		
		System.out.println(str.indexOf('�'));
		System.out.println(str.indexOf('�'));
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('K'));
		System.out.println(str.indexOf("ko"));
		
//		15
//		22
//		0
//		-1--->olmayan index harfi i�in -1 verir
//		5
		
		System.out.println(str.indexOf('a', 4));
		//10--->4. indexten sonra 10. indexte a harfi var anlam�nda
	System.out.println("*************************************************");
		
		//kullan�c�dan bir c�mle isteyin 
				//case sensitive olmadan java keliemsi olup olmad���n� yazd�r�n
				
				
				
				Scanner sc=new Scanner (System.in);
				System.out.print("string giriniz :");
				String cumle=sc.nextLine().toLowerCase();
				
				System.out.println(cumle.indexOf("java"));//-->girilen c�mlede java kelimesi var m�?
//				string giriniz :beyaz java
//				6--->6. index le beraber java ba�l�yor j yi verdi yani
				
				int sonuc=cumle.indexOf("java");
				
				System.out.println(sonuc==-1 ? "java i�ermiyor" : "java i�eriyor");
				
//				string giriniz :beyaz java
//				6
//				java i�eriyor
				
				if(cumle.indexOf("java")>=0) {
					
					System.out.println("java i�eriyor");
				}else {
					
					System.out.println("i�ermiyor");
//					
//					string giriniz :java g�zel
//					0
//					java i�eriyor
//					java i�eriyor-->j nin index i 0 a e�it yada b�y�k olacak.. e�it
				}
	}

}
