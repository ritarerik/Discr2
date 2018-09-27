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
		        Matrix.printBOOLEAN(A, 'x'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ÌÀÒÐÈÖÀ ÈÍÖÅÄÅÍÒÍÎÑÒÈ >\n");
		        boolean B[][] = Matrix.getIncidenceMatrix(A);		        
		        Matrix.printBOOLEAN(B, 'c'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ÒÅÎÐÅÒÈÊÎ-ÌÍÎÆÅÑÒÂÅÍÍÎÅ ÎÏÈÑÀÍÈÅ >\n");
		        boolean Ñ[][] = Matrix.getDescription(B);		        
		        Matrix.printBOOLEAN(Ñ, 'x'); 
		        System.out.println("\n\n");			
			} 
		}
		
		in.close();	
		
	}
	
	
	
	
	
	
	
	
}
