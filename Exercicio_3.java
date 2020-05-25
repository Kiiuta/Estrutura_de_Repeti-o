import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner leitor = new Scanner(System.in);
			int contagem = 1;
			int valor;
			int soma = 0 , media;
			    
			System.out.println("Digite 20 numeros: ");
			
			do {
			System.out.printf("%d° numero:",contagem);
			    valor = leitor.nextInt();
			    	++contagem; 
			    soma = soma + valor;
			}
			         
			while (contagem <= 20);
			
			media = soma /20;
			System.out.println("Soma: /n" + soma);
		System.out.println ("Media: "+ media);
		
		
		
		
		
		
		
		
		
		
	}

}
