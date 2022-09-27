package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		// TODO
//		throw new UnsupportedOperationException("skrivUt ikke implementert");
		
		for (int[] rad: matrise) {
			for (int element: rad) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	// b) FERDIG
	public static String tilStreng(int[][] matrise) {
		// TODO
//		throw new UnsupportedOperationException("tilStreng ikke implementert");
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
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");

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

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
