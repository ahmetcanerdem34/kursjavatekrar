package DAY_10_swich;

import java.util.Scanner;

public class c14_Banka�slemi {

	public static void main(String[] args) {

		/*
		 * 1. i�lem bak�ye ��renme 2.i�lem para yet�rma 3.i�lem para �ekme 4.i�lem ��k��
		 */
		

		System.out.print("yapaca��n�z i�lemi se�iniz : ");

		String islemler = "1.i�lem bak�ye ��renme\r\n" + "		2.i�lem para yet�rma \r\n"
				+ "		3.i�lem para �ekme\r\n" + "		4.i�lem ��k��";
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.println(islemler);
		int bakiye = 5000;

		switch (num) {

		case 1:
			System.out.println("bakiyeniz: " + " " + bakiye);
			break;
		case 2:
			System.out.println("yat�rmk istedi�iniz tutar :");
			int tutar1 = scan.nextInt();
			System.out.println("yeni bakiyeneiz :" + bakiye + tutar1);
			break;

		case 3:
			System.out.println("�ekmek istedi�iniz tutar :");
			int tutar2 = scan.nextInt();

			if (tutar2 > bakiye) {

				System.out.println("bakiye yetersiz");
			} else {

				System.out.println("kalan bakiyeniz :" + (bakiye - tutar2));

			}
			break;

		case 4:
			System.out.println("��k�� i�lemi yap�l�yor");
			break;

		default:
			System.out.println("hatal� i�lem girdiniz");
			break;

		}

	}

}
