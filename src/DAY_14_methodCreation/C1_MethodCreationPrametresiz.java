package DAY_14_methodCreation;

public class C1_MethodCreationPrametresiz {

	public static void main(String[] args) {
		
		yazdir();//yazd�m ve a�a��daki i�lemi buraya �a��rd�m
//		merhaba
//		ferhat
//		nas�ls�n
//		iyimisin
		
		
		System.out.println("*************");
		
		yazdir();//tekrar �a���r�yorum
		
//		*************
//		merhaba
//		ferhat
//		nas�ls�n
//		iyimisin

			System.out.println("**************");
			
			//tekrar yazd�r�yorum
			
			yazdir();
			
//			**************
//			merhaba
//			ferhat
//			nas�ls�n
//			iyimisin
			
			System.out.println("************************");


		for (int i = 0; i < 3; i++) {
			
			yazdir();//yazd�r methodu 3 defa �al��s�n ve her defas�nda 1 bo�luk b�raks�n
			System.out.println("***************");
			
//			************************
//			merhaba
//			ferhat
//			nas�ls�n
//			iyimisin
//			***************
//			merhaba
//			ferhat
//			nas�ls�n
//			iyimisin
//			***************
//			merhaba
//			ferhat
//			nas�ls�n
//			iyimisin
//			***************
		}

	}
	
	//void demek de�er d�ndermeyen metod=DE�ER D�NDERMEYEN NEDEMEK
	//method sonucunda i�lem  sonu� �retmiyorsa buna void denir
	
	//parametresiz yapal�m, yani method i�i bo�
	
	public static void yazdir() {//yukar� gidip bu isimle main methodu i�inde �a�rmal�y�m
		
		System.out.println("merhaba");
		System.out.println("ferhat");
		System.out.println("nas�ls�n");
		System.out.println("iyimisin");
		
		//buray� bu �ekilde �al��t�r�sam sonu� ��kmaz
		//��nk� methodlar main methodud i�inde �al���r
		
		
		
	}
	

}
