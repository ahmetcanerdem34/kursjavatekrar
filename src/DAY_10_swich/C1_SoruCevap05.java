package DAY_10_swich;

public class C1_SoruCevap05 {

	public static void main(String[] args) {
	
		
		   // Bug�ne g�re 100 g�n sonra hangi g�n oldu�unuz yazd�r�n�z.
		
		//per�embe
		
		int suankiGun=100%7;//2 kalaca�� i�in case de 2. olan g�nd�r
	
		 switch (suankiGun) {
         case 0:
             System.out.println("per�embe");
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
             System.out.println("sal�");
             break;
         case 6:
             System.out.println("�ar�amba");
             break;
     }
			
		

	}

}
