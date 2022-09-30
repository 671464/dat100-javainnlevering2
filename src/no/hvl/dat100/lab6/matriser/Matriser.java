package no.hvl.dat100.lab6.matriser;

//Innlevering Fredrik Crook og Sara Hønsi

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		for (int[] rad: matrise) {
			for (int element: rad) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	// b) FERDIG
	public static String tilStreng(int[][] matrise) {

		String tekst = "";
		
		for (int[] rad: matrise) {
			for (int element: rad) {
				tekst = tekst + element + " ";
			}
			tekst = tekst + "\n";
		}
		
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int e = 0;
		int r = 0;

		for (int[] rad: matrise) {
			e=0;
			for (int element: rad) {
				e++;
			}
			r++;
		}
		
		//System.out.println(e);
		int[][] result = new int[r][e];
		for (int i = 0; i<r; i++) {
			for (int j = 0; j<e; j++) {
				result[i][j] = matrise[i][j]*tall;
			}
		}
		return result;
	}
		
		

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i<a.length; i++) {
			//loop elements in row
			for (int j = 0; j< a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
			
		}
		return true;
	}

		

	
	// e)
	public static int[][] speile(int[][] matrise) {
	
		int e = 0; int r = 0;
		// lage ny tabell med lik størrelse
		
		for (int[] rad: matrise) {
			e=0;
			for (int element: rad) {
				e++;
			}
			r++;
		}
		
		int[][] speil = new int[r][e];
		
		for (int i = 0; i<speil.length; i++) {
			//loop elements in row
			for (int j = 0; j< speil[i].length; j++) {
					speil[i][j] = matrise[j][i];
				
			}
		}
		return speil;		
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int ant_kolonne_a = a[0].length;
		int ant_rekke_a   = a.length;
		int ant_kolonne_b = b[0].length;
		int ant_rekke_b   = b.length;
		
		
		if (ant_kolonne_a != ant_kolonne_b) {
			System.out.println("Feil");
		}
		
		int[][] multitab = new int[ant_rekke_a][ant_kolonne_b]; 	// Lager en ny tabell som er har like mange rekker som lister i a, 
																	// og kolonner som elementer i B.
		
		for (int i = 0; i<ant_rekke_a; i++) {
			//loop elements in row
			for (int j = 0; j< a[i].length; j++) {
				for (int z = 0; z< a[i].length; z++) {
					multitab[i][j] += a[i][z]*b[z][j];
				}
			}
		}
		return multitab;

	}
}
	
