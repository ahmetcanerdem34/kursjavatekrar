package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoruArrayList16_02 {

	public static void main(String[] args) {
		
		
		/*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz ve kalanlarý yeni listeye ekleyizin
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
		
		List<String> liste = new ArrayList(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		List<String> yeniListe= new ArrayList<>();
		
		for (String each : liste) {//foe each de istediðimiz ismi verip listeye gidip o isimle bakabiliyoruz
			
			if(each.toLowerCase().contains("a")) {
				
				continue;
			}else {
				
				yeniListe.add(each);
			}
			
		}
		System.out.println(yeniListe);
		//[Veli, Omer]
		
		//2. yol lampda
				boolean list=  liste.removeIf(t->t.toLowerCase().contains("a"));
				  if (list) System.out.println(yeniListe);
	}

}
