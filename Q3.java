/* O sistema de avalia��o de determinada disciplina, � composto por tr�s provas. A
primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Fa�a um
programa em Java para calcular a m�dia final de um aluno desta disciplina. */

import java.util.Scanner;

class Q3{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int quant_prova = 3;

		float media;
		for(int i=0; i<quant_prova ; i++){
			System.out.println("Informe a nota: ");
			float nota1 = ler.nextFloat();
			
			System.out.println("Informe a nota: ");
			float nota2= ler.nextFloat();
			
			System.out.println("Informe a nota: ");
			float nota3 = ler.nextFloat();

			
			
			media = (nota1*2+nota2*3+nota3*5);

		}
		
				
	}		
}