package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma05_gunayy�l {
public static void main(String[] args) {
	
	
	  /*
    Kullan�c�dan bir tarihi g�n, ay ve y�l �eklinde al�p bu tarihi
    ay, g�n, y�l ve y�l, ay, g�n s�ralar�na �evirerek yazan bir kod yaz�n�z.

    �rnek Ekran ��kt�s�
    L�tfen g�n� giriniz: 10
    L�tfen ay� giriniz: 02
    L�tfen y�l� giriniz: 2009
    G�n ay y�l: 10.02.2009
    Ay g�n y�l: 02.10.2009
    Y�l ay g�n: 2009.02.10
    */
	
	Scanner scan = new Scanner(System.in);
	System.out.print("g�n giriniz :");
	int gun=scan.nextInt();
	System.out.println("ay giriniz :");
	int ay=scan.nextInt();
	System.out.println("y�l giriniz :");
	int yil=scan.nextInt();
	
	if(gun>0 && gun<=31) {
		
		System.out.println(gun);
	}else {
		System.out.println("yanl�� giri� yapt�n�z, program sonlan�yor");
		
	}
	
	if(ay>0 && ay<=12) {
		
		System.out.println(ay);
	}else {
		System.out.println("yanl�� girdiniz program sonlan�yor");
		return;
	}
	
	if (yil>0) {
		
		System.out.println(yil);
	}else {
		System.out.println("yanl�� giri� yapt�n�z");
		return;
	}
	System.out.println("ay/g�n/y�l:" +ay+"/"+gun+"/"+yil);
	
//	g�n giriniz :5
//	ay giriniz :
//	7
//	y�l giriniz :
//	2019
//	5
//	7
//	2019
//	ay/g�n/y�l:7/5/2019
	
//	g�n giriniz :4
//	ay giriniz :
//	12
//	y�l giriniz :
//	2018
//	4
//	12
//	2018
//	ay/g�n/y�l:12/4/2018
	
	
	
}
}








