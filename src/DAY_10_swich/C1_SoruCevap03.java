package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap03 {

	public static void main(String[] args) {
		
		 // Girilen bir say�n�n onlar basama��n�n rakam de�erini yaz� ile yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("say� giriniz :");
		int sayi = scan.nextInt();
		
		int onlar=(sayi/10)%10;

		switch(onlar){
		
		case 0 : System.out.println("onlar basama�� s�f�r"); break;
		case 1 : System.out.println("onlar basama�� bir"); break;
		case 2 : System.out.println("onlar basama�� iki"); break;
		case 3 : System.out.println("onlar basama�� ��"); break;
		case 4 : System.out.println("onlar basama�� d�rt"); break;
		case 5 : System.out.println("onlar basama�� be�"); break;
		case 6 : System.out.println("onlar basama�� alt�"); break;
		case 7 : System.out.println("onlar basama�� yedi"); break;
		case 8 : System.out.println("onlar basama�� sekiz"); break;
		case 9 : System.out.println("onlar basama�� dokuz"); break;
		
		
		}
		
		
		
		}

	}


