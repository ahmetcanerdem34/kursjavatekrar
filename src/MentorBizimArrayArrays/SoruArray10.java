package MentorBizimArrayArrays;

import java.util.Scanner;

public class SoruArray10 {

	public static void main(String[] args) {
		
		
		  // Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		
		int arr[]= new int[8];
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < arr.length; i++) {//8 e e�it yukrda))
			System.out.println(i+". say�y� giriniz ");
			
			arr[i]=scan.nextInt();
			
		}
		int count =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%3==0) {
				count++;
			}
		}
		System.out.println("3 ile b�l�nen say� :" + count);
//		0. say�y� giriniz 
//		3
//		1. say�y� giriniz 
//		4
//		2. say�y� giriniz 
//		3
//		3. say�y� giriniz 
//		0
//		4. say�y� giriniz 
//		5
//		5. say�y� giriniz 
//		4
//		6. say�y� giriniz 
//		-23
//		7. say�y� giriniz 
//		21
//		3 ile b�l�nen say� :4
	}

}
