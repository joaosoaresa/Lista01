*/ 7. Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme
a seguinte faixa:


Nota        Conceito
0 a 49      Insuficiente
50 a 64     Regular
65 a 84     Bom
85 a 100    Ótimo
*/

import java.util.Scanner;

class Q7{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		float n;
		System.out.println("Informe a nota do aluno: ");
		n = ler.nextFloat();

		if((n>0) && (n <= 49)){
			System.out.println("Insuficiente");
		}else if((n >= 50) && (n <= 64)){
			System.out.println("Regular");
		}else if((n >= 65) && (n <= 84)){
			System.out.println("Bom");
		}else if((n >= 85) && (n <= 100)){
			System.out.println("Ótimo");
		}
	}
}