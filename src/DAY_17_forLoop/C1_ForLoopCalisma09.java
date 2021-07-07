package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma09 {

	public static void main(String[] args) {
		
		/*	
		Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
        */
		
		Scanner scan=new Scanner (System.in);
		System.out.print("100 den aþaðý pozitif tamsayý griniz :");
		int girilensayi=scan.nextInt();
		
		
		for (int i = 1; i < girilensayi; i++) {
			
			if(i%15==0) {
				
				System.out.println("Java Guzeldir");
			}else if(i%5==0) {
				System.out.println("güzeldir");
			}else if(i%3==0) {
				System.out.println("java");
			}else {
				System.out.println(i);
scan.close();
//				100 den aþaðý pozitif tamsayý griniz :35
//				1
//				2
//				java
//				4
//				güzeldir
//				java
//				7
//				8
//				java
//				güzeldir
//				11
//				java
//				13
//				14
//				Java Guzeldir
//				16
//				17
//				java
//				19
//				güzeldir
//				java
//				22
//				23
//				java
//				güzeldir
//				26
//				java
//				28
//				29
//				Java Guzeldir
//				31
//				32
//				java
//				34

			}
			
		}

	}

}
