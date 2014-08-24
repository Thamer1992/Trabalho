import java.util.Scanner;

public class treino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arm;
		
		arm=VerificadorPar();
		
		System.out.println( arm);
	}

	public static int VerificadorPar() {

		
		Scanner teclado = new Scanner(System.in);

		int a;   
		System.out.println("Digite um numero");
		a = teclado.nextInt();
          if (a % 2 == 0) {
			
        	  System.out.println( "par");
			
		} if (a % 2 != 0) {
			
			System.out.println("impar");
			
		}
          
		return a; 
	
// verificação de par ou impar
	}

}
