package MentorKursGrup;

import java.util.Scanner;

public class Soru_23KredikartýRakamKontrol {

	public static void main(String[] args) {
		
		//Kullanicidan kredi karti numarasini alin ve bu numaranin ucuncu, dorduncu ve sonuncu
		//rakamlarini ekrana yazdirin.


		
		Scanner scan = new Scanner(System.in);
		System.out.println("16 numaralýkredi nonuzu giriniz :");
		String kredi= scan.next();
		
		
		String krediKarti=kredi.substring(2,3)+kredi.substring(3, 4)+kredi.substring(11);
		
		System.out.println(krediKarti);

	}

}
