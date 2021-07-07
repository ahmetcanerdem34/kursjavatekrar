package DAY_16_forLoop;

public class C1_ForLoopCalisma07 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        þeklini yazdýrýnýz.
        */
		int harf=65;
		
		for (int i = 0; i <= 5; i++) {
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print((char)(harf + j) +" ");
				
			}
			System.out.println();
			
		}
		
		

	}

}
