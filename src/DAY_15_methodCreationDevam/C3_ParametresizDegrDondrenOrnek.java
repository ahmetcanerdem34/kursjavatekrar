package DAY_15_methodCreationDevam;

public class C3_ParametresizDegrDondrenOrnek {

	public static void main(String[] args) {
		
		boolean durum=karsilastir();
		
		System.out.println("karşılaştırma durumu :" + durum);
		//karşılaştırma durumu :false
		//karşılaştırma durumu :true

	}
	
	public static boolean karsilastir() {//boolean türünde sonuç dönecek
		
		
		int a =20;//10 ve 20 yi deneyelim
		int b=15;
		if(a>b) {
			
			return true;
			
		}else {
			
			return false;
		}
		
		
	}
	
	
}
