import java.util.Scanner;
public class treinos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado= new Scanner(System.in);
		
		
		int a , b,armz;
		
		
		System.out.println("Informe a base ");
		a=teclado.nextInt();
		
		System.out.println("Informe a altura ");
		b=teclado.nextInt();
		
		armz= Calculator(a,b);
		
		System.out.println(" Resultado cm     "+ armz);
		
		
	}

	public static int Calculator (int a, int b){
		return a*b;
	
	}
	// multiplicação
}
