package DAY_13_ContainsReplace;

public class C5_SubString {

	public static void main(String[] args) {
		
		//alt string diye d���nelim
				//bize verilen bir c�mleyle alakal� baz� yerlerini almam�z gerebilir
				
				
				String str="Ziya G�kalp Diayrbak�r �ermiklidir";
				
				//str �n son ilk on katakteri y�ld�z ile gizleyin, geriye kalanlar nomal yaz�ls�n
				//burada substring devreye girer 
				//10. harf ile 20. harfini alma
				
				str=str.substring(11);

				
				System.out.println("***********" + str);
				//*********** Diayrbak�r �ermiklidir
				
				System.out.println(str.replaceAll(str, str));
	}

}
