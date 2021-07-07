package DAY_03_scanner_dataCasting;

public class C4_DataCasting {

	public static void main(String[] args) {
	
		
		//byte veri tipinde bir degisken olusturun, short,int,float ve double data 
		
		byte numByte=23;
		
		short numShort=numByte;
		
		int numİnt=numShort;
		
		long numLong=numİnt;
		
		float numFloat=numLong;
		
		double numDouble=numFloat;
		
		
		System.out.println(numByte);
		System.out.println(numShort);
		System.out.println(numLong);
		System.out.println(numİnt);
		System.out.println(numFloat);
		System.out.println(numDouble);
		
//		23
//		23
//		23
//		23
//		23.0
//		23.0
		
		
		//int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		
		int num=5;
		
		short num1=(short) num;
		
		byte num2=(byte) num1;

		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		
//		5
//		5
//		5
		
//		Float data turunde bir variable olusturun ve yazdirin
		
		
		float num4=35.56f;
		
		System.out.println("sonuç :"+num4);
//		sonuç :35.56
		
//		 double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte cevirip yazdirin
		
		double sayi= 255.36;
		
		int sayi1= (int) sayi;
		
		byte sayi2=(byte) sayi1;
		
		System.out.println(sayi2);
//		-1
		
		
//		int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		
		
		int number1=54;
		int number2=4;
		System.out.println("2 int değerin bölümü :" +number1/number2);
//		2 int değerin bölümü :13
		
		
//		int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		
		
		int number3=5;
		double number4=66.4;
		
		System.out.println("sonuç :"+number3/number4 );
//		sonuç :0.0753012048192771
		

		
		

		

	}

}
