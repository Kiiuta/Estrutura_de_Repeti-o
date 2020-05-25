import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (Scanner leitor = new Scanner(System.in)) {
			int numero;
			int repeticoes = 1;
			
				do {
				System.out.printf("Digite 10 numeros aqui:\n%d° Numero: ", repeticoes);
				numero = leitor.nextInt();
				
				if (numero > 0) {
					System.out.printf("Numero positivo.\n");
				}
				else if (numero == 0) {
					System.out.printf("Numero neutro.\n");
				}
				else {
					System.out.printf("Numero negativo.\n");
				}
				
				repeticoes++;
				}while( repeticoes <= 10);
		}
		
		
		
		
		
	}

}
