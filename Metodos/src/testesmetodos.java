import java.util.Scanner;
public class testesmetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado= new Scanner (System.in);

	String nome;
	int armz;
	
	System.out.println("Informe seu nome ");
	nome=teclado.nextLine();
	
	armz=Contar(nome);
	
	System.out.println(" Resultado     "+ armz);
	}

	public static int Contar (String nome){
	int str;
		str=(nome.length());
		
		
		return str;
		
		// entrar com o nome e contar os seus caracteres
	
	}
	
}
