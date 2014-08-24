import java.util.Scanner;
public class Exer1Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		String nome;
		
		int armz;
		System.out.println("DIGITE SEU NOME");
		nome=teclado.nextLine();
		
		armz=Contador(nome);
		
		
		System.out.println(" SEU NOME TEM "+armz+" CARACTERES");
		
		
	}

	public static int Contador(String nome){
	
		int contar;
		
		contar=nome.length();
		
		return contar;
		
	}
	
	//Contar caracteres do nome //
}
