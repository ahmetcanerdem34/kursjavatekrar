package DAY_05_WrapperClass;

public class C2_Concatination {

	public static void main(String[] args) {
		
		
		String str1="java'ya yeni ba�lad�m, yapabilece�imi";
		String str2="d���n�yorum.";
		String str3=" ";//bu sat�r�n oldu�u yere +" "+ bu bo�lu�u da koyabiliriz..
		
		System.out.println(str1+str3+str2);
		//java'ya yeni ba�lad�m, yapabilece�imi d���n�yorum.
		
		
		
		int sayi1=5;
		int sayi2=4;
		//bunlar� kullanarak 9 yazd�rabilir misiniz
		
		System.out.println("yukardaki 2 int de�erin toplam� =" +sayi1+sayi2);//bu �ekilde yapmaz, yaz�ya say�lar� ba�lar parenteze al
		//yukardaki 2 int de�erin toplam� =54
		
		System.out.println("yukardaki 2 int de�erin toplam� ="+(sayi1+sayi2));//parentez �nemli
		//yukardaki 2 int de�erin toplam� =9
	
	
		System.out.println(str1+sayi1+str2+sayi2);
		//java'ya yeni ba�lad�m, yapabilece�imi5d���n�yorum.4
		
		System.out.println(str1+sayi1+sayi2);
		//java'ya yeni ba�lad�m, yapabilece�imi54
		
		System.out.println(sayi1+sayi2+str2);
		//9d���n�yorum.
		
		System.out.println("2 say�n�n ��karma i�lemi ="+(sayi1-sayi2));
		//2 say�n�n ��karma i�lemi =1
		
		System.out.println("2 say�n�n �arpma i�lemi ="+(sayi1*sayi2));
		//2 say�n�n �arpma i�lemi =20
		
		System.out.println("2 say�n�n b�lme i�lemi ="+(sayi1/sayi2));
		//2 say�n�n b�lme i�lemi =1
		
		
		String a="Ali";
		String b="Can";
		String c=" ";
		
		System.out.println(a+c+b);
		//Ali Can
		
		
		
	
	
	}
	
	

}
