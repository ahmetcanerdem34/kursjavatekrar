package DAY_10_swich;

public class C1_SoruCevap05 {

	public static void main(String[] args) {
	
		
		   // Bugüne göre 100 gün sonra hangi gün olduðunuz yazdýrýnýz.
		
		//perþembe
		
		int suankiGun=100%7;//2 kalacaðý için case de 2. olan gündür
	
		 switch (suankiGun) {
         case 0:
             System.out.println("perþembe");
             break;
         case 1:
             System.out.println("cuma");
             break;
         case 2:
             System.out.println("cumartesi");
             break;
         case 3:
             System.out.println("pazar");
             break;
         case 4:
             System.out.println("pazartesi");
             break;
         case 5:
             System.out.println("salý");
             break;
         case 6:
             System.out.println("çarþamba");
             break;
     }
			
		

	}

}
