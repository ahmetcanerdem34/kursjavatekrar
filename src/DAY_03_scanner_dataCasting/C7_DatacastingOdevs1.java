package DAY_03_scanner_dataCasting;

public class C7_DatacastingOdevs1 {

	public static void main(String[] args) {
		
		
		//soru 1: byte veri tipinde bi de�i�ken olu�turun short int float ve double tiplerinde d�i�ken olu�turarak widening yap�n

		
		
		byte n=12;
		
		short a=n;
		
		int b=a;
		
		long c=b;
		
		float d=c;
		
		double e=d;
		
		System.out.println(n);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
//		12
//		12
//		12
//		12
//		12.0
//		12.0

		System.out.println("***************************************************************");	
		
		//Soru 2: int veri turunde bir de�i�ken olu�turun ve ad�m ad�m narrowing yap�n
		
		
		int i= 225;
		
		short s=(short) i;
		
		byte y=(byte) i;
		System.out.println(i);
		System.out.println(s);
		System.out.println(y);
//		225
//		225
//		-31
		
		
		System.out.println("*********************************************************************");
		
		//soru 3: float data turunde bir variable olustur yazd�r
		
		
		float f=34.7f;
		
		System.out.println(f);
		//34.7

		
		System.out.println("*****************************************************************************");
		
		
		//soru 5: integer 2 say�y� birbirine boldurun
		
		
		int num1=90;
		int num2=53;
		
		int bolum=num1/num2;
		
		System.out.println("bolum sonucu :" +bolum);
		//bolum sonucu :1
		
		
		System.out.println("*****************************************************************************");
		
		//soru 6: int bir say�y� doble bir say�ya boldurun yazd�r�n
		
		
		int nu1=56;
		double nu2=2.4;
		
		double bolumu=nu1/nu2;
		
		System.out.println("iki say�n�n b�l�m�:" +bolumu);
		//iki say�n�n b�l�m�:23.333333333333336
		
		
		
		
		
		
		
		
		
	}

}
