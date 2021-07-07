package MentorKursGrup;

public class Soru_35While3ten13eKadarYazdir {

	public static void main(String[] args) {
		
		
		// While loop kullanarak 3 den 13 e kadar tum tek tamsayýlarý ekrana yazdýrýnýz.  while-loop
		
		
		int baslangic =3;
		
			while(baslangic<13) {
				
				if(baslangic%2!=0) {
					
					System.out.print(baslangic+",");
					//3,5,7,9,11,
				}
				baslangic++;
			}
	}

}
