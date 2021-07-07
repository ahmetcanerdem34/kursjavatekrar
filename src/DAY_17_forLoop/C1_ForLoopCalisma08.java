package DAY_17_forLoop;

public class C1_ForLoopCalisma08 {

	public static void main(String[] args) {
		
		// 50'den buyuk 150'den kucuk olan tamsayilardan
        // 7 ile tam bolunebilenleri toplayip
        // sonucu yazdiran bir kod yaziniz
		
		int toplam=0;
		for (int i = 50; i < 150; i++) {
			
			if(i%7==0) {
				
				toplam=toplam+i;			
				
			}
			
		}
		System.out.println("girlen sayýlar arasýndaki sayýlardan 7 ile tam bölünnenlerin toplamý :"+toplam);
		//girlen sayýlar arasýndaki sayýlardan 7 ile tam bölünnenlerin toplamý :1421
	}

}
