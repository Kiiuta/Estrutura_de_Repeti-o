import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner(System.in);
		int contagem = 1, maior = 0;
		int valor;
		
	        
	    System.out.println("Digite 15 numeros: ");
	    
	    do {
	    System.out.printf("%d° numero:",contagem);
	        valor = leitor.nextInt();
	        	++contagem; 
	        
	    if (valor > maior) {
	    maior = valor;
	    }
	    
	             
	    }while (contagem <= 15);
	   
	
	    System.out.println("\nMaior valor: " + maior);
		
		
		
		
	}

}
