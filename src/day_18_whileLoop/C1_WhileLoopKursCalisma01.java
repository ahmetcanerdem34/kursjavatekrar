package day_18_whileLoop;

public class C1_WhileLoopKursCalisma01 {

	public static void main(String[] args) {
		
		// While : iken, oldugu surece
        // 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri 
        // aralarinda bir bosluk olacak sekilde yanyana yazdirin
        
        // once for loop ile yapalim
		
		
		for (int i = 10; i <30; i++) {
			
			if(i%4==0) {
				System.out.print(i+" ");
				//12 16 20 24 28 
			}
			
		}
		System.out.println();
		int toplam=0;
		int j = 10;
		
		while(j <30) {
			
			if(j%4==0) {
				
				toplam+=j;
			}
			
			j++;
		}
		System.out.println("4 ile bölünen ayýlarýn toplamý :"+toplam);
		//4 ile bölünen ayýlarýn toplamý :100
	}

}
