package DAY_13_ContainsReplace;

public class C5_SubString {

	public static void main(String[] args) {
		
		//alt string diye düþünelim
				//bize verilen bir cümleyle alakalý bazý yerlerini almamýz gerebilir
				
				
				String str="Ziya Gökalp Diayrbakýr Çermiklidir";
				
				//str ýn son ilk on katakteri yýldýz ile gizleyin, geriye kalanlar nomal yazýlsýn
				//burada substring devreye girer 
				//10. harf ile 20. harfini alma
				
				str=str.substring(11);

				
				System.out.println("***********" + str);
				//*********** Diayrbakýr Çermiklidir
				
				System.out.println(str.replaceAll(str, str));
	}

}
