/* Crie um programa em Java para receber um n�mero entre 1 e 12 e imprimir o nome
do m�s correspondente (em que, 1 � Janeiro e 12 � Dezembro). Crie um m�todo em
Java que dever� receber o n�mero e realizar a impress�o. */

import java.util.Scanner;


class verifica{	
	public void verificaNum(){

		Scanner n = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um numero entre 1 e 12: ");
		num = n.nextInt();

	// Verifica o num correspondente ao m�s
	switch(num){
		case 1:
                	System.out.println("Janeiro");
                	break;
            	case 2:
               		System.out.println("Fevereiro");
                	break;
            	case 3:
                	System.out.println("Mar�o");
                	break;
            	case 4:
                	System.out.println("Abril");
                	break;
                case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;

            	default:
                	System.out.println("Digite SOMENTE n�meros entre 1 e 12");
                	break;
		}
	}
}


//m�todo principal
class Q5{
	public static void main(String[] args){
		verifica a = new verifica();
		a.verificaNum();
		}
}
