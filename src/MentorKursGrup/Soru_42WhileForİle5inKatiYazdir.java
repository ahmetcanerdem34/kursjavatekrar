package MentorKursGrup;

public class Soru_42WhileForÝle5inKatiYazdir {

	public static void main(String[] args) {

		// 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz. hem
		// for-loop hem while-loop

		int basla = 8;
		int bitis = 180;

		for (int i = basla; i < bitis; i++) {

			if (i % 5 == 0) {

				System.out.print(i + " ");
				// 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 105 110 115 120 125
				// 130 135 140 145 150 155 160 165 170 175

			}

		}
		System.out.println("**************");

		while (basla < bitis) {

			if (basla % 5 == 0) {

				System.out.print(basla + " ");
                 //10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 
				// 105 110 115 120 125 130 135 140 145 150 155 160 165 170 175
			}
			basla++;
		}

	}

}
