import java.util.Scanner;

public class Exer4Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nome, nome1, nome2;
		String armz, chamada, chamada1;
		int armz1, armz2;
		int num1, num2;

		System.out.println(" Digite seu Estado");
		nome = teclado.nextLine();
		
		System.out.println(" Digite seu Estado");
		nome = teclado.nextLine();

		System.out.println(" Digite seu Municipio");
		nome1 = teclado.nextLine();

		System.out.println(" Digite sua cidade");
		nome2 = teclado.nextLine();

		System.out.println(" Digite sua idade");
		num1 = teclado.nextInt();

		System.out.println(" Digite o valor de sua renda");
		num2 = teclado.nextInt();

		armz = Nomes(nome);
		
		armz1 = NUMEROS(num1);
		
		armz2 = NUMERAIS(num2);
		
		chamada = Identação(nome1);
		
		chamada1 = Identação(nome2);
		
		System.out.println(" Voce mora no estado de " + armz+ " No municipio de "+chamada+" e na cidade de "+chamada1);
		
		System.out.println(" Sua idade e " + armz1+" e sua randa e de "+armz2);
	}

	public static String Nomes(String nome) {

		String receber;

		receber = (nome);

		return (receber);

	}

	public static String Identação(String nome1) {

		String receber;

		receber = (nome1);

		return (receber);

	}

	public static String Identificador(String nome2) {

		String receber;

		receber = (nome2);

		return (receber);

	}

	public static int NUMEROS(int num1) {

		int receber;

		receber = num1;

		return (receber);

	}

	public static int NUMERAIS(int num2) {

		int receber;

		receber = num2;

		return (receber);

	}
}
