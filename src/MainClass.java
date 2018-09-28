import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		Scanner in = new Scanner(System.in);
		
		while (!exit) {
			
			System.out.println("> Ðàçìåðíîñòü ìàòðèöû >> (4;8)");
			System.out.println("> Âûõîä >> 0");
			System.out.print("\n  >> ");
			
			int size = 0;			
			
			try { 
				size = in.nextInt(); 
				
				if (size == 0) exit = true;
				else if (size < 4 || size > 8) throw new Exception();
				
			} catch (Exception e) { 
				System.out.println("\n> Íåâåðíûé ââîä, ïîæàëóéñòà, ââåäèòå ÷èñëî (4;8)\n");
				continue; 
			}
			
			if (!exit) {			
				System.out.println();
				
				System.out.println(">> ÌÀÒÐÈÖÀ ÑÌÅÆÍÎÑÒÈ >\n");
				boolean A[][] = Matrix.createBOOLEAN(size);
//				boolean A[][] = {{false, true, true, false, true, false}, 
//								 {false, true, false, false, true, false}, 
//								 {false, false, false, false, false, false}, 
//								 {false, false, true, false, false, false}, 
//								 {false, false, false, true, false, false}, 
//								 {true, false, false, false, true, true}};
		        Matrix.printBOOLEAN(A, 'x', 'x'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ÌÀÒÐÈÖÀ ÈÍÖÈÄÅÍÖÈÉ >\n");
		        boolean B[][] = Matrix.getIncidenceMatrix(A);		        
		        Matrix.printBOOLEAN(B, 'c', 'x'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ÒÅÎÐÅÒÈÊÎ-ÌÍÎÆÅÑÒÂÅÍÍÎÅ ÎÏÈÑÀÍÈÅ");
		        System.out.println("   (îïèñàíèå êàæäîé äóãè ïàðîé âåðøèí) >\n");
		        int Ñ[][] = Matrix.getDescription(B);		        
		        Matrix.printDescription(Ñ); 
		        System.out.println("\n\n");			
			} 
		}
		
		in.close();	
		
	}
	
	
	
	
	
	
	
	
}
