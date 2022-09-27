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
		String result = "[";		
		for (int i = 0;i<tabell.length;i++) {
			result = result + tabell[i];
			if (i < tabell.length-1) {
				result = result + ",";
			}	
		}			
		
		return result + ("]");	//Returnerer [1,4,6]
	}
	

	// c) FERDIG
	public static int summer(int[] tabell) {
		int sum_tall = 0; int i = 0;
		
		//sum med vanlig for løkke
		for (int j = 0; j<tabell.length; j++ ) {
			int tall = tabell[j];
			sum_tall += tall;	
		}
		
		sum_tall = 0;
		//sum med while løkke		
		while (i<tabell.length) {
			int tall = tabell[i];
			sum_tall += tall;
			i++;
			}
			
		sum_tall = 0;
		//sum med utvidet for løkke
		for (int tall: tabell) {
			sum_tall +=  tall;
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

	// e) FERDIG
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
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

	// g) - FERDIG
	public static boolean erSortert(int[] tabell) {
		
		for (int i = 0; i<tabell.length-1; i++)
			if (tabell[i+1] < tabell[i]) {
				return false;
			}
		
		return true;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");

		int tab_lengde = tabell1.length + tabell2.length;

		int [] tab2 = new int [tab_lengde];
		int teller = 0;


		// LEGGER TABELL 1 til i tab2
		for (int i = 0; i < tabell1.length; i++) {
			tab2[teller] = tabell1[i];
			teller++;
		}
		
		// LEGGER TABELL 2 til i tab2
		for (int i = 0; i < tabell2.length; i++) {
			tab2[teller] = tabell2[i];
			teller++;
		}

		return tab2;
		
	}
}
