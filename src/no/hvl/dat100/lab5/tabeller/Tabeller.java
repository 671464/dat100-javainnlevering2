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
		
<<<<<<< HEAD
		
=======
		return result + ("]");	//Returnerer [1,4,6]
>>>>>>> branch 'master' of https://github.com/671464/dat100-javainnlevering2.git
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

<<<<<<< HEAD
	// g) - Fullført, tror ihvertfall det
=======
	// g) - FERDIG
>>>>>>> branch 'master' of https://github.com/671464/dat100-javainnlevering2.git
	public static boolean erSortert(int[] tabell) {
<<<<<<< HEAD
		
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
=======
//		boolean sortert = false;
//		int pos_1; int pos_2; 
//		int i = 0; 
//		int j = 1;
//		
//		//en for/while løkke som kjører tall for tall
//		//en if setning som endrer til true hvis sann for alle
//		do {
//			pos_1 = tabell[i];
//			pos_2 = tabell[j];
//			i++;
//			j++;
//			
//		} while (pos_1 < pos_2);
//			if (j==tabell.length) {
//				sortert = true;
//			}
//			
//		
//		return sortert;
		for (int i = 0; i<tabell.length-1; i++)
			if (tabell[i+1] < tabell[i]) {
				return false;
			}
		return true;
>>>>>>> branch 'master' of https://github.com/671464/dat100-javainnlevering2.git
		
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");

		int tab_lengde = tabell1.length + tabell2.length;
<<<<<<< HEAD
		int [] tab = new int [tab_lengde];
		int j = 0;
=======
		int [] tab2 = new int [tab_lengde];
		int teller = 0;
>>>>>>> branch 'master' of https://github.com/671464/dat100-javainnlevering2.git
		
<<<<<<< HEAD
		
		for (int i = 0; i < tab.length; i++) {
			while(i < tabell1.length) {
				tab[i] = tabell1[i];
				i++;
			}
			while(i>= tabell1.length && i<tab.length) {
				tab[i]= tabell2[j];
				i++; j++;
			}			
			
=======
		// LEGGER TABELL 1 til i tab2
		for (int i = 0; i < tabell1.length; i++) {
			tab2[teller] = tabell1[i];
			teller++;
		}
		// LEGGER TABELL 2 til i tab2
		for (int i = 0; i < tabell2.length; i++) {
			tab2[teller] = tabell2[i];
			teller++;
>>>>>>> branch 'master' of https://github.com/671464/dat100-javainnlevering2.git
		}
		

//		for (int i = 0; i < tab2.length; i++) {
//			while(i < tabell1.length) {
//				tab2[i] = tabell1[i];
//				i++;
		
		return tab2;
		
	}
}
