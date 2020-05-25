import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int contagem= 1;
		float maior1= 0;
		float maior2= 250;
		float altura;
		double salario; 
		double soma= 0;
		double media;
		int contagemsexo= 0 ;
		char sexo; 
		
		Scanner leitor = new Scanner(System.in);
		
System.out.println("Cadastro de empregados");
do {
	System.out.printf("%d° pessoa(s)\n",contagem);
	
	System.out.print("Altura: ");
		altura = leitor.nextFloat();
		
	System.out.print("Sexo(M/F): ");
		sexo = leitor.next().charAt(0);
		
	System.out.print("Salario: ");
		salario = leitor.nextDouble();
		System.out.print("\n");
		contagem++;
		media = soma + salario/20;
	
	if(altura > maior1) {
		maior1 = altura;}
	
	else if(altura < maior2) {
		maior2 = altura;}
	
	if(salario <= 1000 && sexo == 'f' ) {
		contagemsexo = contagemsexo + 1;}
	
	
	}while (contagem <=20);
		
System.out.println("Media salarial: R$"+media);
System.out.println("Maior altura: "+maior1+"m."+"\nMenor altura: "
+ maior2+"m.");
System.out.println("Mulheres com salario ate R$1.000,00: "+contagemsexo+
" mulheres.");

		
		
		
		
		
		
		
	}

}
