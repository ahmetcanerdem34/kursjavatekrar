package DAY_10_swich;

import java.util.Scanner;

public class C1_SoruCevap03 {

	public static void main(String[] args) {
		
		 // Girilen bir sayýnýn onlar basamaðýnýn rakam deðerini yazý ile yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz :");
		int sayi = scan.nextInt();
		
		int onlar=(sayi/10)%10;

		switch(onlar){
		
		case 0 : System.out.println("onlar basamaðý sýfýr"); break;
		case 1 : System.out.println("onlar basamaðý bir"); break;
		case 2 : System.out.println("onlar basamaðý iki"); break;
		case 3 : System.out.println("onlar basamaðý üç"); break;
		case 4 : System.out.println("onlar basamaðý dört"); break;
		case 5 : System.out.println("onlar basamaðý beþ"); break;
		case 6 : System.out.println("onlar basamaðý altý"); break;
		case 7 : System.out.println("onlar basamaðý yedi"); break;
		case 8 : System.out.println("onlar basamaðý sekiz"); break;
		case 9 : System.out.println("onlar basamaðý dokuz"); break;
		
		
		}
		
		
		
		}

	}


