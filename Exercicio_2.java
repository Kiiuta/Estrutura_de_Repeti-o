import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (Scanner leitor = new Scanner(System.in)) {
			int numero = 1;
			int digitado;
					        
			System.out.print("Digite um numero: ");
			digitado = leitor.nextInt();
			
				while ( numero <= digitado ){
				System.out.println(numero+"\n");
				numero++;
			
			
				}
		}
		
	}

}
