package DAY_16_forLoop;

public class C1_ForLoopCalisma14 {

	public static void main(String[] args) {
	
//      1
//      2 6
//      3 7 10
//      4 8 11 13
//      5 9 12 14 15
		
		
		for (int i = 1; i <=5; i++) {//satýr tanýmladýk
			int sayi=i;
			
		for (int j = 1; j <=i; j++) {//sutunu tanýmladýk
			System.out.print(sayi+" ");
			
			sayi=sayi+(5-j);
		}
		System.out.println();
	}
	}
}

