/* Fa�a um programa Java que leia um n�mero e divida-o por dois (sucessivamente)
at� que o resultado seja menor que 1. Mostre o resultado da �ltima divis�o e a
quantidade de divis�es efetuadas.
*/

import java.util.Scanner;

class Q10{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	
	float div=0, n,contDivisor = 0;
	
	System.out.println("Informe um num: ");
	n = ler.nextFloat();

	while(n >= 1){
		div = n/2;
		n = div;
		contDivisor++;
	}
	System.out.println("Quantidade de div: \n"+contDivisor+"\nNum:\n"+n);
						


	}
}