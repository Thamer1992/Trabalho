import java.util.Scanner;
public class Exer3Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado= new Scanner(System.in);
		
		int num1,num2;
		int armz;
		System.out.println("Digite um numero");
		num1=teclado.nextInt();
		
		System.out.println("Digite outro");
		num2=teclado.nextInt();
		
		
		
		armz=SOMA(num1,num2);
		
		
		System.out.println(" Resultado soma   "+armz);
		
	}

	private static int SOMA(int num1, int num2) {
		
		int resultado;
		
		resultado= num1+num2;
		
		return resultado;
		
	}

}
