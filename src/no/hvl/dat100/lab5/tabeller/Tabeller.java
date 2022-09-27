package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a) - fullført
	public static void skrivUt(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		
		System.out.print("[ ");			
		for (int i = 0;i<tabell.length;i++) {
			System.out.print(tabell[i] + " ");
		}			
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
		
	}

	// c) mangler metode med utvidet for-løkke
	public static int summer(int[] tabell) {
		int sum_tall = 0; int i = 0;
		//sum med vanlig for løkke
		
		/*for (int j = 0; j<tabell.length; j++ ) {
			int tall = tabell[j];
			sum_tall = sum_tall + tall;	
		}
		*/
		
		//sum med while løkke		
		/*while (i<tabell.length) {
			int tall = tabell[i];
			sum_tall = sum_tall+tall;
			i++;
			}
		*/	
		
		//sum med utvidet for løkke
		for (int tall: tabell) {
			sum_tall = sum_tall + tall;
		}		
			
		return sum_tall;	
		
	}

	// d) - Fullført
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
		int a = 0;
		boolean funnet = false;
		
		while (!funnet && (a < tabell.length)) {
			if (tall == tabell[a]) {
				funnet = true;
			}
			a++;
		}
		
		return funnet;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f) - Fullført
	public static int[] reverser(int[] tabell) {
		int[]tab = new int [tabell.length];
		//lese en forløkke "baklengs i--;
		int j = 0; int i = tabell.length-1;
		while (i>=0) {
			tab[j] = tabell[i];
			i--; j++;		
		}
		return tab;
	}

	// g) - Fullført, tror ihvertfall det
	public static boolean erSortert(int[] tabell) {
		
		//deklareringer av variabler
		boolean sortert = false;
		int pos_1; int pos_2; 
		int i = 0; int j = 1;
		
		// for alle tabeller lengre enn én
		if(tabell.length > 1) { 
			//løkke for å sammenligne verdier plass for plass
			do {
				pos_1 = tabell[i];
				pos_2 = tabell[j];
				i++; j++;						
				
			} while (pos_1 < pos_2 && j < (tabell.length));
			
			//sjekker om tabeller er sann	
			if (j == (tabell.length) && pos_1 < pos_2) {
				sortert = true;
			}		
		}
		
		else sortert = true; //tabeller kortere enn 2 vil alltid være sortert
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");

		int tab_lengde = tabell1.length + tabell2.length;
		int [] tab = new int [tab_lengde];
		int j = 0;
		
		
		for (int i = 0; i < tab.length; i++) {
			while(i < tabell1.length) {
				tab[i] = tabell1[i];
				i++;
			}
			while(i>= tabell1.length && i<tab.length) {
				tab[i]= tabell2[j];
				i++; j++;
			}			
			
		}
		
		return tab;
		
	}
}
