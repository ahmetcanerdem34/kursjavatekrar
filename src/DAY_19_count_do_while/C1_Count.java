package DAY_19_count_do_while;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		
		
				//count tek tek sayar
				//flag boolean gibi var yok anlam�na gelir
				
				//kullan�c�dan 1 bir c�mle ve harf isteyin
				//while loop kullanrak istenen harf ka� kez kullan�lm�� yazd�r�n
				//case sensetive olsun
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("bir c�mle giriniz :");
		String cumle=scan.nextLine();
		System.out.println("bir harf giriniz :");
		String harf=scan.next().substring(0, 1);
		
		
		int count=0;
		int index=0;
		
		while(index<cumle.length()) {
			
			if(cumle.substring(index, index+1).equals(harf)) {
				count++;
				
			}
			index++;
		}
		System.out.println("cumlede"+" "+ harf+" "+ "harfi"+" "+ count+" "+ "kere kulan�lm��");
		
//		bir c�mle giriniz :m�sl�m baba vazge�ilmezlerimizdendir
//		bir harf giriniz :
//		i
//		cumlede i harfi 4 kere kulan�lm��
		
		scan.close();

	}

}
