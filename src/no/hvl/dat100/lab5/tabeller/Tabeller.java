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

	// c) 2/3 Fullført
	public static int summer(int[] tabell) {
		int sum_tall = 0; int i = 0;
		//sum med vanlig for løkke
		/*
		for (int i=0; i<tabell.length; i++ ) {
			int tall = tabell[i];
			sum_tall = sum_tall + tall;	
		}*/
		
		//sum med while løkke
		
		while (i<tabell.length) {
			int tall = tabell[i];
			sum_tall = sum_tall+tall;
			i++;
			}
		
		// TODO sum med utvidet for løkke
		
			
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

	// g) - FEIL
	public static boolean erSortert(int[] tabell) {
		boolean sortert = false;
		int pos_1; int pos_2; 
		int i = 0; 
		int j = 1;
		
		//en for/while løkke som kjører tall for tall
		//en if setning som endrer til true hvis sann for alle
		do {
			pos_1 = tabell[i];
			pos_2 = tabell[j];
			i++;
			j++;
			
		} while (pos_1 < pos_2);
			if (j==tabell.length) {
				sortert = true;
			}

		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");

		int tab_lengde = tabell1.length + tabell2.length;
		int [] tab = new int [tab_lengde];
		//int t = 0;
		

		for (int i = 0; i < tab.length; i++) {
			while(i < tabell1.length) {
				tab[i] = tabell1[i];
				i++;
			}

				
			
			
		}
		
		return tab;
		
	}
}
