import java.util.ArrayList;
import java.util.Random;

// создание матрицы с рандомными элементами 

public class Matrix {
	
	public static boolean[][] createBOOLEAN(int size) {
		
		boolean A[][] = new boolean[size][size];
		
		Random rnd = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				A[i][j] = rnd.nextBoolean();
		
		return A;
		
	}
		
	public static void printBOOLEAN(boolean A[][], char c) {
		
		System.out.print("        |");
		for (int i = 0; i < A[0].length; i++) {
			System.out.print(c + "(" + i + ") ");
		}
		System.out.println();
		
		System.out.print("        |ЧЧЧЧ");
		for (int i = 0; i < A[0].length - 1; i++) {
			System.out.print("ЧЧЧЧЧ");
		}
		System.out.println();

		for (int i = 0; i < A.length; i++) {
			System.out.print("   x(" + i + ") |");
			for (int j = 0; j < A[0].length; j++) {				
				if (A[i][j] == true) System.out.print("  " + 1 + " ");
					else System.out.print("  " + 0 + " ");
				if (j < A[0].length - 1) System.out.print(" ");	        				
			}			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
	private static int[][] booleanToInt(boolean A[][]) {
		
		int B[][] = new int[A.length][A.length];
		
		for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A.length; j++) 
				if (A[i][j]) B[i][j] = 1;
				else B[i][j] = 0;
		
		return B;
		
	}
	
	//---------------------------------------------------------//
	public static boolean[][] getIncidenceMatrix(boolean A[][]) {
		
		int num = 0; // число дуг
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A[0].length; j++) 
				if (A[i][j]) num++;
		
		boolean B[][] = new boolean[A.length][num];
		
		int k = 0;
		for (int i = 0; i < A.length; i++) {			
			k = 0;
			for (int j = 0; j < A[0].length; j++) 
				if (A[i][j]) {
					B[k][i] = true;
					B[k][j] = true;
					k++;
				}
		}
				
		return B;
		
	}
	
	public static boolean[][] getDescription(boolean A[][]) {
		
		boolean B[][] = new boolean[A.length][A.length];
		
		
		
		return B;
		
	}
	
}
