package day_18_whileLoop;

public class C1_WhileLoopKursCalisma02 {

	public static void main(String[] args) {

		// 3 basamaklý sayýlardan 15 20 ve 90 a tam bölünenleri yazdýrýnýz

		for (int i = 100; i < 1000; i++) {

			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.print(i + " ");
				//180 360 540 720 900 
			}

		}
		System.out.println();
		System.out.println("********************");
		int k = 100;
		int top = 0;

		while (k < 1000) {

			if (k % 15 == 0 && k % 20 == 0 && k % 90 == 0) {
				top += top + k;

			}

			k++;
		}
		System.out.print(k + " ");
		// 1000

	}
}