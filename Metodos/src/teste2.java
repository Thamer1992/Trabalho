import java.util.Scanner;
public class teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		String nome;
		String penultimonome;
		String antepenultimonome;
		String ultimo;
		String armz;
		
		System.out.println("Informe seu nome ");
		nome=teclado.nextLine();
		
		
		System.out.println("Informe seu penultimo nome ");
		penultimonome=teclado.nextLine();
	
	
		System.out.println("Informe seu  ante penultimo nome ");
		antepenultimonome=teclado.nextLine();

		System.out.println("Informe seu  ultimo nome ");
		ultimo=teclado.nextLine();
		
		armz=juntando(nome,penultimonome,antepenultimonome,ultimo);
	
		System.out.println("Seu nome completo e "+armz);
	}
	
	

	public static String juntando(String nome,String penultimonome,	String ultimo,String antepenultimonome){
		
		return  nome+ penultimonome + antepenultimonome+ultimo;
		
		// escrever o nome completo
		
		
		
	}
	
	
	
}
