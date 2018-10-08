import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		Scanner in = new Scanner(System.in);
		
		while (!exit) {
			
			System.out.println("> ����������� ������� >> (4;8)");
			System.out.println("> ����� >> 0");
			System.out.print("\n  >> ");
			
			int size = 0;			
			
			try { 
				size = in.nextInt(); 
				
				if (size == 0) exit = true;
				else if (size < 4 || size > 8) throw new Exception();
				
			} catch (Exception e) { 
				System.out.println("\n> �������� ����, ����������, ������� ����� (4;8)\n");
				continue; 
			}
			
			if (!exit) {			
				System.out.println();
				
				System.out.println(">> ������� ��������� >\n");
				boolean A[][] = Matrix.createBOOLEAN(size);
		        Matrix.printBOOLEAN(A, 'x', 'x'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ������� ���������� >\n");
		        boolean B[][] = Matrix.getIncidenceMatrix(A);		        
		        Matrix.printBOOLEAN(B, 'c', 'x'); 
		        System.out.println("\n");
		        
		        System.out.println(">> ���������-������������� ��������");
		        System.out.println("   (�������� ������ ���� ����� ������) >\n");
		        int �[][] = Matrix.getDescription(B);		        
		        Matrix.printDescription(�); 
		        System.out.println("\n\n");			
			} 
		}
		
		in.close();	
		
	}
	
	
	
	
	
	
	
	
}
