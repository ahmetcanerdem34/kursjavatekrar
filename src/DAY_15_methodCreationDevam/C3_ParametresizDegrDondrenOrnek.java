package DAY_15_methodCreationDevam;

public class C3_ParametresizDegrDondrenOrnek {

	public static void main(String[] args) {
		
		boolean durum=karsilastir();
		
		System.out.println("kar��la�t�rma durumu :" + durum);
		//kar��la�t�rma durumu :false
		//kar��la�t�rma durumu :true

	}
	
	public static boolean karsilastir() {//boolean t�r�nde sonu� d�necek
		
		
		int a =20;//10 ve 20 yi deneyelim
		int b=15;
		if(a>b) {
			
			return true;
			
		}else {
			
			return false;
		}
		
		
	}
	
	
}
