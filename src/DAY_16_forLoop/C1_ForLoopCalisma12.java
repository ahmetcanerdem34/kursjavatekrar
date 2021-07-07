package DAY_16_forLoop;

import java.util.Iterator;

public class C1_ForLoopCalisma12 {

	public static void main(String[] args) {
		

//      1 2 3 4 5 6
//       2 3 4 5 6
//        3 4 5 6
//         4 5 6
//          5 6
//           6
		
		
		for (int satir = 1; satir <=6; satir++) {//baba for
			
			for (int bosluk = 1; bosluk < satir; bosluk++) {//cocuk
				System.out.print(" ");
				
			}
			for (int rakam = satir; rakam <=6; rakam++) {//cocuk
				System.out.print(rakam +" ");
				
			}
			System.out.println();
		}
		
		
	}
	
	}
	
	


