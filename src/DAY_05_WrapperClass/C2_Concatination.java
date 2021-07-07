package DAY_05_WrapperClass;

public class C2_Concatination {

	public static void main(String[] args) {
		
		
		String str1="java'ya yeni baþladým, yapabileceðimi";
		String str2="düþünüyorum.";
		String str3=" ";//bu satýrýn olduðu yere +" "+ bu boþluðu da koyabiliriz..
		
		System.out.println(str1+str3+str2);
		//java'ya yeni baþladým, yapabileceðimi düþünüyorum.
		
		
		
		int sayi1=5;
		int sayi2=4;
		//bunlarý kullanarak 9 yazdýrabilir misiniz
		
		System.out.println("yukardaki 2 int deðerin toplamý =" +sayi1+sayi2);//bu þekilde yapmaz, yazýya sayýlarý baðlar parenteze al
		//yukardaki 2 int deðerin toplamý =54
		
		System.out.println("yukardaki 2 int deðerin toplamý ="+(sayi1+sayi2));//parentez önemli
		//yukardaki 2 int deðerin toplamý =9
	
	
		System.out.println(str1+sayi1+str2+sayi2);
		//java'ya yeni baþladým, yapabileceðimi5düþünüyorum.4
		
		System.out.println(str1+sayi1+sayi2);
		//java'ya yeni baþladým, yapabileceðimi54
		
		System.out.println(sayi1+sayi2+str2);
		//9düþünüyorum.
		
		System.out.println("2 sayýnýn çýkarma iþlemi ="+(sayi1-sayi2));
		//2 sayýnýn çýkarma iþlemi =1
		
		System.out.println("2 sayýnýn çarpma iþlemi ="+(sayi1*sayi2));
		//2 sayýnýn çarpma iþlemi =20
		
		System.out.println("2 sayýnýn bölme iþlemi ="+(sayi1/sayi2));
		//2 sayýnýn bölme iþlemi =1
		
		
		String a="Ali";
		String b="Can";
		String c=" ";
		
		System.out.println(a+c+b);
		//Ali Can
		
		
		
	
	
	}
	
	

}
