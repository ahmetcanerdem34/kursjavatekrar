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
		System.out.println("girlen say�lar aras�ndaki say�lardan 7 ile tam b�l�nnenlerin toplam� :"+toplam);
		//girlen say�lar aras�ndaki say�lardan 7 ile tam b�l�nnenlerin toplam� :1421
	}

}
