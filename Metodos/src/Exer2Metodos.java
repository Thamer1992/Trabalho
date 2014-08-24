import java.util.Scanner;
public class Exer2Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado= new Scanner(System.in);
		
		String pedido;
		int armz;
		
		System.out.println(" Digite uma palavra ");
		pedido=teclado.nextLine();
		
		armz=Contar2(pedido);
		
		System.out.println("QUANTIDADE DE CARACTERES ENCONTTRADOS   "+armz);
		
		
	}
       
	 public static  int Contar2(String pedido){
		 
		 int src;
		 
		 src= pedido.length();
		 
		 return src;
		 
		 
		 // contando caractees de um texto //
	 }
	
	
	
	
}
